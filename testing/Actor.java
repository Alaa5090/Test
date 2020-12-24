package testing;

public abstract class Actor {

    private int id;
    private String name;
    public static int count;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//increase method***
    public abstract int Increase();

//decrease method 
    public abstract int decrease();

}
