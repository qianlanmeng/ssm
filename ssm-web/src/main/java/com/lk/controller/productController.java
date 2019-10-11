package com.lk.controller;

import com.lk.domain.Product;
import com.lk.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
@RequestMapping("/product")
public class productController {

    @Autowired
    private ProductService productService;


    @RequestMapping("findAll.do")
    public ModelAndView findAll () {

        ModelAndView modelAndView = new ModelAndView();
        List<Product> list = productService.findAll();
        modelAndView.addObject("productList",list);

        modelAndView.setViewName("product-list");
        return  modelAndView;

    }
    @RequestMapping("save.do")
    public String save(Product product){
        productService.save(product);
        return "redirect:findAll.do";
    }

    @RequestMapping("update.do")
    public String update(Product product){
        productService.save(product);
        return "redirect:findAll.do";
    }

}
