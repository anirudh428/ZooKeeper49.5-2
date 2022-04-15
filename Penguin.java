public class Penguin extends Bird
{
    public Penguin(String food, boolean nocturnal, double avgLifeSpan)
    {
        super(food, nocturnal, avgLifeSpan);
        System.out.println("A new penguin has arrived in the house baby cakes"); 
        talk = "bleep bleep"; 
    }
    public void fish()
    {
        System.out.println("The penguin is fishing"); 
    }

}
