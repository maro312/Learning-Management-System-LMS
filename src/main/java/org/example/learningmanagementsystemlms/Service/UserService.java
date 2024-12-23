package org.example.learningmanagementsystemlms.Service;

import org.example.learningmanagementsystemlms.Model.User;
import org.example.learningmanagementsystemlms.dto.UserRegistrationDto;
import org.example.learningmanagementsystemlms.dto.UserResponseDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService{

    private final List<User> users = new ArrayList<>();
    private Long userIdCounter = 1L;

    @Override
    public UserResponseDto registerUser(UserRegistrationDto dto) {
        User user = new User(userIdCounter++, dto.getName(), dto.getEmail(), dto.getPassword(), dto.getRole());
        users.add(user);
        return new UserResponseDto(user.getId(), user.getName(), user.getEmail(), user.getRole());
    }

    @Override
    public UserResponseDto getUserById(Long id) {
        Optional<User> userOptional = users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();

        if (userOptional.isEmpty()) {
            throw new RuntimeException("User not found!");
        }

        User user = userOptional.get();
        return new UserResponseDto(user.getId(), user.getName(), user.getEmail(), user.getRole());
    }

    @Override
    public List<UserResponseDto> getAllUsers() {
        return users.stream()
                .map(user -> new UserResponseDto(user.getId(), user.getName(), user.getEmail(), user.getRole()))
                .collect(Collectors.toList());
    }

    static User user = null ;

    public boolean check_user_authentication () {
        if (user == null) {
            return false ;
        }else {
            return true ;
        }
    }

    @Override
    public void login(String email , String password) {
        for (User system_user : users) {
            if (system_user.getEmail().equals(email) && system_user.getPassword().equals(password)) {
                user = system_user ;
                break;
            }
        }
    }

    @Override
    public void logout() {
        user = null ;
    }
}
