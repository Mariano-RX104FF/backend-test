package com.portfolio.yoprogramo.service;

import com.portfolio.yoprogramo.model.HardSoftSkills;
import com.portfolio.yoprogramo.repository.RHardSoftSkills;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHardSoftSkills {

    @Autowired
    RHardSoftSkills rHardSoftSkills;

    public List<HardSoftSkills> list() {
        return rHardSoftSkills.findAll();
    }

    public Optional<HardSoftSkills> getOne(int id) {
        return rHardSoftSkills.findById(id);
    }

    public Optional<HardSoftSkills> getByNombre(String nombre) {
        return rHardSoftSkills.findByNombre(nombre);
    }

    public void save(HardSoftSkills skill) {
        rHardSoftSkills.save(skill);
    }

    public void delete(int id) {
        rHardSoftSkills.deleteById(id);
    }

    public boolean existsById(int id) {
        return rHardSoftSkills.existsById(id);
    }

    public boolean existsByNombre(String nombre) {
        return rHardSoftSkills.existsByNombre(nombre);
    }
}
