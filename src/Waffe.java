import greenfoot.*;

/**
 * Repraesentiert eine Waffe im Spiel.
 */
public class Waffe extends Actor {
    private String name;
    private int schaden;

    public Waffe() {
        this.name = "Licht-Klinge";
        this.schaden = 15;
    }

    public Waffe(String name, int schaden) {
        this.name = name;
        this.schaden = schaden;
    }

    // Getter und Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getSchaden() { return schaden; }
    public void setSchaden(int schaden) { this.schaden = schaden; }
}
