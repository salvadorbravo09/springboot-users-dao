package com.springboot.dao.presentation.controller;

import com.springboot.dao.presentation.dtos.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping("/find")
    public ResponseEntity<List<UserDTO>> findAll() {
        return null;
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<UserDTO> findAll(@PathVariable Long id) {
        return null;
    }

    @PostMapping("/create")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
        return null;
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userDTO, @PathVariable Long id) {
        return null;
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        return null;
    }
}
