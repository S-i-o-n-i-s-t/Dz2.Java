package OOP_Praktika;

public class Produkt {
    private String name;
    private double price;
    public Produkt(String name, double price) {
        this.setName(name);
        this.setPrice(price);
    }
    public String getName() {
        return name;
    }
    private void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString(){
        return String.format("%s, prise = %f", name, price);
    }
}
