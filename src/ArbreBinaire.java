public class ArbreBinaire implements ArbreElem {

	Object e;
	ArbreBinaire Droite, Gauche;
	
	public ArbreBinaire(double d) {
		this.e = d;
		this.Droite = null;
		this.Gauche = null;
	}
	
	public ArbreBinaire(char str, ArbreBinaire Droite, ArbreBinaire Gauche) {
		this.e = str;
		this.Droite = Droite;
		this.Gauche = Gauche;
	}
	
	public String getEtiquette() {
		return this.e.toString();
	}

	public ArbreElem getGauche() {
		return this.Gauche;
	}

	public ArbreElem getDroite() {
		return this.Droite;
	}
	
	
	public static void main(String[] args) {
		ArbreBinaire tree = new ArbreBinaire ( '*',
				new ArbreBinaire('+',
				new ArbreBinaire('/',
						new ArbreBinaire(3), new ArbreBinaire(9)
						), new ArbreBinaire(5)),
				new ArbreBinaire('/',
						new ArbreBinaire(2), new ArbreBinaire('+',
						new ArbreBinaire(7), new ArbreBinaire(5)))
		);
		
		ArbreDessin.dessinerArbre(tree);
	}

}