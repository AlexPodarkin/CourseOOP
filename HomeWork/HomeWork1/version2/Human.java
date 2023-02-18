package version2;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Human 
{
    private String name;
    private String gender;
    private Date birtDate;
    private Date deatDate;
    private Human father;
    private Human mothher;
    private List<Human> children;

    public Human(String name, String gender, Human father, Human mothher) 
    {
        this.name = name;
        this.gender = gender;
        this.father = father;
        this.mothher = mothher;
        children = new ArrayList<>();
    }

    public Human(String name, String gender) 
    {
        this(name, gender, null, null);
    }
    /***проверка имени, если в  */
    public boolean addChild(Human child)
    {
        if (!children.contains(child))
        {
            children.add(child);
            return true;
        }
        return false;
    }

    public String getName() 
    {
        return name;
    }

/*     public Date getBirtDate() 
    {
        return birtDate;
    } */
    public Human getFather() 
    {
        return father;
    }

    public Human getMothher() 
    {
        return mothher;
    }

    public String getInfo()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Имя");
        sb.append(name);

        return sb.toString();
    }

    private String getMotherInfo()
    {
        String res = "Мать: ";
        if (mothher != null)
        {
            res += mothher.getName();
        }
        else
        {
            res += "нет";
        }
        return res;
    }

    private String getFatherInfo()
    {
        String res = "Отец: ";
        if (father != null)
        {
            res += father.getName();
        }
        else
        {
            res += "нет";
        }
        return res;
    }

    private String getChildrenInfo()
    {
        StringBuilder res = new StringBuilder();
        res.append("Дети: ");
        if (children.size() !=0) 
        {
            res.append(children.get(0).getName());    
            for (int i = 1; i < children.size(); i++) 
            {
                res.append(", ");
                res.append(children.get(i).getName());
            }
        }
        else
        {
            res.append("отсутствуют");
        }
        return res.toString();        
    }
    
}
