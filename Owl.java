public class Owl extends Bird
{
    public Owl(String food, boolean nocturnal, double avgLifeSpan)
    {
        super(food, nocturnal, avgLifeSpan);
        talk = "hoot hoot"; 
    }
    public void hunt()
    {
        System.out.println("The owl is hunting!"); 
    }


    
}
