package de.dummyapt;

public class SparvertragApp {
    public static void main(String[] args) {
        BankSparvertraege bankSparvertraege = new BankSparvertraege("Deutsche Bank");
        bankSparvertraege.vertragHinzufuegen("Dummy", 5.0, "VertragPlus");
        Sparvertrag sparvertrag = bankSparvertraege.getVertragArray()[0];
        ((NormSparvertrag) sparvertrag).addZins(12);
        System.out.println("Sparer: " + sparvertrag.getSparer() + " Guthaben: " + ((NormSparvertrag) sparvertrag).getGuthaben());
    }
}
