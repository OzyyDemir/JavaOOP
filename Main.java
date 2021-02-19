public class Main {

    public static void main(String[] args) {
        Product product = new Product();
        product.id=2;
        product.name="telefon";
        product.price=12303;
        product.isThere= true;
        ProductManager.Add(product);
        Employee employee = new Employee();
        employee.hangUp();
        employee.live();
        employee.pay();
    }
}
