package uebungsblock_5_bis_8;

public class Kartenstapel {

	public Spielkarte[] Stapel = new Spielkarte[52];

	public void neuerKartenstapel() {
		String[] Kartenbezeichnung = Spielkarte.gueltigeKartenbezeichnung();
		String[] Kartenfarbe = Spielkarte.gueltigeKartenfarbe();

		int far = 0;
		int kartennummer = 0;
		for (int i = 0; i <= 3; i++) {
			int bez = 0;
			for (int a = 0; a <= 12; a++) {
				Stapel[kartennummer] = new Spielkarte(Kartenfarbe[far], Kartenbezeichnung[bez]);
				Stapel[kartennummer].Ausgabe();
				kartennummer++;
				bez++;
			}
			far++;
		}
		mischen();
	}

	public int AnzahlKartenDesStapels() {
		int anzahl;
		anzahl = Stapel.length;
		for (int i = 0; i <= 51; i++) {
			if (Stapel[i] == null) {
				anzahl = anzahl - 1;
			}
		}
		System.out.println(anzahl);
		return anzahl;
	}

	public Spielkarte obersteKarteNennen() {
		int anzahlKartenDesStapels = AnzahlKartenDesStapels() - 1;
		Stapel[anzahlKartenDesStapels].Ausgabe();
		return Stapel[anzahlKartenDesStapels];

	}

	public void obersteKarteZiehen() {
		int anzahlKartenDesStapels = AnzahlKartenDesStapels() - 1;
		Stapel[anzahlKartenDesStapels].Ausgabe();
		Stapel[anzahlKartenDesStapels] = null;

	}

	public void mischen() {
		for (int i = 0; i <= 300; i++) {
			int zufallsZahl = (int) (Math.random() * 52);
			int zufallsZahl2 = (int) (Math.random() * 52);

			Spielkarte Zwischenspeicher = Stapel[zufallsZahl];
			Spielkarte Zwischenspeicher2 = Stapel[zufallsZahl2];
			Stapel[zufallsZahl] = null;
			Stapel[zufallsZahl2] = null;
			Stapel[zufallsZahl] = Zwischenspeicher2;
			Stapel[zufallsZahl2] = Zwischenspeicher;

		}

	}

}
