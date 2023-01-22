package de.dummyapt;

public abstract class Sparvertrag {
    private String sparer;
    private String vertragTyp;

    protected Sparvertrag(String sparer, String vertragTyp) {
        this.sparer = sparer;
        this.vertragTyp = vertragTyp;
    }

    public String getSparer() {
        return this.sparer;
    }

    void setSparer(String sparer) {
        this.sparer = sparer;
    }

    public String getVertragTyp() {
        return vertragTyp;
    }

    void setVertragTyp(String vertragTyp) {
        this.vertragTyp = vertragTyp;
    }
}
