package instruments;

public class BrassInstrument extends Instrument implements IPlay{

    private int valves;

    public BrassInstrument(String name, String colour, String noise, double tradePrice,
                           double salePrice, InstrumentType instrumentType, int valves){
        super(name, colour, noise, tradePrice, salePrice, instrumentType);
        this.valves = valves;
    }

    public String playInstrument(){
        return this.getNoise();
    }

    public int getNumberOfValves(){
        return valves;
    }
}
