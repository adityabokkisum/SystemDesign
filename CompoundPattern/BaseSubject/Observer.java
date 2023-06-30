package CompoundPattern.BaseSubject;

public class Observer implements BaseObserver{
    @Override
    public void update() {
        System.out.println("I have observed Quacking of the ducks");
    }
}
