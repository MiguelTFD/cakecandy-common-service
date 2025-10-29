package com.cakecandy.entity;

import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id")
  private Long userId;

  @Column(name = "username", nullable = false, unique = true)
  private String username;

  @Column(name = "password", nullable = false)
  private String password;

  @Column(name = "first_name", nullable = false)
  private String firstName;

  @Column(name = "last_name", nullable = false)
  private String lastName;

  @Column(name = "phone", nullable = false)
  private String phone;

  @Column(name = "email", nullable = false, unique = true)
  private String email;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "role_id", nullable = false)
  private Role role;

  @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
  private List<Address> addresses;

  @OneToOne(mappedBy = "user")
  private IdentityDocument identityDocument;

  @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
  private List<Order> orders;
}
