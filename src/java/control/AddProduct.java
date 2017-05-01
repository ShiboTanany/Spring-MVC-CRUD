/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import daos.Product;
import daos.ProductDao;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
//import org.springframework.web.servlet.mvc.Controller;



/**
 *
 * @author shibo
 */
public class AddProduct  implements Controller{

   

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
       ModelAndView modelAndView=new ModelAndView("home");
        ProductDao x=new ProductDao();
        x.addProduct(new Product(1, "dsds", 5, "dsldks"));
        x.addProduct(new Product(2, "dsds", 5, "dsldks"));
        x.addProduct(new Product(3, "dsds", 5, "dsldks"));
        x.addProduct(new Product(4, "dsds", 5, "dsldks"));
        x.addProduct(new Product(5, "dsds", 5, "dsldks"));
        x.addProduct(new Product(6, "dsds", 5, "dsldks"));
        x.addProduct(new Product(7, "dsds", 5, "dsldks"));
        x.addProduct(new Product(8, "dsds", 5, "dsldks"));
        x.addProduct(new Product(9, "dsds", 5, "dsldks"));
        x.addProduct(new Product(10, "dsds", 5, "dsldks"));
        x.addProduct(new Product(Integer.parseInt(hsr.getParameter("id")), hsr.getParameter("name"), Integer.parseInt(hsr.getParameter("price")), hsr.getParameter("desc")));
       modelAndView.addObject("message", "successfully saved ");
       return modelAndView;
    
    }

   
    
}
