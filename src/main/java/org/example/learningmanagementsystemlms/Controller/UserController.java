package org.example.learningmanagementsystemlms.Controller;

import org.example.learningmanagementsystemlms.Service.UserService;
import org.example.learningmanagementsystemlms.dto.UserRegistrationDto;
import org.example.learningmanagementsystemlms.dto.UserResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserResponseDto> registerUser(@RequestBody UserRegistrationDto dto) {
        UserResponseDto response = userService.registerUser(dto);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDto> getUserById(@PathVariable Long id) {
        UserResponseDto response = userService.getUserById(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDto>> getAllUsers() {
        List<UserResponseDto> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String , String>> login (@RequestParam String email , @RequestParam String password) {
        userService.login(email, password);
        Map<String, String> response = new HashMap<>() ;
        if (userService.check_user_authentication()) {
            response.put("message" , "Done") ;
            return ResponseEntity.ok(response) ;
        }
        response.put("message" , "Invalid credentials") ;
        return ResponseEntity.status(400).body(response);
    }

    @PostMapping("/logout")
    public ResponseEntity<Map<String , String>>logout () {
        userService.logout();
        Map<String, String> response = new HashMap<>() ;
        response.put("message" , "Done") ;
        return ResponseEntity.ok(response) ;
    }
}
