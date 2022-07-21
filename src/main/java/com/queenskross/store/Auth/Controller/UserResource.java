package com.queenskross.store.Auth.Controller;


import com.queenskross.store.Auth.model.Role;
import com.queenskross.store.Auth.model.User;
import com.queenskross.store.Auth.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class UserResource {
    private final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok().body(userService.getUsers());
    }

    @PostMapping("/user/save")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/auth/user/save").toUriString());
        return ResponseEntity.created(uri).body(userService.saveUser(user));

    }

    @PostMapping("/role/save")
    public ResponseEntity<Role> saveRole(@RequestBody Role role) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/auth/role/save").toUriString());
        return ResponseEntity.created(uri).body(userService.saveRole(role));

    }

    @PostMapping("/role/addtouser")
    public ResponseEntity<?> addUserToRole(@RequestBody RoleToUserForm form) {


         userService.addRoleToUser(form.getEmail(), form.getRolenanme());
        return ResponseEntity.ok().build();

    }



    @Data @AllArgsConstructor @NoArgsConstructor
    class RoleToUserForm {
        private String email;
        private String rolenanme;
    }
}
