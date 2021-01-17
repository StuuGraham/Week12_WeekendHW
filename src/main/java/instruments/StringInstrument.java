package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public class StringInstrument extends Instrument implements IPlay, ISell {

    private int numberOfStrings;

    public StringInstrument(String name, String colour, String noise, double tradePrice,
                            double salePrice, InstrumentType instrumentType, int numberOfStrings){
        super(name, colour, noise, tradePrice, salePrice, instrumentType);
        this.numberOfStrings = numberOfStrings;
    }


    public String playInstrument(){
        return this.getNoise();
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public double productMarkup(){
        return getSalePrice() - getTradePrice();
    }

    // Inherits the rest of necessary methods from parent class Instrument.
}
