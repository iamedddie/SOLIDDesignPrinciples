package birds;

class Goose extends Bird implements Prey {
    @Override
    public void flee() {
        System.out.println("Swimming......");
    }

    @Override
    public void eat() {
        System.out.println("eats plants");

    }
    @Override
    public String toString() {
        return "Goose";
    }

}
