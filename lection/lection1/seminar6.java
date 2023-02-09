package seminars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class seminar6 
{
    public static void main(String[] args) 
    {
        
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(set); 
        Set<Integer> linSet = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(linSet); 
        System.out.println(linSet.getClass()); // тип данных


        /* 1. Напишите метод, который заполнит массив из 1000
         элементов случайными цифрами от 0 до 24.*/

        /*  Random rand = new Random();
         System.out.println(rand.nextInt(24)); */

        FirstClass cat = new FirstClass();
        // cat c2 = new cat();
        cat.id = 1;
        cat.Name = "Барсетка";
        cat.Age = 99;
        cat.Weight = 25;
        cat.Breed = "Dvorterier";
        cat.NameOwner = "Sergey" ;
        cat.Tel = "89887776644";
        System.out.println(cat.Gips("Хвост"));

        // https://pastebin.com/U1EsXW2q работа коллеги








    }
}
