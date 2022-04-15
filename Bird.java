public class Bird extends Animal
{
    public Bird(String food, boolean nocturnal, double avgLifeSpan)
    {
        super(food, nocturnal, avgLifeSpan);
        System.out.println("A new bird has arrived"); 
    }
    public void fly()
    {
        System.out.println("This bird has began to fly"); 
    }
    
}
