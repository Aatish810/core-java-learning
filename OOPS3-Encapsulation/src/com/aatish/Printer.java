package com.aatish;

public class Printer {

    private String name;
    private int pages = 0;
    private int tonerPercentage = 100;
    private boolean isDuplex = false;

    public Printer(String name, int tonerPercentage, boolean isDuplex) {
        // Not taking pages since not all parameters are required and it is set by setter below.
        this.name = name;
        if(tonerPercentage >0 && tonerPercentage <= 100) {
            this.tonerPercentage = tonerPercentage;
        }
        this.isDuplex = isDuplex;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public int getTonerPercentage() {
        return tonerPercentage;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void setTonerPercentage(int toner) {
        if(toner > 0 && toner <= 100) {
            this.tonerPercentage = toner;
            System.out.println("Tone Percentage: " + this.tonerPercentage + "%");
        }
    }

    public void addPages(int pages) {
        if(pages > 0) {
            this.pages = this.pages + pages;
            System.out.println("Pages to be printed: " + this.pages);
            this.printing();
        }
    }

    public void setDuplex(boolean duplex) {
        this.isDuplex = duplex;
        System.out.println("Can it print both sides");
    }

    private void printing() {
        int pages = (this.pages/2) + (this.pages%2);
        System.out.println("We are printing pages " + pages );
    }
}
