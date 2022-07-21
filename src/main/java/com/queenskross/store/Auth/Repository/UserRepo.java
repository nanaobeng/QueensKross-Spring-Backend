package com.queenskross.store.Auth.Repository;

import com.queenskross.store.Auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
