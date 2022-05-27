package com.example.blogpessoal.Controller;

import com.example.blogpessoal.Model.PostagemModel;
import com.example.blogpessoal.Repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/postagens")
@CrossOrigin(origins= "*",allowedHeaders = "*")
public class PostagemController {

    @Autowired
    private PostagemRepository postagemRepository;

    @GetMapping
    public ResponseEntity<List<PostagemModel>> getAll(){
        return ResponseEntity.ok(postagemRepository.findAll());
    }


}
