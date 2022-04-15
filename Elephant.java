public class Elephant extends Animal 
{
    public Elephant(String food, boolean nocturnal, double avgLifeSpan)
    {
        super(food, nocturnal, avgLifeSpan); 
        talk = "trumpet"; 
        System.out.println("A new elephant has arrived"); 

    }
    public void trumpet()
    {
        System.out.println("The elephant trumpets loudly"); 
    }
    public void forage()
    {
        System.out.println("The elephant forages for its food"); 
    }
}
