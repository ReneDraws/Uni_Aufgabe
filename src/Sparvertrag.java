
public abstract class Sparvertrag {
	private String sparer;
	private String vertragTyp;
	
	public Sparvertrag(String sparer, String vertragTyp) {
		this.sparer = sparer;
		this.vertragTyp = vertragTyp;
	}
	
	void setSparer(String sparer) {
		this.sparer = sparer;
	}
	
	void setVertragTyp(String vertragTyp) {
		this.vertragTyp = vertragTyp;
	}
	
	public String getSparer() {
		return this.sparer;
	}
	
	public String getVertragTyp() {
		return this.vertragTyp;
	}
}
