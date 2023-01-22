package de.dummyapt;

public class BankSparvertraege {
    private final String name;
    private final Sparvertrag[] vertragArray;

    public BankSparvertraege(String name) {
        this.name = name;
        vertragArray = new Sparvertrag[231];
    }

    public void vertragHinzufuegen(String sparer, double guthaben, String art) {
        for (int i = 0; i < vertragArray.length; i++)
            if (vertragArray[i] == null) {
                if (art.equals("VertragPlus")) vertragArray[i] = new VertragPlus(sparer, guthaben);
                else if (art.equals("NormSparvertrag")) vertragArray[i] = new NormSparvertrag(sparer, guthaben);
                break;
            } else if (i == vertragArray.length - 1) System.out.println("Kein Platz mehr verfügbar!");
    }

    public Sparvertrag[] getVertragArray() {
        return vertragArray;
    }
}
