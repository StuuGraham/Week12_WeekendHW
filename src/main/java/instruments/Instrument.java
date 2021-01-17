package instruments;

public abstract class Instrument {

    private String name;
    private String colour;
    private String noise;
    private double tradePrice;
    private double salePrice;
    private InstrumentType instrumentType;

    public Instrument(String name, String colour, String noise, double tradePrice,
                      double salePrice, InstrumentType instrumentType){
        this.name = name;
        this.colour = colour;
        this.noise = noise;
        this.tradePrice = tradePrice;
        this.salePrice = salePrice;
        this.instrumentType = instrumentType;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public void changeColour(String colour) {
        this.colour = colour;
    }

    public String getNoise() {
        return noise;
    }

    public double getTradePrice() {
        return tradePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
