package org.example.springmvc.controller;

import org.example.springmvc.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ProductController {
    private List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "Apple", 1.20),
            new Product(2, "Banana", 0.75),
            new Product(3, "Cherry", 2.05)
    ));

    @GetMapping("/products")
    public String Products(Model model) {
        model.addAttribute("ProductInformation", "현재 판매 중인 상품 안내 페이지입니다.");

        model.addAttribute("products", products);
        return "products";
    }
}
