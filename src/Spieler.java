public class Spieler {
    private String name;
    private int lebenspunkte;
    private int magiepunkte;
    private Gegner gegner;
    private Waffe waffe;
    private Energie energie;

    public Spieler() {
    }

    public Spieler(String name, int lebenspunkte, int magiepunkte) {
        this.name = name;
        this.lebenspunkte = lebenspunkte;
        this.magiepunkte = magiepunkte;
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

    public int getMagiepunkte() {
        return magiepunkte;
    }

    public void setMagiepunkte(int magiepunkte) {
        this.magiepunkte = magiepunkte;
    }

    public Gegner getGegner() {
        return gegner;
    }

    public void setGegner(Gegner gegner) {
        this.gegner = gegner;
    }

    public Waffe getWaffe() {
        return waffe;
    }

    public void setWaffe(Waffe waffe) {
        this.waffe = waffe;
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

    public void magie() {

    }

    public void aufsammeln() {

    }
}
