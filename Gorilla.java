/*
 * Activity 4.9.2
 */
public class Gorilla extends Primate 
{
    public Gorilla(String food, boolean nocturnal, double avgLifeSpan)
    {
        super(food, nocturnal, avgLifeSpan);
        System.out.println("A new gorilla has arrived"); 
        talk = "dum dum"; 
    }
    public void grunt() {
        System.out.println("The gorilla grunts.");
    }

}