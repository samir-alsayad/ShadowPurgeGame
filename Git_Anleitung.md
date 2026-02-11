## 📌 Ziel

Wir verbinden ein lokales Projekt mit dem entfernten Repository:

➡️ **[https://github.com/samir-alsayad/ShadowPurgeGame](https://github.com/samir-alsayad/ShadowPurgeGame)**

und erklären, wie man ändert, speichert und synchronisiert.

---

## 1) 🧠 Grundwissen: Was ist Git?

Git ist ein Versionskontrollsystem.
Es speichert Änderungen am Code, sodass mehrere Personen gleichzeitig arbeiten und Änderungen verfolgen können.

Ein „Remote“ ist einfach ein **Server-Repository**, z.B. auf GitHub, zu dem wir unseren Code hochladen und von dem wir ihn herunterladen.

---

## 2) 🛠 Voraussetzungen

Bevor ihr loslegt, stellt sicher:

✔️ Ihr habt **Git installiert**.
✔️ Ihr habt ein **GitHub-Konto**.
✔️ Ihr habt **IntelliJ IDEA** installiert.

---

## 3) 🔄 Projekt klonen (einmalig)

Wenn ihr das Projekt noch **nicht lokal habt**, dann:

1. Öffnet IntelliJ IDEA

2. Klickt auf **Get from Version Control**

3. Gebt die URL ein:

```
https://github.com/samir-alsayad/ShadowPurgeGame
```

4. Wählt einen Ordner zum Speichern
5. Klickt auf **Clone**

👉 Jetzt habt ihr das Projekt lokal geöffnet.

---

## 4) 🔎 Kurz erklärt: Was passiert im Hintergrund?

IntelliJ ruft intern folgende Befehle auf:

```bash
git clone https://github.com/samir-alsayad/ShadowPurgeGame
```

Das lädt das Projekt und richtet den Remote-Eintrag „origin“ automatisch ein.

---

## 5) 📝 Wenn ein Kollege das Projekt bereits lokal hat

Und noch keinen Remote gesetzt hat:

Öffnet das Projekt in IntelliJ → Terminal unten → gebt ein:

```bash
git remote add origin https://github.com/samir-alsayad/ShadowPurgeGame
git fetch
```

---

## 6) 📌 Änderungen speichern (Commit)

Arbeitet in **IntelliJ:**

1. Geht zu **Git → Commit**
2. Wählt geänderte Dateien aus
3. Schreibt eine erklärende Nachricht (z. B. „Feature hinzugefügt“)
4. Klickt auf **Commit**

**Tipp:** Baut am besten kleine commits, die nur eine Aufgabe erledigen.

---

## 7) 📤 Änderungen hochladen (Push)

In IntelliJ:

➡️ **Git → Push...**

oder im Terminal:

```bash
git push origin main
```

⚠️ Falls euer Branch nicht „main“ heißt — ersetzt ihn entsprechend (z. B. `master` oder `dev`).

📌 Beim ersten Push:

```bash
git push -u origin main
```

Das verknüpft euren lokalen Branch dauerhaft mit dem Remote-Branch.

---

## 8) 📥 Änderungen von anderen holen (Pull)

Bevor ihr losarbeitet, holt aktuelle Änderungen:

In IntelliJ:

➡️ **Git → Pull**

oder im Terminal:

```bash
git pull origin main
```

Damit vermeidet ihr Merge-Konflikte.

---

## 9) ⚠️ Falls es Konflikte gibt

Git sagt:

> **Merge conflict…**

Dann müsst ihr die Konfliktstellen manuell lösen. IntelliJ zeigt euch interaktive Buttons („Accept Yours“, „Accept Theirs“ etc.). Danach committen und pushen wie oben.

---

## 10) 🧭 Zusammenfassung der wichtigsten Befehle

| Aufgabe              | Terminal-Befehl               |
| -------------------- | ----------------------------- |
| Remote setzen        | `git remote add origin <URL>` |
| Änderungen anzeigen  | `git status`                  |
| Dateien zum Commit   | `git add .`                   |
| Commit erstellen     | `git commit -m "Nachricht"`   |
| Änderungen hochladen | `git push`                    |
| Änderungen holen     | `git pull`                    |

---

## 11) 🧩 Tipps für euer Team

🔹 Arbeitet immer auf **Feature-Branches**
👉 Beispiel:

```
git checkout -b feature/sound-effects
```

Nach Fertigstellung:

```
git push origin feature/sound-effects
```

und öffnet dann einen **Pull Request** auf GitHub.

🔹 Commit-Nachrichten kurz, klar, sachlich.

🔹 Vor jedem Push zuerst **pull**, damit ihr synchron bleibt.

---