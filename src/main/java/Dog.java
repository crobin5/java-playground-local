public class Dog extends Animal{
    private String owner;

    public Dog(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    @Override
    public void play() {
        System.out.println("Dog " + name + " chases their tail.");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("Dog " + name + " chews on toy the " + toy + ".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
