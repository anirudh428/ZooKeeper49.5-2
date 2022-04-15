/*
 * Activity 4.9.2
 */
public class Hooved extends Animal 
{
    public Hooved(String food, boolean nocturnal, double avgLifeSpan)
    {
        super(food, nocturnal, avgLifeSpan);
    }
    public void forage() {
        System.out.println("The hooved animal forages for food.");
    }
}