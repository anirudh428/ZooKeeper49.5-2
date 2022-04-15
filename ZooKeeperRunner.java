/*
 * Activity 4.9.2
 */
import java.util.ArrayList; 
public class ZooKeeperRunner 
{

    public static void main(String[] args) 
    {
        
        // testing for elephant 
        Animal elephant = new Elephant("leaves, grasses, roots", false, 60.0); 

        // testing for new tiger 
        Animal tiger = new Tiger("meat", true, 17.0); 
        Animal gorilla = new Gorilla("leaves", false, 20.0); 
        // A
        Animal giraffe = new Giraffe("twigs", false, 12.0); 
        // methods 
        Animal penguin = new Penguin("tuna", false, 7.0);
        Animal owl = new Owl("rodents", true, 5.0);
        Animal monkey = new Monkey("leaves", false, 10.0); 
        Animal lion = new Lion("meat", false, 20.0); 
        Animal hippo = new Hippo("meat", false, 30.0); 
        /*
        ArrayList<Animal> zoo = new ArrayList<>(); 
        zoo.add(tiger); 
        zoo.add(gorilla); 
        zoo.add(giraffe);
        zoo.add(penguin);
        zoo.add(owl); 
        zoo.add(hippo);
        zoo.add(elephant);
        zoo.add(monkey); 
        zoo.add(lion);
        for (Animal animal : zoo)
        {
            System.out.println(animal.speak()); 
        }
        */
        System.out.println(hearTheAnimal(lion)); 
        System.out.println(hearTheAnimal(owl));
        System.out.println(hearTheAnimal(hippo));
        System.out.println(hearTheAnimal(penguin));
        System.out.println(hearTheAnimal(monkey));
        System.out.println(hearTheAnimal(gorilla));
        System.out.println(hearTheAnimal(tiger));
        System.out.println(hearTheAnimal(giraffe));
        System.out.println(hearTheAnimal(elephant));

    }
    public static String hearTheAnimal(Animal animal)
    {
        return "The sound is " + animal.speak(); 
    }
}