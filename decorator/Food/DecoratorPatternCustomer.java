package decorator.Food;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecoratorPatternCustomer {
    private static int choice;

    public static void main(String args[]) throws NumberFormatException, IOException {
        while (true) {
            System.out.println("========= Food Menu ============");
            System.out.println("1. Vegetarian Food.");
            System.out.println("2. Non-Vegetarian Food.");
            System.out.println("3. Chineese Food.");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            if (choice == 1) {
                VegeFood vf = new VegeFood();
                System.out.println(vf.buyFood());
                System.out.println(vf.foodPrice());
            } else if (choice == 2) {
                Food f1 = new NonVegeFood((Food) new VegeFood());
                System.out.println(f1.buyFood());
                System.out.println(f1.foodPrice());
            } else if (choice == 3) {
                Food f2 = new ChineeseFood((Food) new VegeFood());
                System.out.println(f2.buyFood());
                System.out.println(f2.foodPrice());
            } else {
                System.out.println("Other than these no food available");
                return;
            }
        }
    }
}