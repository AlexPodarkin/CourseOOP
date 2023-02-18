

import java.util.List;

public class Human 
{
    private String nameAncestor;
    private String sex;
    private int age;
    private String wife;
    private String grandfather;
    private String grandmother;

    private List<String> children; // список (тип String)

    public Human(String name, String sex, int age, 
    String wife, String grandfather, String grandmother)
    {
        this.nameAncestor = name;
        this.sex = sex;
        this.age = age;
        this.wife = wife;
        this.grandfather = grandfather;
        this.grandmother = grandmother;
    }
    
     // первая реализация 
    public void addChild1(List<String> child, String nameChild)
    {
        this.children = child;
        this.children.add(nameChild);
    }

    public void printChild()
    {
        System.out.print(" Дети: | ");

        for (int i = 0; i < this.children.size(); i++) 
        {
            System.out.print((i + 1) + " ребенок: " + this.children.get(i) + " | ");
        }
        System.out.println("\n");
    }

      
    // вторая реализация  с классом Child
    
    private List<Child> child;  // поле, список (тип данных Child) 

    public void addChild2(List<Child> listChild, Child name)
    {
        this.child = listChild;
        this.child.add(name);
        System.out.println
        ("-> Родителям, " + this.nameAncestor + " & " + this.wife +
         "\n был добавлен потомок: \n" + name + "\n");
    }

    public String getNameAncestor() 
    {
        return this.nameAncestor;
    }

    public String getWife() 
    {
        return this.wife;
    }

    @Override
    public String toString() 
    {
        return " Имя: " + this.nameAncestor + "\n Пол: " + this.sex + "\n Возраст: " + this.age + 
        "\n Супруга: " + this.wife + "\n Отец: " + this.grandfather + "\n Мать: " + this.grandmother;
    }

    public void allChildren()
    {
        System.out.println("Кол-вo детей = " + this.child.size() +  ", имя \nродителя: " +
            this.nameAncestor + "");
        for (int i = 0; i < child.size(); i++) 
        {
            System.out.println("\n> " + (i + 1) + " Ребенок: <");
            System.out.println(child.get(i));            
        }
    }
}
