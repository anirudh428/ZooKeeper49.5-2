/*
 * Activity 4.9.2
 */
public class Deer extends Hooved 
{
    public Deer(String food, boolean nocturnal, double avgLifeSpan)
    {
        super(food, nocturnal, avgLifeSpan);
    }
    public void grunt() {
        System.out.println("The deer grunts.");
    }
}