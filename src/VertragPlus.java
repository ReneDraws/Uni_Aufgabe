
public class VertragPlus extends NormSparvertrag {
	
	VertragPlus(String sparer, double guthaben) {
		super(sparer,guthaben);
		super.setVertragTyp("VertragPlus");
	}
	
	@Override
	public void addZins(int dauer) {
		if(dauer < 1) {
			dauer = 1;
			setGuthaben(getGuthaben() * this.ZINS1/100 + getGuthaben());
			System.out.println("Angegebene Dauer zu klein - setze automatisch auf 1");
		} else if (dauer > 9) {
			dauer = 9;
			setGuthaben(getGuthaben() * this.ZINS1/100 + getGuthaben());
			System.out.println("Angegebene Dauer zu groß - setze automatisch auf 9");
		}
	}
	
}
