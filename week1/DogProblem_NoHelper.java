package week1;
public class DogProblem_NoHelper {
    public static Dog[] largerThanFourNeighbors(Dog[] dogs) {
        // return dogs;

        boolean largest = true;
        for (int i = 0; i < dogs.length; i++) {
            for (int j = -2; j <= 2; j++) {
                if (i + j < 0) {
                    continue; // too early
                }
                if (i + j >= dogs.length) {
                    break; // at end of array
                }
                if (j == 0) {
                    continue;
                }
                
                Dog neighborDog = dogs[i + j];

                if (neighborDog.weightInPounds >= dogs[i].weightInPounds) {
                    largest = false;
                }
            }
        }
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
