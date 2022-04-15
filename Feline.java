public class Feline extends Animal
{
    public Feline(String food, boolean nocturnal, double avgLifeSpan)
    {
        super(food, nocturnal, avgLifeSpan); 
        System.out.println("A new feline has arrived"); 

    }
    public void roar()
    {
        System.out.println("The feline roars at its prey");
    }
    public void growl()
    {
        System.out.println("The feline growls at its pack"); 
    }

}
