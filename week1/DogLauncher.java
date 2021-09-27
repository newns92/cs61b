package week1;

public class DogLauncher {
    public static void main(String[] args) {
        // declare a dog variable
        Dog smallDog;

        // instantiate dog class as a Dog object
        new Dog(20);

        // instantiation and assignment (to an already declared variable)
        smallDog = new Dog(5);

        // declaration, instantiation, + assignment
        Dog hugeDog = new Dog(150);
        
        // declaration, instantiation, + assignment
        Dog d = new Dog(15);

        // invocations of makeNoise method
        d.makeNoise();
        smallDog.makeNoise();
        hugeDog.makeNoise();
        
        System.out.println();

        /** Example of static method (invoked via the class) */
        Dog d1 = new Dog(51);
        Dog d2 = new Dog(100);
        Dog bigger = Dog.maxDog(d1, d2);
        bigger.makeNoise();

        // NON-static version
        Dog bigger2 = d1.maxDog(d2);
        bigger2.makeNoise();

        // System.out.println(d.binoem);
        // System.out.println(d2.binoem);
        System.out.println(Dog.binoem); // best form to use class name for a static variable invocation
    }
}
