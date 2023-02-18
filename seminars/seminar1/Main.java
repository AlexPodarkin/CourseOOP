package seminars.seminar1;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) 
    {
        //List<Product> listPr = new ArrayList<Product>();
        VendingMachine vendingMachine = new VendingMachine();

        Bottle bottle = new Bottle(100, "Sprite", 2);
        System.out.println(bottle);
        System.out.println("коррекция" + bottle.getCost()); // полиморфизм
        //System.out.println(vendingMachine);
    }
}