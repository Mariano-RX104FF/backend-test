package com.portfolio.yoprogramo.security.repository;

import com.portfolio.yoprogramo.security.entity.Rol;
import com.portfolio.yoprogramo.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {

    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}

