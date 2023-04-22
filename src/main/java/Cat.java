public class Cat extends Animal{
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void play() {
        System.out.println("Cat " + name + " jumps on table.");
    }
    @Override
    public void play(Toy toy) {
        System.out.println("Cat " + name + " plays with the toy " + toy + ".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
