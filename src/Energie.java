import greenfoot.*;

/**
 * Repraesentiert Energie-Pickups im Spiel.
 */
public class Energie extends Actor {
    private String typ;

    public Energie() {
        this.typ = "Standard";
    }

    public Energie(String typ) {
        this.typ = typ;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }
}
