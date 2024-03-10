package com.dsi.chaldal.dtos;


@lombok.Data
@lombok.AllArgsConstructor
public class UserDTO {
  private Long id;
  private String name;
  private String email;
  private String password;
}
