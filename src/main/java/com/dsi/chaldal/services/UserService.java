package com.dsi.chaldal.services;

import org.springframework.stereotype.Service;

import com.dsi.chaldal.dtos.UserDTO;

@Service
public interface UserService {
  UserDTO createUser(UserDTO userDTO);
  UserDTO getUser(Long id);
  UserDTO updateUser(UserDTO userDTO);
  void deleteUser(Long id);
}
