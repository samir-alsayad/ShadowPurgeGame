public class Level {

    private int levelAktuell;
    private int rundeAktuell;
    private Karte karte;
    private String typ;

    public Level() {
        this.levelAktuell = 1;
        this.rundeAktuell = 1;
    }

    public Level(String typ) {
        this();
        this.typ = typ;
    }

    public void Runde() {
        this.rundeAktuell++;
    }

    public void Runde(String typ) {
        this.typ = typ;
        Runde();
    }

    public int getLevelAktuell() {
        return levelAktuell;
    }

    public void setLevelAktuell(int levelAktuell) {
        this.levelAktuell = levelAktuell;
    }

    public int getRundeAktuell() {
        return rundeAktuell;
    }

    public void setRundeAktuell(int rundeAktuell) {
        this.rundeAktuell = rundeAktuell;
    }

    public Karte getKarte() {
        return karte;
    }

    public void setKarte(Karte karte) {
        this.karte = karte;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }
}
