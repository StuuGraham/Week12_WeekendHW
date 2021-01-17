package instruments;

import interfaces.IPlay;
import interfaces.ISell;

public class PercussionInstrument extends Instrument implements IPlay, ISell {

    private PercussionType percussionType;

    public PercussionInstrument(String name, String colour, String noise, double tradePrice,
                                double salePrice, InstrumentType instrumentType, PercussionType percussionType){
        super(name, colour, noise, tradePrice, salePrice, instrumentType);
        this.percussionType = percussionType;
    }

    public String playInstrument(){
        return this.getNoise();
    }

    public PercussionType getPercussionType() {
        return percussionType;
    }

    public double productMarkup(){
        return getSalePrice() - getTradePrice();
    }
}
