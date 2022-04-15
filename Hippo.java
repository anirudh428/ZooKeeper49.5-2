/*
 * Activity 4.9.2
 */
public class Hippo extends Hooved
{
  public Hippo(String food, boolean nocturnal, double avgLifeSpan)
  {
    super(food, nocturnal, avgLifeSpan);
    talk = "growl"; 
  }
  public void groan()
  {
    System.out.println("The hippo groans.");
  }
}