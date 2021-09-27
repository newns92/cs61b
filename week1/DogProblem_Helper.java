package week1;
public class DogProblem_Helper {
    public static Dog[] largerThanFourNeighbors(Dog[] dogs) {
        // return dogs;

        Dog[] returnDogs = new Dog[dogs.length];

        int cnt = 0;

        for (int i = 0; i < dogs.length; i++) {
            if (isBiggestOfFour(dogs, i)) {
                returnDogs[cnt] = dogs[i];
                cnt += 1;
            }
        }

        returnDogs = arrayWithNoNulls(returnDogs, cnt);

        return returnDogs;
    }

    /** cnt is the number of non-null items */
    public static Dog[] arrayWithNoNulls(Dog[] dogs, int cnt) {
        Dog[] noNullDogs = new Dog[cnt];
        for (int i = 0; i < cnt; i++) {
            noNullDogs[i] = dogs[i];
        }
        return noNullDogs;
    }

    /** Returns true if dogs[i] is larger than its 4 neighbors */
    public static boolean isBiggestOfFour(Dog[] dogs, int i) {
        boolean isBiggest = true;

        for (int j = -2; j <= 2; j++) {
            int compareIndex = i + j;

            if (j == 0) { // don't compare with self
                continue;
            }

            if (validIndex(dogs, compareIndex)) {
                if (dogs[compareIndex].weightInPounds >= dogs[i].weightInPounds) {
                    isBiggest = false;
                }
            }
        }
        return isBiggest;
    }

    public static boolean validIndex(Dog[] dogs, int i) {
        if (i < 0) {
            return false;
        }
        if (i >= dogs.length) {
            return false;
        }
        return true; // ELSE
    }

    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{
            new Dog(10),
            new Dog(15),
            new Dog(20),
            new Dog(15),
            new Dog(10),
            new Dog(5),
            new Dog(10),
            new Dog(15),
            new Dog(22),
            new Dog(20)
        };

        Dog[] bigDogs1 = largerThanFourNeighbors(dogs);

        for (int i = 0; i < bigDogs1.length; i++) {
            System.out.print(bigDogs1[i].weightInPounds + " ");
        }
        System.out.println();
    }

}
