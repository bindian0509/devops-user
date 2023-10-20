package com.bharat.devops.user.mapper;

import com.bharat.devops.user.dto.UserDTO;

import com.bharat.devops.user.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
/*
 * @author Bharat V. <bindian0509@gmail.com>
 * @created Thursday, 18 January 2024
 */
@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User mapUserDTOToUser(UserDTO userDTO);
    UserDTO mapUserToUserDTO(User user);

}

