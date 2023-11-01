package birds;

class Hawk extends Bird implements Predator {
    @Override
    public void hunt() {
        System.out.println("Hunting birds & rodents......");
    }


    @Override
    public void eat() {
        System.out.println("eats birds......");

    }
    @Override
    public String toString() {
        return "Hawk";
    }
}
