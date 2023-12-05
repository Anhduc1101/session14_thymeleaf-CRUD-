package com.ra.controller.admin;

import com.ra.model.entity.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class CategoryController {
@RequestMapping("/category")
    public String index(Model model){
    List<Category> categories = new ArrayList<>();
    categories.add(new Category(1,"ao",true));
    categories.add(new Category(2,"quan",true));
    categories.add(new Category(3,"vi",true));
    model.addAttribute("list",categories);
    return "admin/category/index";
}

@GetMapping("/add")
public String addCategory(Model model){
    Category cat = new Category();
    model.addAttribute("cat",cat);
    return "admin/category/add";
}
@PostMapping("/category")
    public String add(@ModelAttribute("category") Category category){
    System.out.println(category.getCategoryId());
    return "admin/category/add";
}
}
