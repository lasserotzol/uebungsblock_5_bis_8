package uebungsblock_5_bis_8;

public class Spielkarte {

	private final String Farbe;
	private final String Kartenwert;

	public Spielkarte(String Farbe, String Kartenwert) {

		this.Farbe = Farbe;
		this.Kartenwert = Kartenwert;

	}
	public void Ausgabe() {
		System.out.println(Farbe + " " + Kartenwert);
	}

	private final static String BezeichnungAss = "Ass";
	private final static String BezeichnungKoenig = "Koenig";
	private final static String BezeichnungDame = "Dame";
	private final static String BezeichnungBube = "Bube";
	private final static String BezeichnungZehn = "Zehn";
	private final static String BezeichnungNeun = "Neun";
	private final static String BezeichnungAcht = "Acht";
	private final static String BezeichnungSieben = "Sieben";
	private final static String BezeichnungSechs = "Sechs";
	private final static String BezeichnungFuenf = "Fuenf";
	private final static String BezeichnungVier = "Vier";
	private final static String BezeichnungDrei = "Drei";
	private final static String BezeichnungZwei = "Zwei";

	private final static String Farbe_Herz = "Herz";
	private final static String Farbe_Karo = "Karo";
	private final static String Farbe_Pik = "Pik";
	private final static String Farbe_Kreuz = "Kreuz";

	//gibt einen String gültiger Bezeichnungen zurück
	public static String [] gueltigeKartenbezeichnung () {
		String [] gueltigeKartenbezeichnungen = new String[13];
		gueltigeKartenbezeichnungen[0] = BezeichnungAss;
		gueltigeKartenbezeichnungen[1] = BezeichnungKoenig;
		gueltigeKartenbezeichnungen[2] = BezeichnungDame;
		gueltigeKartenbezeichnungen[3] = BezeichnungBube;
		gueltigeKartenbezeichnungen[4] = BezeichnungZehn;
		gueltigeKartenbezeichnungen[5] = BezeichnungNeun;
		gueltigeKartenbezeichnungen[6] = BezeichnungAcht;
		gueltigeKartenbezeichnungen[7] = BezeichnungSieben;
		gueltigeKartenbezeichnungen[8] = BezeichnungSechs;
		gueltigeKartenbezeichnungen[9] = BezeichnungFuenf;
		gueltigeKartenbezeichnungen[10] = BezeichnungVier;
		gueltigeKartenbezeichnungen[11] = BezeichnungDrei;
		gueltigeKartenbezeichnungen[12] = BezeichnungZwei;
		return gueltigeKartenbezeichnungen;
	}
	public static String [] gueltigeKartenfarbe() {
		String [] gueltigeKartenfarbe = new String [4];
		gueltigeKartenfarbe[0] = Farbe_Herz;
		gueltigeKartenfarbe[1] = Farbe_Karo;
		gueltigeKartenfarbe[2] = Farbe_Pik;
		gueltigeKartenfarbe[3] = Farbe_Kreuz;
		return gueltigeKartenfarbe;
	}
	
}