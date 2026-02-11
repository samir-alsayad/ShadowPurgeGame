import greenfoot.*;

/**
 * Der Spieler-Charakter (Lumis).
 */
public class Spieler extends Actor {
    private String name;
    private int lebenspunkte;
    private int magiepunkte;
    
    // Assoziationen
    private Gegner gegner;
    private Waffe waffe;
    private Energie energie;

    public Spieler() {
        this.name = "Lumis";
        this.lebenspunkte = 100;
        this.magiepunkte = 50;
    }

    public Spieler(String name, int lebenspunkte, int magiepunkte) {
        this.name = name;
        this.lebenspunkte = lebenspunkte;
        this.magiepunkte = magiepunkte;
    }

    public void act() {
        bewegung();
        angriff();
        magie();
        aufsammeln();
    }

    public void bewegung() {
        if (Greenfoot.isKeyDown("left")) {
            move(-4);
        }
        if (Greenfoot.isKeyDown("right")) {
            move(4);
        }
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 4);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 4);
        }
    }

    public void angriff() {
        if (Greenfoot.isKeyDown("space")) {
            // Nahkampf-Logik hier implementing
            // z.B. Kollisionserkennung mit Gegner
        }
    }

    public void magie() {
        if (Greenfoot.isKeyDown("e") && magiepunkte > 0) {
            // Fernkampf-Logik
            // Erzeuge Projektil?
            magiepunkte--;
        }
    }

    public void aufsammeln() {
        Actor e = getOneIntersectingObject(Energie.class);
        if (e != null) {
            getWorld().removeObject(e);
            // Logik fuer Energie-Aufnahme
        }
    }

    // Getter und Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getLebenspunkte() { return lebenspunkte; }
    public void setLebenspunkte(int lebenspunkte) { this.lebenspunkte = lebenspunkte; }

    public int getMagiepunkte() { return magiepunkte; }
    public void setMagiepunkte(int magiepunkte) { this.magiepunkte = magiepunkte; }

    public Gegner getGegner() { return gegner; }
    public void setGegner(Gegner gegner) { this.gegner = gegner; }

    public Waffe getWaffe() { return waffe; }
    public void setWaffe(Waffe waffe) { this.waffe = waffe; }

    public Energie getEnergie() { return energie; }
    public void setEnergie(Energie energie) { this.energie = energie; }
}
