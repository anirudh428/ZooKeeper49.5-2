public class Tiger extends Feline
{
    public Tiger(String food, boolean nocturnal, double avgLifeSpan)
    {
        super(food, nocturnal, avgLifeSpan); 
        talk = "Trumpet";

    }
    public void huntAlone()
    {
        System.out.println("The Tiger likes to hunt alone for its prey"); 
    }
    public void swim()
    {
        System.out.println("The tiger likes to swim in the water to cool off"); 
    }
    
}
