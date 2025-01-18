package com.santiagomac.coworkingbooking.infrastructure.driven_adapter.adapter;

import com.santiagomac.coworkingbooking.domain.model.dto.UserDto;
import com.santiagomac.coworkingbooking.domain.repository.UserGateway;
import com.santiagomac.coworkingbooking.infrastructure.driven_adapter.entity.User;
import com.santiagomac.coworkingbooking.infrastructure.driven_adapter.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class UserRepositoryAdapter implements UserGateway {

  private final UserRepository userRepository;
  private final ModelMapper modelMapper;


  @Override
  public Optional<User> findByEmail(String email) {
    return this.userRepository.findByEmail(email);
  }

  @Override
  public UserDto save(User user) {
    return modelMapper.map(this.userRepository.save(user), UserDto.class);
  }
}
