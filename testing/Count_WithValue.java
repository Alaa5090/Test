package testing;

public class Count_WithValue extends Actor {

    private int value;

    //constructor
    public Count_WithValue(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int Increase() {
        count = value++;
        return count;

    }

    @Override
    public int decrease() {
        count = value - 1;
        return count;
    }

}
