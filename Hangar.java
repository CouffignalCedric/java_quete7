// Crée une classe Hangar qui possédera une méthode main()
public class Hangar {
    public static void main(String[] args) {
        Boat titanic =  new Boat("Titanic");
        Car dedeuch = new Car("Dedeuch");

        System.out.println(titanic.doStuff());
        System.out.println(dedeuch.doStuff());
    }
    
}
