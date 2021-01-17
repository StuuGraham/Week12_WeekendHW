package music_shop;

import interfaces.ISell;

import java.util.ArrayList;

public class MusicShop{

    private String shopName;
    private double shopTill;
    private ArrayList<ISell> shopStock;

    public MusicShop(String shopName, double shopTill){
        this.shopName = shopName;
        this.shopTill = shopTill;
        this.shopStock = new ArrayList<ISell>();
    }

    public String getShopName() {
        return shopName;
    }

    public double getShopTill() {
        return shopTill;
    }

    public ArrayList<ISell> getShopStock() {
        return shopStock;
    }

    public void addToStock(ISell product) {
        shopStock.add(product);
    }

    public double getTotalPotentialProfit() {
        double totalProfit = 0.00;
        for (ISell product : shopStock) {
            totalProfit += product.productMarkup();
        }
        return totalProfit;
    }

    public void sellProduct(ISell product){
        this.shopTill += product.getSalePrice();
    }
}
