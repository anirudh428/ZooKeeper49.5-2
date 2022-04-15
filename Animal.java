/*
 * Activity 4.9.2
 */
public class Animal {
    public String talk = "im an animal"; 
    private String food;
    private boolean nocturnal;
    private double aveLifeSpan;
    
    public Animal(String food, boolean nocturnal, double avgLifeSpan)
    {
        this.food = food; 
        this.aveLifeSpan = avgLifeSpan; 
        this.nocturnal = nocturnal; 
    }

    public void eat() {
        System.out.println("This animal's diet consists of " + food + ".");
    }

    public void isNocturnal() {
        if (nocturnal)
            System.out.println("This animal is active at night.");
        else
            System.out.println("This animal is active during the day.");
    }

    public void getLifeSpan() {
        System.out.println("This animal's life span is " + aveLifeSpan + " years.");
    }
    //
    public String speak()
    {
        return talk; 
    }
}