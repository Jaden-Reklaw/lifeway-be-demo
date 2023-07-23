package com.lifeway.demo.mapper;

import com.lifeway.demo.dto.UserUpdateRequestDTO;
import com.lifeway.demo.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User mapToUser(User currentUser, UserUpdateRequestDTO userUpdateRequestDTO) {

        if(userUpdateRequestDTO.getFirstName() != null) {
            currentUser.setFirstName(userUpdateRequestDTO.getFirstName());
        }

        if(userUpdateRequestDTO.getLastName() != null) {
            currentUser.setLastName(userUpdateRequestDTO.getLastName());
        }

        if(userUpdateRequestDTO.getMobileNumber() != null) {
            currentUser.setMobileNumber(userUpdateRequestDTO.getMobileNumber());
        }

        return currentUser;
    }
}
