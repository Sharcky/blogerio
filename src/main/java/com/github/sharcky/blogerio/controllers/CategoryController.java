package com.github.sharcky.blogerio.controllers;


import com.github.sharcky.blogerio.models.Category;
import com.github.sharcky.blogerio.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/")
    public ResponseEntity<List<Category>> findAllCategories(){
        List<Category> tagList = (List<Category>) categoryRepository.findAll();
        return new ResponseEntity<>(tagList, HttpStatus.OK);
    }

    @GetMapping("/{code}")
    public ResponseEntity<Category> findCategoryById(@PathVariable("code") Integer code) {
        Optional<Category> tag = categoryRepository.findById(code);
        return tag.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/post")
    public ResponseEntity<Category> postCategory(@RequestBody Category category) {
        Category savedTag = categoryRepository.save(category);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTag);
    }

    @DeleteMapping("/remove/{code}")
    public ResponseEntity<Integer> deleteCategory(@PathVariable("code") Integer code) {
        try {
            categoryRepository.deleteById(code);
            return new ResponseEntity<>(code, HttpStatus.OK);
        } catch (EmptyResultDataAccessException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
