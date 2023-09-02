package com.driver;

public class Pizza {

    private int basePrice;
    private boolean isVeg;
    private StringBuilder bill;

    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean paperBagAdded;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.basePrice = isVeg ? 300 : 400;
        this.bill = new StringBuilder("Base Price Of The Pizza: " + basePrice + "\n");

        this.extraCheeseAdded = false;
        this.extraToppingsAdded = false;
        this.paperBagAdded = false;
    }

    public int getPrice() {
        return this.basePrice;
    }

    public void addExtraCheese() {
        if (!extraCheeseAdded) {
            basePrice += 80;
            bill.append("Extra Cheese Added: 80\n");
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        if (!extraToppingsAdded) {
            basePrice += (isVeg ? 70 : 120);
            bill.append("Extra Toppings Added: ").append(isVeg ? 70 : 120).append("\n");
            extraToppingsAdded = true;
        }
    }

    public void addTakeaway() {
        if (!paperBagAdded) {
            basePrice += 20;
            bill.append("Paperbag Added: 20\n");
            paperBagAdded = true;
        }
    }

    public int calculateTotalPrice() {
        return basePrice;
    }

    public String getBill() {
        bill.append("Total Price: ").append(calculateTotalPrice()).append("\n");
        return bill.toString();
    }
}
