package decorator.Food;

public abstract class FoodDecorator implements Food{
    private Food newFood;
    public FoodDecorator(Food newFood)  {
        this.newFood=newFood;
    }
    @Override
    public String buyFood(){
        return newFood.buyFood();
    }
    public double foodPrice(){
        return newFood.foodPrice();
    }
}