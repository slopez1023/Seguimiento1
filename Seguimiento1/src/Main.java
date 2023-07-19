import Models.Customer;
import Models.Order;
import Models.Product;
import Repository.ProductRepo;

import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
        while (true) {
            System.out.println("Menú");
            System.out.println("1. Lista de productod de la categoría libros con precios mayorres de 100 ");
            System.out.println("2. Lista de pedidos de la categoría Bebé");
            System.out.println("3. Lista de productos de la categoría Juguetes con 10% de descuento");
            System.out.println("4. Lista de productos pedidos por el cliente del nivel 2 entre el 01 de febrero de 2021 y el 01 de abril de 2021");
            System.out.println("Ingrese el número de la consulta que desea: ");

            int option = Integer.parseInt(System.console().readLine());
            switch (option){
                case 1: ProductBook

            }
        }
    }

    private static List<Product> getproducts() {
        Product product1 = new Product(1L,"Book 1","Book",15.000);
        Product product2 = new Product(2L,"Book 2","Book",19.000);
        Product product3 = new Product(3L,"Book 3","Book",25.000);
        return List.of(product1,product2,product3);
    }
    private static List<Customer>getCustomerList(){
        Customer customer1 = new Customer(1L,"<NAME>",1);
        Customer customer2 = new Customer(2L,"<NAME>",2);
        Customer customer3 = new Customer(3L,"<NAME>",3);
        return List.of(customer1,customer2,customer3);
    }
    private static Order crateOrder(List Products){
        Order order1 = new Order(1L,1L,1L);
        Order order2 = new Order(2L,2L,2L);
        Order order3 = new Order(3L,3L,3L);

    }
}

