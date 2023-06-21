package com.github.sharcky.blogerio.repositories;

import com.github.sharcky.blogerio.models.Tag;
import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<Tag, Integer> {
}
