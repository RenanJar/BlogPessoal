package com.example.blogpessoal.Repository;

import com.example.blogpessoal.Model.PostagemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<PostagemModel,Long> {

}
