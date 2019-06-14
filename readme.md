# 19-Abgabe04-Wurm-Kostmann #

**EDUCATION Repository**

**Aufgabe 04**

Florian Kostmann

Leopold Wurm

Repository: [https://github.com/flokosti/19-Abgabe04-Wurm-Kostmann.git](https://github.com/flokosti/19-Abgabe04-Wurm-Kostmann.git)

Die Übung dient als Repetitorium aller bereits absolvierten Übungen. Die readme.md dient als Bereicht zur Abgabe 4.

## Task List ##

- [x]  Project review (Queue)
  - [x] Find three errors
- [x] Comments with Javadoc API for class files and methods
  - [ ] Integrate an image in the report
- [x] Write JUnit Test-Cases
  - [x] Comment Test-Cases with Javadoc API
  - [ ] Integratean image in the report
- [x] Adapt pom.xml
  - [x] Integrate log4j library as maven-dependency
- [x] Implement log4j
  - [x] Static logger
- [ ] Maven Site Documentation
  - [ ] Integrate Javadoc and JUnit Test-Cases
  - [ ] Integrate menu with reference to manually generated sites
- [ ] Finally update readme.md for labreport

## Vorgehen ##
### Vorbereitungen ###

Zuerst wurde die Taskliste im Markdown Format im readme.md hinzugefügt. Die Punkte wurden von der Aufgabenstellung
übernommen. Anschließend wurde das "Musterprojekt" in IntelliJ importiert, ein Repository erstellt und ein
initial commit von Florian durchgeführt. 

**Fehlersuche**

Die Fehler wurden zusammen gesucht und gefunden.

Gefundene und korrigierte Fehler:

- Übergabeparameter im Konstruktor
- poll(): Vergleichsoperator von == auf != geändert
- remove(): Entfernen der Überschreibung mit von Element mit einem leeren String

Der Code wurde bei der Implementierung vom static logger noch mit mehr Klammern versehen.

### JavaDoc

Die Kommentare wurden von beiden Teammitgliedern verfasst. Die Kommentare wurden zum Schluss noch einmal
überarbeitet, da beim build einige Fehler auftraten und die Beschreibungen im Queue Interface bei den @param fehleten. 

Erkenntnis: "-->" als Kommentar erzeugt einen Fehler beim build Prozess.