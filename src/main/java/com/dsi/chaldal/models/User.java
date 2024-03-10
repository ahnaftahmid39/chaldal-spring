package com.dsi.chaldal.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
@lombok.Data
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", allocationSize = 1)
  private Long id;

  @Column(nullable = false, unique = false)
  private String name;

  @Column(nullable = false, unique = true)
  private String email;

  @Column(nullable = false, unique = false)
  private String password;
}
