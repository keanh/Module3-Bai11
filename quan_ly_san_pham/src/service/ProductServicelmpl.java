package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServicelmpl implements ProductService {
    private static Map<Integer,Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put(1,new Product(1,"K20 Pro","7000000","Smart Phone","Xiaomi"));
        productMap.put(2,new Product(2,"Iphone XS","17000000","Smart Phone","Apple"));
        productMap.put(3,new Product(3,"Black Sharp","12000000","Smart Phone","Xiaomi"));
        productMap.put(4,new Product(4,"Oppo A73","4000000","Smart Phone","Oppo"));
        productMap.put(5,new Product(5,"Samsung Galaxy S10 plus","20000000","Smart Phone","Samsung"));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id,product);
    }

    @Override
    public void delete(int id) {
        productMap.remove(id);
    }
}
