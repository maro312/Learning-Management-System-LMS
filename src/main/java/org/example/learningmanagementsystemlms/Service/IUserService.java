package org.example.learningmanagementsystemlms.Service;

import org.example.learningmanagementsystemlms.dto.UserRegistrationDto;
import org.example.learningmanagementsystemlms.dto.UserResponseDto;
import java.util.List;

public interface IUserService {
    UserResponseDto registerUser(UserRegistrationDto userRegistrationDto);
    UserResponseDto getUserById(Long id);
    List<UserResponseDto> getAllUsers();

    void login (String email , String password) ;
    void logout() ;
}
