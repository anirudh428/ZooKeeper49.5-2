public class Lion extends Feline
{
    public Lion(String food, boolean nocturnal, double avgLifeSpan)
    {
        super(food, nocturnal, avgLifeSpan);
        talk = "roar"; 
    }
    public void huntInPack()
    {
        System.out.println("The lion likes to hunt in a pack"); 
    }
}
