package birds;

public class Chicken extends Bird implements Prey,Predator{
    @Override
    public void eat() {
        System.out.println("eats insects......");

    }
    @Override
    public void hunt() {
        System.out.println("Hunting for a roach......");
    }

    @Override
    public void flee() {
        System.out.println("Running......");
    }
    @Override
    public String toString() {
        return "Chicken";
    }
}
