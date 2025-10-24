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
	
  @Column(name = "user_email", nullable = false, unique = true)
	private String userEmail;

  @Column(name = "user_password", nullable = false)
	private String userPassword;

	@Column(name = "user_first_name", nullable = false)
	private String userFirstName;

	@Column(name = "user_last_name", nullable = false)
	private String userLastName;
	
	@Column(name = "phone", nullable = false)
	private String phone;

  @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "role_id", nullable = false)
	private Role role;

  @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Order> orders;
}
