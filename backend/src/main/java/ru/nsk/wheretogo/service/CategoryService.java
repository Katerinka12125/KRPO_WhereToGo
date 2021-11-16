package ru.nsk.wheretogo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nsk.wheretogo.entity.Category;
import ru.nsk.wheretogo.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> saveCategory(List<Category> categories) {
        return repository.saveAll(categories);

    }

    public Category saveCategory(Category categories) {
        return repository.save(categories);

    }

    public List<Category> getAll() {
        return repository.findAll();
    }

    public Category getCategoryByName(String name) {
        return repository.findByName(name);

    }
    public String deleteCategory(long id) {
        repository.deleteById(id);
        return "category doesn't exists" + id;

    }

    public Category updateCategory(Category category) {
        Category existingCategory = repository.findById(category.getId()).orElse(null);
        existingCategory.setName(category.getName());
        return repository.save(existingCategory);
    }
}
