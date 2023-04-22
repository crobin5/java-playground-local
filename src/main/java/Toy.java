public class Toy implements Action{
    private String name;

    public Toy(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Toy " + name + " waddles back and forth.");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("Toy " + name + " is happy to see the other toy " + toy + ".");
    }

    @Override
    public String toString() {
        return name;
    }
}
