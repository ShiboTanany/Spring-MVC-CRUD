/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;

/**
 *
 * @author shibo
 */
public interface productDao {

    public void addProduct(Product product);

    public void deleteProduct(int id);

    public void updateProduct(Product product);

    public List<Product> listProducts();
}
