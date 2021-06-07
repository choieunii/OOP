package decorator.Food;

public class VegeFood implements Food {
    public String buyFood(){
        return "Veg Food";
    }
    public double foodPrice(){
        return 50.0;
    }
}