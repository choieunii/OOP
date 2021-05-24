/*
 * 컴퓨터 공학과 2018112021 최은지
 * Shape를 상속받은 Triangle class
 * */
package composite.composite;

public class Triangle implements Shape{
    @Override
    public void draw(String color) {
        System.out.println("Drawing Triangle with color " + color);
    }
}
