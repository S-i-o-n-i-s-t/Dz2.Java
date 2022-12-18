package OOP_Praktika;

public class Soda extends Produkt{
    public Soda(String name, double price, String flavor) {
        super(name, price);  // super - означает "наследник"
        this.setflavor(flavor);
    }
    private String flavor;

    public String getFlavor() {
        return flavor;
    }
    private void setflavor(String flavor){
        this.flavor = flavor;
    }
    public String toString(){
        return String.format("%s - %s", super.toString(), flavor);
    }
}
