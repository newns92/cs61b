package week1;

public class Dog {
    // instance variable (property of current class)
    public int weightInPounds;
    // static variable for all instances of Dog class
    public static String binoem = "Canis familiaras";
    
    /** One line constructor (determines how to instantiate the class) */
    public Dog(int w) {
        weightInPounds = w;
    }

    // non-static (instance) method
    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yipyipyip!");
        }
        else if (weightInPounds < 30) {
            System.out.println("bark. bark.");
        }
        else {
            System.out.println("Woof!");
        }
    }

    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.weightInPounds > d2.weightInPounds) {
            return d1;
        }
        return d2;
    } 

    // NON-static version
    public Dog maxDog(Dog d2) {
        if (this.weightInPounds > d2.weightInPounds) {
            return this;
        }
        return d2;
    } 
}