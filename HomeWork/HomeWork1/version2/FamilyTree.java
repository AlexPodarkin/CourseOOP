package version2;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree 
{
    public List<Human> humanList;

    public FamilyTree(List<Human> humanList) 
    {
        this.humanList = humanList;
    }

    public FamilyTree()
    {
        this(new ArrayList<>());
    }

    public boolean add(Human human)
    {
        if (human == null)
        {
            return false;
        }
        if(!humanList.contains(human))
        {
            humanList.add(human);
            if (human.getFather() != null)
            {
                human.getFather().addChild(human);
            }
            if (human.getMothher() != null)
            {
                human.getMothher().addChild(human);
            }
            return true;
        }
        return false;
    }

    public Human getByName(String name)
    {
        for (Human human : humanList) 
        {
            if (human.getName().equals(name))
            {
                return human;
            }
        }
        return null;
    }


}
