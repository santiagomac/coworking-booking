package com.santiagomac.coworkingbooking.infrastructure.driven_adapter.repository;

import com.santiagomac.coworkingbooking.infrastructure.driven_adapter.entity.RoleEntity;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, UUID> {

}
