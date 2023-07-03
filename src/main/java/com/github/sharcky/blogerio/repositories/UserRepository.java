package com.github.sharcky.blogerio.repositories;

import com.github.sharcky.blogerio.models.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Usuario, Integer> {
}
