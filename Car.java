// Crée une classe Car qui étend la classe Vehicle
public class Car extends Vehicle {
    public Car(String brand){
        super (brand);
    }

    // Ajoute dans Car et Boat une implémentation du corps de la méthode doStuff(). Pour Car, tu devras retourner "Je suis {brand} et je fais vroum vroum !"
    @Override
    public String doStuff() {
        return "Je suis "+this.getBrand()+ " et je fais vroumm !";
    } 
    }



