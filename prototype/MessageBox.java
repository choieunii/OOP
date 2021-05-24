package prototype;

public class MessageBox implements Product {
    private String type;

    public MessageBox(String type) {
        this.type = type;
    }

    @Override
    public String use(String word) {
        return type + word + type;
    }

    @Override
    public Product createClone() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return product;
    }
}