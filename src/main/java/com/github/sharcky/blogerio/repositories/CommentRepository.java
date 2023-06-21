package com.github.sharcky.blogerio.repositories;

import com.github.sharcky.blogerio.models.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Integer> {
}
