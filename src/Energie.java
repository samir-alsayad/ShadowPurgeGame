import greenfoot.*;

/**
 * Energie-Klasse (z.B. Licht-Partikel).
 */
public class Energie extends Actor {
    private String typ;

    public Energie() {
        this.typ = "Licht-Partikel";
    }

    public Energie(String typ) {
        this.typ = typ;
    }
    
    public void act() {
        // Animation oder Bewegung?
    }

    // Getter und Setter
    public String getTyp() { return typ; }
    public void setTyp(String typ) { this.typ = typ; }
}
