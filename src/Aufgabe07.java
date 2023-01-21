
public class Aufgabe07 {
	public static void main(String[] args) {
		BankSparvertraege sparvertrag = new BankSparvertraege("Sparkasse Bochum");
		
		sparvertrag.vertragHinzufuegen("Rene", 12.5, "NormSparvertrag");
		System.out.println(sparvertrag.getVertragArray());
		}
}
