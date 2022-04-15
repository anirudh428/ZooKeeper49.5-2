/*
 * Activity 4.9.2
 */
public class Primate extends Animal 
{
    public Primate(String food, boolean nocturnal, double avgLifeSpan)
    {
        super(food, nocturnal, avgLifeSpan);
    }
    public void forage() {
        System.out.println("The primate forages for food.");
    }
}