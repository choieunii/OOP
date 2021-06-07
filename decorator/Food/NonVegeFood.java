package decorator.Food;

public class NonVegeFood extends FoodDecorator {
    public NonVegeFood(Food newFood) {
        super(newFood);
    }

    public String buyFood() {
        return super.buyFood() + " With Roasted Chiken and Chiken Curry  ";
    }

    public double foodPrice() {
        return super.foodPrice() + 150.0;
    }
}