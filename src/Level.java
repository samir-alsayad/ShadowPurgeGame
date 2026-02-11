/**
 * Verwaltet den aktuellen Level-Status.
 * Hinweis: Diese Klasse ist kein Actor, sondern ein Logik-Objekt.
 */
public class Level {
    private int levelAktuell;
    private int rundeAktuell;
    
    // Referenz auf die Karte
    // Problem: Zirkulaere Abhaengigkeit im OOD (Karte <-> Level). 
    // Wir nutzen hier den Klassennamen, Import nicht noetig da gleiches Package.
    private Karte karte;

    public Level() {
        this.levelAktuell = 1;
        this.rundeAktuell = 1;
    }

    public Level(String typ) {
        // Konstruktor aus OOD, Parameter 'typ' unklar, evtl Level-Name?
    }
    
    // Getter und Setter
    public int getLevelAktuell() { return levelAktuell; }
    public void setLevelAktuell(int levelAktuell) { this.levelAktuell = levelAktuell; }

    public int getRundeAktuell() { return rundeAktuell; }
    public void setRundeAktuell(int rundeAktuell) { this.rundeAktuell = rundeAktuell; }

    public Karte getKarte() { return karte; }
    public void setKarte(Karte karte) { this.karte = karte; }
}
