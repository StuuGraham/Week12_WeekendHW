package instruments;

public abstract class Instrument {

    private String name;
    private String colour;
    private double recommendedRetailPrice;
    private double salePrice;
    private InstrumentType instrumentType;

    public Instrument(String name, String colour, double recommendedRetailPrice,
                      double salePrice, InstrumentType instrumentType){
        this.name = name;
        this.colour = colour;
        this.recommendedRetailPrice = recommendedRetailPrice;
        this.salePrice = salePrice;
        this.instrumentType = instrumentType;
    }
}
