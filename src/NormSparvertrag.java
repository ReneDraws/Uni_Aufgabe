
public class NormSparvertrag extends Sparvertrag implements Zinsen{
	private double guthaben;
	
	public NormSparvertrag(String sparer, double guthaben) {
		super(sparer, "Normaler Sparvertrag");
	}
	
	void setGuthaben(double guthaben) {
		this.guthaben = guthaben;
	}
	
	public double getGuthaben() {
		return this.guthaben;
	}
	
	public void addZins(int dauer) {
		if(dauer <= 3) {
			this.guthaben = (guthaben * this.ZINS1/100 + guthaben);
		} else {
			this.guthaben = (guthaben * this.ZINS2/100 + guthaben);
		}
	}
}
