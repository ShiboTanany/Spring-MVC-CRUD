/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author shibo
 */
public class ProductDao implements productDao {

    static List<Product> productList = new ArrayList<>();
    

    @Override
    public void addProduct(Product product) {
        productList.add(product);
        System.out.println("added"+product);
    }

    @Override
    public void deleteProduct(int id) {

        for (Iterator<Product> iterator = productList.iterator(); iterator.hasNext();) {
            Product product = iterator.next();
            if (product.getId() == id) {
                // Remove the current element from the iterator and the list.
                iterator.remove();
            }

        }
    }

    @Override
    public void updateProduct(Product product2) {
        for (Iterator<Product> iterator = productList.iterator(); iterator.hasNext();) {
            Product product = iterator.next();
            if (product.getId() == product2.getId()) {

                product = product2;
            }

        }

    }

    @Override
    public List<Product> listProducts() {
        return productList;
    }

}
