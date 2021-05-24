package prototype;

public class PrototypeServiceTest {
    public static void main(String[] args) {
        String TEST = "TEST";

        MessageBox starBox = new MessageBox("*");
        MessageBox lineBox = new MessageBox("_"); // 메시지 박스 생성

        PrototypeService prototypeService = new PrototypeService();
        prototypeService.register("starBox", starBox);
        prototypeService.register("lineBox", lineBox); // PrototypeService의 map에 등록

        Product starClone = prototypeService.create("starBox");
        Product lineClone = prototypeService.create("lineBox"); // map에서 찾아 create

        System.out.println(starBox.use(TEST));
        System.out.println(starClone.use(TEST));

        System.out.println(lineBox.use(TEST));
        System.out.println(lineClone.use(TEST));
    }
}