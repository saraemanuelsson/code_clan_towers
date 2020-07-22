public class Bedroom extends Room {
    private char type;

    public Bedroom(String name, int capacity, int rate, char type) {
        super(name, capacity, rate);
        this.type = type;
    }

    public char getType(){
        return this.type;
    }
}
