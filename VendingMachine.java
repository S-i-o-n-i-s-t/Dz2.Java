package OOP_Praktika;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class VendingMachine {
    private static List<Produkt> Default = new ArrayList<>(Arrays.asList(new Produkt("rock", 1)));
    private List<Produkt> prodList;

    public VendingMachine(List<Produkt> prodList) {
        this.prodList = prodList;
    }
    public VendingMachine() {
        this(Default); //Вызов конструктора
    }
    private List<Produkt>finder(Function<Produkt, Boolean> f){
        List<Produkt> result = new ArrayList<>();
        prodList.forEach(i-> {
            if(Boolean.TRUE.equals(f.apply(i)))
                result.add(i);
        });
        return result;
    }
    public String toString() {
        StringBuilder result = new StringBuilder();
        prodList.forEach(i -> result.append(i.toString() + "\n"));
        return result.toString();
    }
    public List<Produkt> findByName(String name) {
        List<Produkt> result = new ArrayList<>();
        //prodList.forEach(i -> {
        //    if (i.getName().equals(name))
        //        result.add(i);
        //});
        return finder(p->p.getName().equals(name));
    }
    public List<Produkt> findByPrice(double prise) {
        List<Produkt> result = new ArrayList<>();
        //prodList.forEach(i -> {
        //    if (i.getPrice() == prise);
         //       result.add(i);
        //});
        return finder(p->p.getPrice() == prise);
    }
    public List<Produkt> findByPriceRange(double p1, double p2) {
        List<Produkt> result = new ArrayList<>();
        //prodList.forEach(i-> {
        //    if(i.getPrice()<p2 && i.getPrice()>p1)
        //        result.add(i);
        //});
        return finder(p->p.getPrice()<p2 && p.getPrice()>p1);
    }




}
