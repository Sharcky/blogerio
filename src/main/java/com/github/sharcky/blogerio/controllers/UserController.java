package com.github.sharcky.blogerio.controllers;

import com.github.sharcky.blogerio.models.Usuario;
import com.github.sharcky.blogerio.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/usuario")
public class UserController {
    
    
    private final UserRepository userRepository;

    @GetMapping("/")
    public ResponseEntity<List<Usuario>> getUsuarios() {
        List<Usuario> Usuarios = (List<Usuario>) userRepository.findAll();
        return new ResponseEntity<>(Usuarios, HttpStatus.OK);
    }

    @GetMapping("/{code}")
    public ResponseEntity<Usuario> getUsuario(@PathVariable("code") Integer code) {
        Optional<Usuario> Usuario = userRepository.findById(code);
        return Usuario.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/post")
    public ResponseEntity<Usuario> postUsuario(@RequestBody Usuario Usuario) {
        Usuario savedUsuario = userRepository.save(Usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUsuario);
    }

    @DeleteMapping("/remove/{code}")
    public ResponseEntity<Integer> deleteUsuario(@PathVariable("code") Integer code) {
        try {
            userRepository.deleteById(code);
            return new ResponseEntity<>(code, HttpStatus.OK);
        } catch (EmptyResultDataAccessException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
