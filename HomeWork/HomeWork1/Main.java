

import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("------------------------");
        Human sergei = new Human("Сергей", "муж.",
        45,"Александра", "Петр","Анна");
        System.out.println(sergei);

        System.out.println("\nПервая реализация\n     ---");
        ArrayList<String> child = new ArrayList<String>();
        sergei.addChild1(child, "Дмитрий");
        sergei.addChild1(child, "Оля");
        sergei.printChild();

        System.out.println("\nВторая реализация\n     ---");
        
        ArrayList<Child> children = new ArrayList<>();

        Child nikolai = new Child("Николай","Муж",25,"Аннэт'",
                                    sergei.getNameAncestor(), sergei.getWife());

        Child dim = new Child("Дмитрий","Муж",19, "нет.",
                                    sergei.getNameAncestor(), sergei.getWife());

        
        sergei.addChild2(children, nikolai); // добавил детей c печатью в консоль
        sergei.addChild2(children, dim);    
         //System.out.println(dim);
         //System.out.println(sergei); 

        sergei.allChildren(); // запрос количества детей и получение информации о них.

    }
}
