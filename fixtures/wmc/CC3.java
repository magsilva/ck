package wmc;

public class CC3 {

    public int iceCreamPrice(boolean premium, boolean cone, int toppings) {
        int price = 0;

        if (premium) {
            price = 20;
        } else {
            price = 15;
        }

        if (cone) {
            price = price + 2;
        } else {
            price = price + 1;
        }

        if (toppings > 1) {
            price = price + 2;
        } else {
            price = price + 1;
        }

        return price;
    }
}