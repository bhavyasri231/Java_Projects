import java.util.ArrayList;

public class IceCream {

    private String name;
    private int numScoops;
    private int cost;
    private ArrayList<String> toppings = new ArrayList<String>(){
        {
            add("Sprinkles");
            add("caramel") ;
            add("cookie dough");
            add("oreos");
        }
    };

    public IceCream(String name, int cost, int numScoops)
    {
        this.name = name;
        this.cost = cost;
        this.numScoops = numScoops;
    }

    public void addToppings(String topping)
    {
        toppings.add(topping);
    }

    public int getCost()
    {
        return cost;
    }

    public String getName()
    {
        return name;
    }

    public int getNumScoops()
    {
        return numScoops;
    }

    public void printToppings()
    {
        for (int index =0;index < toppings.size(); index++)
        {
            System.out.println(toppings.get(index));
        }
    }
}
