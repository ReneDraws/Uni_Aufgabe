
public class BankSparvertraege {
	private String name;
	private Sparvertrag[] vertragArray;
	int freierplatz = 0;
	
	public BankSparvertraege(String name) {
		this.name = name;
		vertragArray = new Sparvertrag[470];
	}
	
	public Sparvertrag[] getVertragArray() {
		return this.vertragArray;
	}
	
	public void vertragHinzufuegen(String sparer, double guthaben, String art) {
		
		
		for(int i = 0; i < vertragArray.length; i++) {
			if(vertragArray[i] == null) {
				freierplatz = i;
			} else {
				System.out.println("Kein Platz mehr verfügbar!");
			}
			
			if(art.equals("VertragPlus")) {
				vertragArray[freierplatz] = new VertragPlus(sparer,guthaben);
			} else if (art.equals("NormSparvertrag")) {
				vertragArray[freierplatz] = new NormSparvertrag(sparer,guthaben);
			}
			
			
		}
	}
}
