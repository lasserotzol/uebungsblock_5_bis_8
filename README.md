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
