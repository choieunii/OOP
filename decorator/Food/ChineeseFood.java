package decorator.Food;

public class ChineeseFood extends FoodDecorator{
    public ChineeseFood(Food newFood)    {
        super(newFood);
    }
    public String buyFood(){
        return super.buyFood() +" With Fried Rice and Manchurian  ";
    }
    public double foodPrice()   {
        return super.foodPrice()+65.0;
    }
}