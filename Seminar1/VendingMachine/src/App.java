import domen.Product;

public class App {
    public static void main(String[] args) throws Exception {
        Product product = new Product(
            1, "lays", 132.55 , 12
        );
        System.out.println(product);
    }
}
