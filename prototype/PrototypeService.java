package prototype;

import java.util.HashMap;

public class PrototypeService {
    private HashMap<String, Object> map = new HashMap<>();

    public void register(String name, Product product) {
        map.put(name, product);
    } // map에 등록

    public Product create(String name) {
        return ((Product)map.get(name)).createClone();
    } //map에서 조회 후 clone
}