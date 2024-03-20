public class Zumbi {

    //Class members
    int life;
    String name;
    Boolean bald;
    float height;
    int strength;

    //Methods
    void start(){
        life = 100;
        name = "Halbert";
        height = 1.50F;
        strength = 99992;
        bald = true;
    }
    void walk(){
        System.out.println("Zumbi walking...");
    }

    void eat(){
        System.out.println("Zumbi eating...");
    }
}
