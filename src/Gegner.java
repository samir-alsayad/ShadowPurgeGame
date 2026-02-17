public class Gegner {
    private String name;
    private int lebenspunkte;
    private int schaden;
    private Spieler spieler;
    private Energie energie;

    public Gegner() {
    }

    public Gegner(String name, int lebenspunkte, int schaden) {
        this.name = name;
        this.lebenspunkte = lebenspunkte;
        this.schaden = schaden;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLebenspunkte() {
        return lebenspunkte;
    }

    public void setLebenspunkte(int lebenspunkte) {
        this.lebenspunkte = lebenspunkte;
    }

    public int getSchaden() {
        return schaden;
    }

    public void setSchaden(int schaden) {
        this.schaden = schaden;
    }

    public Spieler getSpieler() {
        return spieler;
    }

    public void setSpieler(Spieler spieler) {
        this.spieler = spieler;
    }

    public Energie getEnergie() {
        return energie;
    }

    public void setEnergie(Energie energie) {
        this.energie = energie;
    }

    public void bewegung() {
    }

    public void angriff() {
    }
}