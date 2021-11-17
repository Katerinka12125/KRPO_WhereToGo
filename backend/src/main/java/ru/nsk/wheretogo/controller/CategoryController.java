package ru.nsk.wheretogo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.nsk.wheretogo.dto.CategoryDTO;
import ru.nsk.wheretogo.service.CategoryService;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService service;

    @DeleteMapping("/deletecategory/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable long id) {
        service.deleteCategory(new CategoryDTO().setId(id));
        return new ResponseEntity<>("Is already delete", HttpStatus.NO_CONTENT);
    }
    @GetMapping("/categories")
     public ResponseEntity<List<CategoryDTO>> getCategories() {
      return new ResponseEntity<>(service.getAllcategories(), HttpStatus.OK);
  }

    @PostMapping("/addcategory")
    public ResponseEntity<String> addCategory(@RequestBody CategoryDTO categoryDTO) {
        service.addCategory(categoryDTO);
        return ResponseEntity.ok("Category added");
    }
}

