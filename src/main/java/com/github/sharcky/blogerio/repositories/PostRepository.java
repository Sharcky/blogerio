package com.github.sharcky.blogerio.repositories;

import com.github.sharcky.blogerio.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Integer> {
}
