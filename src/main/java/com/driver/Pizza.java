package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private StringBuilder bill;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean paperBagAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price = isVeg ? 300 : 400;
        this.bill = new StringBuilder("Base Price Of The Pizza: " + price + "\n");
        this.extraCheeseAdded = false;
        this.extraToppingsAdded = false;
        this.paperBagAdded = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!extraCheeseAdded) {
            price += 80;
            bill.append("Extra Cheese Added: 80\n");
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!extraToppingsAdded) {
            price += (isVeg ? 70 : 120);
            bill.append("Extra Toppings Added: ").append(isVeg ? 70 : 120).append("\n");
            extraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!paperBagAdded) {
            price += 20;
            bill.append("Paperbag Added: 20\n");
            paperBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if (price > 0) {
            bill.append("Total Price: ").append(price).append("\n");
        }
        return this.bill.toString();
    }
}
