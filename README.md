# Übungsblock zu Kapitel 5 bis 8 ("Blackjack")

Ziel ist es, das Spiel "Black Jack" umzusetzen.

Zuerst soll nur ein sehr einfacher Regelsatz realisiert werden, der dann immer mehr den Casino-Regeln angepasst wird.

## Einfache Regeln

* Das Spiel besteht aus nur einem Spieler (Anwender) und dem Kartengeber (Computer).
* Gespielt wird mit einem 52-Karten-Blatt (in Casinos häufig auch mit 6x52 Karten).
* Der Kartengeber gibt dem Spieler zwei offene Karten und sich selbst eine offene Karte.
* Dann kann der Spieler entscheiden, ob er eine weitere Karte erhalten möchte (sog. _hit_) oder lieber keine weiteren Karten erhalten möchte (sog. _stay_).
* Ziel ist es, so dicht wie möglich an 21 Punkte heranzukommen, diese aber nicht zu übertreffen (sog. _bust_), was zum sofortigen Verlieren der Runde führt.
* Dabei zählen die Karten wie folgt:

Karten     | Punktewert
---------- | -------------
2 bis 10   | 2 bis 10 Punkte
Bildkarte  | 10 Punkte
Ass        | nach Belieben 1 Punkt oder 11 Punkte

* Will der Spieler keine weitere Karte, so ist der Kartengeber an der Reihe: Er zieht solange Karten, wie er 16 oder weniger Punkte hat, sobald er 17 oder mehr Punkte hat, hört er auf.
* Der Geber muss jedes Ass mit 11 Punkten zählen, es sei denn, er würde bei über 21 Punkten landen.

### Beendigung des Spiels:

* Der Spieler zieht zu viele Karten und hat über 21 Punkte (Geber gewinnt).
* Der Geber zieht zu viele Karten und hat über 21 Punkte (Spieler gewinnt).
* Der Spieler hat 21 oder weniger Punkte, und der Geber hat zwischen 17 und 21 Punkten – es gewinnt derjenige, der mehr Punkte hat. Bei gleich vielen Punkten endet das Spiel unentschieden.

## Teil 1

* Schreiben Sie eine Klasse ```Spielkarte```, welche die Farbe (Pik, Kreuz, Herz, Karo) und den Kartenwert (Zwei, ..., Zehn, Bube, Dame, König, Ass) kennt.
* Eine Spielkarte sollte sich nach der Erzeugung nicht mehr verändern.
* Schreiben Sie eine Klasse ```Kartenstapel```, welche alle 52 Spielkarten enthält. Objekte der Klasse sollen Auskunft darüber geben können, wie viele Karten noch auf dem Stapel sind, und man soll sich die oberste Karte geben lassen können.
* Bei der Erzeugung eines Kartenstapels sollen die Karten gemischt werden.
* Erzeugen Sie eine Klasse ```Kartenhand```, die bis zu 21 Karten aufnehmen kann. Einer Kartenhand können Karten hinzugefügt werden.
* Eine Kartenhand soll Auskunft darüber geben, wieviele Punkte gemäß Black-Jack-Regeln sie gerade enthält (nach den Regeln für den Geber).
* Eine Kartenhand soll einen ```String``` zurückliefern können, der kurz aber übersichtlich beschreibt, welche Karten auf der Hand sind, z. B.: "Pik Bube, Karo Vier, Herz Sechs".
* Testen Sie ausführlich das Erstellen von Spielkarten, Kartenstapeln und Kartenhänden.

## Teil 2

Setzen Sie ein einfaches Black-Jack-Spiel um:

1. Geber und Spieler erhalten eine Kartenhand.
2. Dem Anwender (Spieler) werden die Kartenhände bekannt gegeben, und der Spieler wird nach seinem Spielzug gefragt – _"stay"_ (bei 4. weiter) oder _"hit"_ (bei 3. weiter).
3. Der Spieler erhält eine Karte. Sind seine Punkte < 22, geht es bei Punkt 2 weiter, sonst erhält er noch die Meldung _"bust"_, und das Spiel ist beendet.
4. Der Geber zieht nun gemäß den Regeln seine Karten und informiert nach jedem Zug den Anwender über die Kartenhände.
5. Sobald der Geber mehr als 16 Punkte auf der Hand hat, wird das Spielergebnis ausgewertet und der Anwender über das Ergebnis informiert.

## Erweiterte Regeln I

* Vor dem Spiel können Geldeinsätze getätigt werden (bis zu vorgegebenen Limits). Der Gewinn entspricht nach den bisherigen Regeln immer dem Einsatz.
* Hat ein Spieler einen Siebener-Drilling, so gewinnt er sofort im Verhältnis 3:2 (also das 1,5-fache des Einsatzes) und das Spiel ist beendet.
* Ein "Black Jack" ist eine Kartenhand mit nur 2 Karten, die bereits 21 ergeben. Sie zählt mehr als andere Kartenhände, die 21 ergeben und gewinnt gegenüber diesen. Gewinnt der Spieler mit einem "Black Jack", so tut er dies im Verhältnis 3:2.

## Teil 3

* Ergänzen Sie das Black-Jack-Spiel derart, dass nach einer Runde das Spiel nicht zwangsläufig beendet ist, sondern der Anwender gefragt wird, ob er noch eine Runde spielen möchte.
* Der Spieler soll nun beim Programmstart ein Budget von 5000 Euro haben und vor jedem Spiel einen Teilbetrag (Limit 1000 Euro) setzen dürfen.
* Setzen Sie zuerst eine einfache Gewinnausschüttung um. Ergänzen Sie dann die speziellen Ausschüttungsregeln für "Siebener-Drilling" und "Black Jack".

## Erweiterte Regeln II

### double-Regel

* Nachdem die ersten beiden Karten des Spielers aufgedeckt worden sind (die erste Karte des Gebers ist auch schon bekannt), hat der Spieler die Möglichkeit, seinen Einsatz zu verdoppeln (double).
* Wählt er diese Option, so bedeutet dies aber auch,  dass er danach exakt eine Karte bekommt. Er kann darauf weder verzichten noch eine weitere fordern.

### insurance-Regel

* Hat der Geber als erste Karte ein Ass, kann der Spieler sich gegen einen Black Jack des Gebers "versichern". Der Spieler kann dann mit einer sog. Versicherungsprämie (beliebiger Betrag <= Limits) eine Nebenwette darauf abschliessen,  dass der Geber einen Black Jack erhalten wird.
* Erhält der Geber tatsächlich einen Black Jack, so gewinnt der Spieler die Nebenwette 2:1. Erhält der Geber keinen Black Jack, so wird die Versicherungsprämie einbehalten.
* Diese Versicherung hat keinen Einfluß auf Gewinn oder Verlust im übrigen Spiel.

## Teil 4

* Setzen Sie die double-Regel um.
* Setzen Sie die insurance-Regel um.
