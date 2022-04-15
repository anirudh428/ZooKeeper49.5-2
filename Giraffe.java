/*
 * Activity 4.9.2
 */
public class Giraffe extends Hooved 
{
    public Giraffe(String food, boolean nocturnal, double avgLifeSpan)
    {
        super(food, nocturnal, avgLifeSpan);
    }
    public void hum() {
        System.out.println("The giraffe hums.");
    }
}