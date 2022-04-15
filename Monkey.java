/*
 * Activity 4.9.2
 */

public class Monkey extends Primate 
{
    public Monkey(String food, boolean nocturnal, double avgLifeSpan)
    {
        super(food, nocturnal, avgLifeSpan);
        talk = "hoot hoot";

    }
    public void climb() {
        System.out.println("The monkey climbs.");
    }

    public void hoot() {
        System.out.println("The monkey hoots.");
    }

    public void howl() {
        System.out.println("The monkey howls.");
    }
 
}