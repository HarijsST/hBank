package done.funcionalInterface;

public class Dog implements HasSound {

    @Override
    public void doSound() {
        System.out.println("Wof, wof");
    }
}
