public class Rabbit extends Animal{
    private String eyeColor;

    public Rabbit(String name, int age, String owner) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void play() {
        System.out.println("Rabbit " + name + " hops around.");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("Rabbit " + name + " ignores the toy " + toy + ".");
    }

    public String getName() {
        return name;
    }
}
