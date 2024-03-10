package com.dsi.chaldal.services;

import com.dsi.chaldal.dtos.UserDTO;
import com.dsi.chaldal.models.User;
import com.dsi.chaldal.repositories.UserRepository;

public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public UserDTO createUser(UserDTO userDTO) {
    User userModel = new User();
    userModel.setName(userDTO.getName());
    userModel.setEmail(userDTO.getEmail());
    userModel.setPassword(userDTO.getPassword());
    userRepository.save(userModel);

    return userDTO;
  }

  @Override
  public void deleteUser(Long id) {
    userRepository.deleteById(id);
  }

  @Override
  public UserDTO getUser(Long id) {
    User userModel = userRepository.findById(id).orElse(null);
    return userModel != null
        ? new UserDTO(userModel.getId(), userModel.getName(), userModel.getEmail(), userModel.getPassword())
        : null;
  }

  @Override
  public UserDTO updateUser(UserDTO userDTO) {
    User userModel = userRepository.findById(userDTO.getId()).orElse(null);
    if (userModel != null) {
      if (userDTO.getEmail() != null || "".equals(userDTO.getEmail()))
        userModel.setEmail(userDTO.getEmail());
      if (userDTO.getName() != null || "".equals(userDTO.getName()))
        userModel.setName(userDTO.getName());
      if (userDTO.getPassword() != null || "".equals(userDTO.getPassword()))
        userModel.setPassword(userDTO.getPassword());
    }

    return userDTO;
  }

}
