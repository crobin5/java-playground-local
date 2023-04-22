public class Main {
    public static void main(String[] args) {
        Cat coco = new Cat("coco", 3);
        Dog max = new Dog("max", 5, "chris");
        Rabbit charlie = new Rabbit("charlie", 1, "red");
        Toy robot = new Toy("robot");
        Toy lego = new Toy("lego");

        Action[] homeFriends = new Action[4];
        homeFriends[0] = coco;
        homeFriends[1] = max;
        homeFriends[2] = charlie;
        homeFriends[3] = robot;

        // 19

        for (Action friend : homeFriends) {
            friend.play();
            friend.play(lego);
        }
    }
}
