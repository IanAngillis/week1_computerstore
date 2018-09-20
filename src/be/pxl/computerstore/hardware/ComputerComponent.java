package be.pxl.computerstore.hardware;

import javafx.beans.binding.StringBinding;

public class ComputerComponent {
    private String articleNumber;
    private String vendor;
    private String name;
    private double price;
    private static int uniqueNumber = 1;

    //Constructor
    public ComputerComponent(String vendor, String name, double price){
        this.setVendor(vendor);
        this.setName(name);
        this.setPrice(price);
        this.setArticleNumber(generateArticleNumber());
    }

    @Override
    public String toString() {
        return this.getName() + " (" + this.getArticleNumber() + ")";
    }

    public String getFullDescription(){
        StringBuilder temp = new StringBuilder();

        temp.append("ArticleNumber = ").append(getArticleNumber()).append("\n");
        temp.append("Vendor = ").append(getVendor()).append("\n");
        temp.append("Name = ").append(getName()).append("\n");
        temp.append("Price = ").append(getPrice()).append("\n");

        return temp.toString();
    }

    private String generateArticleNumber(){
        StringBuilder articleNumber = new StringBuilder();
        String temp;
        temp = getVendor().toUpperCase();
        temp += "XXX";
        articleNumber.append(temp.substring(0, 3));
        articleNumber.append("-");

        for(int i = 0; i < (5 - getLengthUniqueNumber()); i++){

            articleNumber.append("0");
        }

        articleNumber.append(uniqueNumber);
        incrementUniqueNumber();

        return articleNumber.toString();
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {

        if(this.vendor == null || this.vendor.isEmpty())
        this.vendor = vendor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getArticleNumber() {
        return articleNumber;
    }

    public void setArticleNumber(String articleNumber) {

        if(this.articleNumber == null || this.articleNumber.isEmpty()) {
            this.articleNumber = articleNumber;
        }
    }

    public static int getUniqueNumber() {
        return uniqueNumber;
    }

    public static void setUniqueNumber(int uniqueNumber) {
        ComputerComponent.uniqueNumber = uniqueNumber;
    }
    public static void incrementUniqueNumber(){
        uniqueNumber++;
    }

    public static int getLengthUniqueNumber(){
        return Integer.toString(uniqueNumber).length();
    }
}
