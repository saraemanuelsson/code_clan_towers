public class Booking {
    private Bedroom bedroom;
    private int nightsBooked;

    public Booking(Bedroom bedroom, int nightsBooked) {
        this.bedroom = bedroom;
        this.nightsBooked = nightsBooked;
    }

    public Bedroom getRoom() {
        return this.bedroom;
    }

    public int getNightsBooked(){
        return this.nightsBooked;
    }
}
