package OOP_Praktika;

import java.util.*;

public class OOP {
    public static void main(String[] args) {
        Produkt water = new Produkt("Vizit", 12.5);
        System.out.println(water);

        VendingMachine machine1 = new VendingMachine();
        System.out.println(machine1);

        List<Produkt> marked = new ArrayList<>();
        marked.add(water);
        marked.add(new Produkt("Borjomi", 60.34));
        marked.add(new Produkt("Dust", 60.34));
        marked.add(new Soda("Kind", 30.4, "Tarhun"));
        marked.add(new Milk("Korovka", 40.4, "Molkom", 32));

        VendingMachine machine2 = new VendingMachine(marked);
        System.out.println(machine2);

        List<Produkt> findings = machine2.findByName("Kind");
        System.out.println(findings);
        System.out.println(machine2.findByPrice(12));
        System.out.println(machine2.findByPriceRange(21, 34));
    }
    
    
}
