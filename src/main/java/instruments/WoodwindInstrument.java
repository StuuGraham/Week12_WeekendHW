package instruments;

public class WoodwindInstrument extends Instrument implements IPlay{

    private String materialMadeOf;

    public WoodwindInstrument(String name, String colour, String noise, double tradePrice,
                            double salePrice, InstrumentType instrumentType, String materialMadeOf){
        super(name, colour, noise, tradePrice, salePrice, instrumentType);
        this.materialMadeOf = materialMadeOf;
    }


    public String playInstrument(){
        return this.getNoise();
    }

    public String getMaterialMadeOf() {
        return materialMadeOf;
    }

    // Inherits the rest of necessary methods from parent class Instrument.
}