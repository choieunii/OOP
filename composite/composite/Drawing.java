/*
* 컴퓨터공학과 2018112021 최은지
* Composite 클래스인 Drawing 클래스
* leaf와 Composite 사이에 Shape Interface를 선언, 이를 상속받아 구현된다.
*
* */
package composite.composite;

import java.util.ArrayList;

public class Drawing implements Shape{
    private final ArrayList<Shape> drawingList = new ArrayList<>();
    @Override
    public void draw(String color) {
        for(Shape shape:drawingList){
            shape.draw(color);
        }// ArrayList에 저장되어있는 shape의 draw가 전부 작동한다.
    }
    public void add(Shape s){
        drawingList.add(s);
    }//ArrayList에 저장한다.
    public void remove(Shape s){
        drawingList.remove(s);
    }//ArrayList에서 제거한다.
    public void clear(){
        drawingList.clear();
        System.out.println("Clearing all the shapes from drawing");
    }// ArrayList를 clear 한다.
}
