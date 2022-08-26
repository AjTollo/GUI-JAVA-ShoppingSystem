import java.util.ArrayList;

public class ShopItems {

    ArrayList<ShopItems> itemData = new ArrayList<ShopItems>();
    String itemName;
    double itemPrice;
    int itemQty;

    ShopItems(String itemName, double itemPrice, int itemQty) {

    }

    public ArrayList<ShopItems> getItems() {
        return itemData;
    }

}
