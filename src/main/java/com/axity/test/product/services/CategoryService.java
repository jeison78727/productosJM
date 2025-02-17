package com.axity.test.product.services;

import com.axity.test.product.repository.CategoryRepository;
import com.axity.test.product.repository.datamodel.CategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/getCategories")
    public List<CategoryEntity> getCategories() {
        return categoryRepository.findAll();
    }
    @PostMapping("/createCategory")
    public CategoryEntity addCategory(@RequestBody CategoryEntity category) {
        return categoryRepository.save(category);
    }
    @PutMapping("/updateCategory/{id_category}")
    public CategoryEntity updateCategory(@PathVariable int id_category, @RequestBody CategoryEntity category) {
        return categoryRepository.save(category);
    }

    @DeleteMapping("/deleteCategory/{id_category}")
    public void deleteCategory(@PathVariable int id_category) {
        categoryRepository.deleteById(id_category);
    }
}
