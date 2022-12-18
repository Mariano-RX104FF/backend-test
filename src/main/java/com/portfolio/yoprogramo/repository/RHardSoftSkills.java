package com.portfolio.yoprogramo.repository;

import com.portfolio.yoprogramo.model.HardSoftSkills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHardSoftSkills extends JpaRepository<HardSoftSkills, Integer>{
    public Optional<HardSoftSkills> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
