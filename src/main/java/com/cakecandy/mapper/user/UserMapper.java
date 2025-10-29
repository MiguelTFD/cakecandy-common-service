package com.cakecandy.mapper.user;

import com.cakecandy.dto.user.UserRequestDto;
import com.cakecandy.dto.user.UserResponseDto;
import com.cakecandy.entity.Role;
import com.cakecandy.entity.User;
import com.cakecandy.mapper.role.RoleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMapper {

  private final RoleMapper roleMapper;

  public UserResponseDto responseDto(User user) {
    if (user == null)
      return null;
    return UserResponseDto.builder()
        .userId(user.getUserId())
        .username(user.getUsername())
        .password(user.getPassword())
        .firstName(user.getFirstName())
        .lastName(user.getLastName())
        .phone(user.getPhone())
        .email(user.getEmail())
        .role(roleMapper.responseDto(user.getRole()))
        .build();
  }

  public User toUserEntity(UserRequestDto requestDto, Role role) {
    if (requestDto == null || role == null)
      return null;
    return User.builder()
        .username(requestDto.getUsername())
        .password(requestDto.getPassword())
        .firstName(requestDto.getFirstName())
        .lastName(requestDto.getLastName())
        .phone(requestDto.getPhone())
        .email(requestDto.getEmail())
        .role(role)
        .build();
  }
}
