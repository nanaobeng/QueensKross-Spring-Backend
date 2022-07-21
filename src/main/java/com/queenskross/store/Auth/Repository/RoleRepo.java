package com.queenskross.store.Auth.Repository;

import com.queenskross.store.Auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
