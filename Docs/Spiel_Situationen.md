# Spiel-Situationen: Shadow Purge (Objektdiagramme)

> [!TIP]
> **Was ist eine Spiel-Situation?**
> In der Softwareentwicklung nutzt man **Objektdiagramme**, um einen "Snapshot" (Schnappschuss) des Spiels zu einem bestimmten Zeitpunkt zu zeigen. Hier sieht man keine Klassen, sondern konkrete Instanzen (Objekte) mit ihren aktuellen Werten.

---

## Situation 1: Der Einstieg (Level 1, Runde 1)
*Der Spieler ist gerade gespawnt und trifft auf die ersten schwachen Gegner.*

```mermaid
objectDiagram
    object "myMap : Karte" {
        name = "Shadow Realm"
        ebene = 1
    }
    object "lumis : Spieler" {
        name = "Lumis"
        lebenspunkte = 100
        magiepunkte = 50
    }
    object "klinge : Waffe" {
        name = "Licht-Klinge"
        schaden = 15
    }
    object "gegner1 : Gegner" {
        name = "Schatten-Splitter"
        lebenspunkte = 20
    }

    myMap ..> lumis : enthält
    myMap ..> gegner1 : enthält
    lumis --> klinge : hat
```

---

## Situation 2: Mitten im Gefecht (Level 2, Runde 2)
*Ein Gegner wurde besiegt und hat Energie (Heilung) fallen gelassen. Lumis ist leicht verletzt.*

```mermaid
objectDiagram
    object "myMap : Karte" {
        name = "Abyss of Darkness"
        ebene = 2
    }
    object "lumis : Spieler" {
        lebenspunkte = 65
        magiepunkte = 20
    }
    object "gegner2 : Gegner" {
        name = "Dunkel-Wesen"
        lebenspunkte = 10
    }
    object "drop1 : Energie" {
        typ = "Heilung"
    }

    myMap ..> lumis : enthält
    myMap ..> gegner2 : enthält
    myMap ..> drop1 : enthält (dropped)
    lumis ..> drop1 : sammelt auf
```

---

## Situation 3: Der Final-Showdown (Level 3)
*Der Endkampf gegen den finalen Boss.*

```mermaid
objectDiagram
    object "myMap : Karte" {
        name = "The Void"
        ebene = 3
    }
    object "lumis : Spieler" {
        lebenspunkte = 100
        magiepunkte = 80
    }
    object "boss : Gegner" {
        name = "The Nameless Void"
        lebenspunkte = 500
        schaden = 40
    }

    myMap ..> lumis : enthält
    myMap ..> boss : enthält
```

---

### 👨‍🏫 Professor-Memo für die Präsentation:
Mit diesen drei Bildern zeigst du dem Lehrer, dass du nicht nur die **Struktur** (Klassendiagramm), sondern auch den **Zustand** (Objektdiagramm) deines Spiels verstehst. Das Objektdiagramm ist der Beweis, dass dein Klassendesign in der Praxis funktioniert!
