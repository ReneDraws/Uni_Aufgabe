
public class Aufgabe07 {
	public static void main(String[] args) {
		BankSparvertraege sparvertrag = new BankSparvertraege("Sparkasse Bochum");
		
		sparvertrag.vertragHinzufuegen("Rene", 12.5, "NormSparvertrag");
		
		Sparvertrag[] vertrag = sparvertrag.getVertragArray();
		NormSparvertrag v = (NormSparvertrag) vertrag[0];
		v.addZins(8);
		System.out.println(v.getGuthaben());
		}
}
