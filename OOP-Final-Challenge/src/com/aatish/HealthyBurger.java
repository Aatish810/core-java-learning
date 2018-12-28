package com.aatish;

public class HealthyBurger extends HamBurger {

    private boolean addition1;
    private double addition1Price;
    private boolean addition2;
    private double addition2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", "Brown", meat, price);
    }

    public void setAddition1(boolean addition1, double addition1Price) {
        this.addition1 = addition1;
        this.setAddition1Price(addition1Price);
    }

    private void setAddition1Price(double addition1Price) {
        this.addition1Price = addition1Price;

    }

    public void setAddition2(boolean addition2, double addition2Price) {
        this.addition2 = addition2;
        this.setAddition2Price(addition2Price);
    }

    private void setAddition2Price(double addition2Price) {
        this.addition2Price = addition2Price;
    }

    @Override
    public double calculatePrice() {
        double totalBill = super.calculatePrice();
        if(this.addition1) {
            totalBill += this.addition1Price;
            System.out.println("Price to addition 1 is = "+ this.addition1Price);
        }
        if(this.addition2) {
            totalBill += this.addition2Price;
            System.out.println("Price to addition 2 is = "+ this.addition2Price);
        }
        return totalBill;
    }
}
