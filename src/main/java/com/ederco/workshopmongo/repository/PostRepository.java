package com.ederco.workshopmongo.repository;

import com.ederco.workshopmongo.domain.Post;
import com.ederco.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
