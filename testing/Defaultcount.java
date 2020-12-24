package testing;

public class Defaultcount extends Actor {

    @Override
    public int Increase() {
        return count++;
    }

    @Override
    public int decrease() {
        return count - 1;
    }

}
