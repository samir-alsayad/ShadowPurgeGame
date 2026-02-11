import greenfoot.*;

/**
 * Die Spielwelt fuer Shadow Purge.
 */
public class Karte extends World {
    private String name;
    private int ebene;
    
    // Referenzen auf andere Objekte gemaess OOD
    private Spieler spieler;
    private Gegner gegner; // OOD sagt singular, aber in Greenfoot sind es meist viele
    private Level level;

    public Karte() {
        // Standard-Groesse fuer Greenfoot-Welten (600x400)
        super(800, 600, 1);
    }

    public Karte(String name) {
        super(800, 600, 1);
        this.name = name;
    }

    // Getter und Setter gemaess OOD
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEbene() {
        return ebene;
    }

    public void setEbene(int ebene) {
        this.ebene = ebene;
    }

    public Spieler getSpieler() {
        return spieler;
    }

    public void setSpieler(Spieler spieler) {
        this.spieler = spieler;
        addObject(spieler, 400, 300); // Beispielposition
    }

    public Gegner getGegner() {
        return gegner;
    }

    public void setGegner(Gegner gegner) {
        this.gegner = gegner;
        addObject(gegner, 100, 100); // Beispielposition
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
