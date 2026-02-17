public class Karte {

    private String name;
    private int ebene;
    private Spieler spieler;
    private Gegner gegner;
    private Level level;

    public Karte() {
    }

    public Karte(String name){
        this.name = name;
    }

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
    }

    public Gegner getGegner() {
        return gegner;
    }

    public void setGegner(Gegner gegner) {
        this.gegner = gegner;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
