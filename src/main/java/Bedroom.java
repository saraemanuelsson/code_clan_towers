public class Bedroom extends Room {
    private char type;

    public Bedroom(String name, int capacity, char type) {
        super(name, capacity);
        this.type = type;
    }

    public char getType(){
        return this.type;
    }
}
