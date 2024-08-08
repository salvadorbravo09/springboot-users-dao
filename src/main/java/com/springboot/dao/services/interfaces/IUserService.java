package com.springboot.dao.services.interfaces;

import com.springboot.dao.presentation.dtos.UserDTO;

import java.util.List;

public interface IUserService {

    List<UserDTO> findUsers();

    UserDTO findUserById(Long id);

    UserDTO createUser(UserDTO userDTO);

    UserDTO updateUser(UserDTO userDTO, Long id);

    String deleteUser(Long id);
}
