import greenfoot.*;

/**
 * Die Gegner-Klasse fuer alle Feinde.
 */
public class Gegner extends Actor {
    private String name;
    private int lebenspunkte;
    private int schaden;
    
    // Assoziationen
    private Spieler spieler;
    private Energie energie; // Was der Gegner droppt?

    public Gegner() {
        this.name = "Schatten";
        this.lebenspunkte = 50;
        this.schaden = 10;
    }

    public Gegner(String name, int lebenspunkte, int schaden) {
        this.name = name;
        this.lebenspunkte = lebenspunkte;
        this.schaden = schaden;
    }

    public void act() {
        bewegung();
        angriff();
    }

    public void bewegung() {
        // Einfache KI: Auf den Spieler zubewegen
        if (spieler != null) {
            turnTowards(spieler.getX(), spieler.getY());
            move(2);
        }
    }

    public void angriff() {
        if (isTouching(Spieler.class)) {
            // Spieler Schaden zufuegen
            // spieler.setLebenspunkte(spieler.getLebenspunkte() - schaden);
        }
    }

    // Getter und Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getLebenspunkte() { return lebenspunkte; }
    public void setLebenspunkte(int lebenspunkte) { this.lebenspunkte = lebenspunkte; }

    public int getSchaden() { return schaden; }
    public void setSchaden(int schaden) { this.schaden = schaden; }

    public Spieler getSpieler() { return spieler; }
    public void setSpieler(Spieler spieler) { this.spieler = spieler; }

    public Energie getEnergie() { return energie; }
    public void setEnergie(Energie energie) { this.energie = energie; }
}
