
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
			this.guthaben = ((this.guthaben * ZINS1/100) * dauer + this.guthaben);
		} else {
			this.guthaben = ((this.guthaben * ZINS2/100) * dauer + this.guthaben);
		}
	}
}
