public class Main {
    public static void main(String[] args) {

        Zumbi zumbi = new Zumbi();

        Zumbi zoombie = new Zumbi();

        zoombie.name = "Gang";

        zumbi.strength = 100;
        zumbi.life = 240;
        zumbi.height = 1.70f;
        zumbi.name = "Danny";
        zumbi.bald = false;

        System.out.println("The zoombie's name is: "+zumbi.name);
        System.out.println(("The other zoombie's name is: "+zoombie.name));

        zumbi.start();
        zumbi.walk();
        zumbi.eat();

        System.out.println("The zoombie's name is now: "+zumbi.name);
    }
}