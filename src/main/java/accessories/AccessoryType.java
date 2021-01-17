package accessories;

public enum AccessoryType {

    STRINGS(9.99, 29.99),
    SHEETMUSIC(2.99, 9.99),
    DRUMSTICKS(5.99, 14.99);

    private final double tradePrice;
    private final double salePrice;

    AccessoryType(double tradePrice, double salePrice){
        this.tradePrice = tradePrice;
        this.salePrice = salePrice;
    }

    public double getTradePrice() {
        return tradePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }
}
