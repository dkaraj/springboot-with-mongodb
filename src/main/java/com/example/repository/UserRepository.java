package com.example.repository;

import com.example.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<Users, Integer> {
}
