package de.dummyapt;

public class VertragPlus extends NormSparvertrag {
    public VertragPlus(String sparer, double guthaben) {
        super(sparer, guthaben);
        super.setVertragTyp("VertragPlus");
    }

    @Override
    public void addZins(int dauer) {
        if (dauer < 1) {
            System.out.println("Angegebene Dauer zu klein - setze automatisch auf 1");
            dauer = 1;
        } else if (dauer > 9) {
            System.out.println("Angegebene Dauer zu groß - setze automatisch auf 9");
            dauer = 9;
        }
        super.addZins(dauer);
    }
}
