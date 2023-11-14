package ra.academy.test;

import ra.academy.model.Product;
import ra.academy.service.ProductService;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        Product p1 =new Product("Quần hoa",100,"hehe",10,1);
        productService.createProduct(p1);
    }
}
