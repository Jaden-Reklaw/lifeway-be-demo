package com.lifeway.demo.service;

import com.lifeway.demo.dto.UserUpdateRequestDTO;
import com.lifeway.demo.mapper.UserMapper;
import com.lifeway.demo.model.User;
import com.lifeway.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createNewUser(User user) {

        return userRepository.save(user);
    }

    public User updateUserById(Long id, UserUpdateRequestDTO userUpdateRequestDTO) {

        Optional<User> fetchedUser = userRepository.findById(id);

        if(fetchedUser.isPresent()){

            User updatedUser = userMapper.mapToUser(fetchedUser.get(), userUpdateRequestDTO);

            return userRepository.save(updatedUser);
        } else {
            return null;
        }
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
