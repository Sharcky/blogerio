package com.github.sharcky.blogerio.repositories;

import com.github.sharcky.blogerio.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
