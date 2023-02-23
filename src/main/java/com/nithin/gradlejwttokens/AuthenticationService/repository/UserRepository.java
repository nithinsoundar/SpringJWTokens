package com.nithin.gradlejwttokens.AuthenticationService.repository;

import com.nithin.gradlejwttokens.AuthenticationService.Model.Role;
import com.nithin.gradlejwttokens.AuthenticationService.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    User findByUsernameAndPassword(String name, String password);

    User findByUsernameAndRole(String username, Role role);

    User findByUsername(String username);
}

