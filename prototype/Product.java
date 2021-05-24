package prototype;

import java.util.HashMap;
import java.util.Map;

public interface Product extends Cloneable{ // Cloneable을 상속받은 Product interface
    Map<String, String> maps = new HashMap<>();
    String use(String s);
    Product createClone();
}