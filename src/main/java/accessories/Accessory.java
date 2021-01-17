package accessories;

public class Accessory {

    private String name;
    private AccessoryType accessoryType;

    public Accessory(String name, AccessoryType accessoryType){
        this.name = name;
        this.accessoryType = accessoryType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccessoryType getAccessoryType() {
        return accessoryType;
    }

    public double getTradePrice() {
        return this.accessoryType.getTradePrice();
    }

    public double getSalePrice() {
        return this.accessoryType.getSalePrice();
    }
}
