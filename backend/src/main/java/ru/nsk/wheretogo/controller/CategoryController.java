package ru.nsk.wheretogo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.nsk.wheretogo.entity.Category;
import ru.nsk.wheretogo.service.CategoryService;

import java.util.List;

@RestController

public class CategoryController {

    @Autowired
    private CategoryService service;

    @PostMapping("/addcategories")
    public List <Category> addCategories(@RequestBody List <Category> category) {
        return service.saveCategory(category);
    }

    @PostMapping("/addcategory")
    public Category addCategory(@RequestBody Category category) {
        return service.saveCategory(category);
    }
    @GetMapping("/categories")
    public List<Category> findAllCategories() {
        return service.getAll();
    }
    @GetMapping("/category/{name}")
    public Category findCategoryByName(@PathVariable String name) {
        return service.getCategoryByName(name);
    }

  @PutMapping("/update")
    public Category updateCategory(@RequestBody Category category) {
        return service.updateCategory(category);

    }

    @DeleteMapping("/delete/{id}")
    public String deleteCategory(@PathVariable  long id) {
        return service.deleteCategory(id);
    }

}
