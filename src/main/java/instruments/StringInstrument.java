package instruments;

public class StringInstrument extends Instrument implements IPlay{

    private int numberOfStrings;

    public StringInstrument(String name, String colour, String noise, double recommendedRetailPrice,
                            double salePrice, InstrumentType instrumentType, int numberOfStrings){
        super(name, colour, noise, recommendedRetailPrice, salePrice, instrumentType);
        this.numberOfStrings = numberOfStrings;
    }


    public String playInstrument(){
        return this.getNoise();
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    // Inherits the rest of necessary methods from parent class Instrument.
}
