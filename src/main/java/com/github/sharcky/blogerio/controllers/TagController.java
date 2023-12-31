package com.github.sharcky.blogerio.controllers;

import com.github.sharcky.blogerio.models.Tag;
import com.github.sharcky.blogerio.repositories.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tag")
public class TagController {

    @Autowired
    private TagRepository tagRepository;

    @GetMapping("/")
    public ResponseEntity<List<Tag>> findAllTags(){
        List<Tag> tagList = (List<Tag>) tagRepository.findAll();
        return new ResponseEntity<>(tagList, HttpStatus.OK);
    }

    @GetMapping("/{code}")
    public ResponseEntity<Tag> findTagById(@PathVariable("code") Integer code) {
        Optional<Tag> tag = tagRepository.findById(code);
        return tag.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/post")
    public ResponseEntity<Tag> postTag(@RequestBody Tag tag) {
        Tag savedTag = tagRepository.save(tag);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTag);
    }

    @DeleteMapping("/remove/{code}")
    public ResponseEntity<Integer> deleteTag(@PathVariable("code") Integer code) {
        try {
            tagRepository.deleteById(code);
            return new ResponseEntity<>(code, HttpStatus.OK);
        } catch (EmptyResultDataAccessException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
