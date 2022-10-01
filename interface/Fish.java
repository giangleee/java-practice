public class Fish implements Prey, Predator {

    @Override
    public void hunt() {
        System.out.println("This fish is hunt");
        
    }

    @Override
    public void flee() {
        System.out.println("This fish is flee");
        
    }
    
}
