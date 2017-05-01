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

/**
 *
 * @author shibo
 */
public class Delete implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        ModelAndView modelAndView = new ModelAndView("showProducts");
        ProductDao x = new ProductDao();
        modelAndView.addObject("list", x.listProducts());
        x.deleteProduct(Integer.parseInt(hsr.getParameter("id")));
        return modelAndView;

    }

}
