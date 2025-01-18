package com.santiagomac.coworkingbooking.infrastructure.driven_adapter.adapter;

import com.santiagomac.coworkingbooking.infrastructure.driven_adapter.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RoleRepositoryAdapter {

  private final RoleRepository roleRepository;

}
