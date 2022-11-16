package com.ederco.workshopmongo.services;

import com.ederco.workshopmongo.domain.Post;
import com.ederco.workshopmongo.domain.User;
import com.ederco.workshopmongo.dto.UserDTO;
import com.ederco.workshopmongo.repository.PostRepository;
import com.ederco.workshopmongo.repository.UserRepository;
import com.ederco.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post>  findByTitle(String text){
        return repo.findByTitleContainingIgnoreCase(text);
    }
}

