package com.portfolio.yoprogramo.controller;

import com.portfolio.yoprogramo.dto.dtoHardSoftSkills;
import com.portfolio.yoprogramo.model.HardSoftSkills;
import com.portfolio.yoprogramo.security.controller.Mensaje;
import com.portfolio.yoprogramo.service.SHardSoftSkills;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skill")
@CrossOrigin(origins = "http://localhost:4200")
public class CHardSoftSkills {
    
    @Autowired
    SHardSoftSkills sHardSoftSkills;
    
    @GetMapping("/lista")
    public ResponseEntity<List<HardSoftSkills>> list() {
        List<HardSoftSkills> list = sHardSoftSkills.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<HardSoftSkills> getById(@PathVariable("id") int id) {
        if (!sHardSoftSkills.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        HardSoftSkills hardSoftSkills = sHardSoftSkills.getOne(id).get();
        return new ResponseEntity(hardSoftSkills, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sHardSoftSkills.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sHardSoftSkills.delete(id);
        return new ResponseEntity(new Mensaje("Skill eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoHardSoftSkills dtoskill) {
        if (StringUtils.isBlank(dtoskill.getNombre())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (sHardSoftSkills.existsByNombre(dtoskill.getNombre())) {
            return new ResponseEntity(new Mensaje("Ese skill ya existe"), HttpStatus.BAD_REQUEST);
        }

        HardSoftSkills hardSoftSkills = new HardSoftSkills(dtoskill.getNombre(), dtoskill.getPorcentaje(),dtoskill.getColorInicio(),dtoskill.getColorFinal());
        sHardSoftSkills.save(hardSoftSkills);

        return new ResponseEntity(new Mensaje("Skill agregada"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoHardSoftSkills dtoskill) {
        //Validamos si existe el ID
        if (!sHardSoftSkills.existsById(id)) {
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.NOT_FOUND);
        }
        //Compara nombre de experiencias
        if (sHardSoftSkills.existsByNombre(dtoskill.getNombre()) && sHardSoftSkills.getByNombre(dtoskill.getNombre()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Esa skill ya existe"), HttpStatus.BAD_REQUEST);
        }
        //No puede estar vacio
        if (StringUtils.isBlank(dtoskill.getNombre())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        HardSoftSkills hardSoftSkills = sHardSoftSkills.getOne(id).get();
        hardSoftSkills.setNombre(dtoskill.getNombre());
        hardSoftSkills.setPorcentaje((dtoskill.getPorcentaje()));
        hardSoftSkills.setColorInicio(dtoskill.getColorInicio());
        hardSoftSkills.setColorFinal(dtoskill.getColorFinal());
        

        sHardSoftSkills.save(hardSoftSkills);
        return new ResponseEntity(new Mensaje("Skill actualizada"), HttpStatus.OK);

    }
    
}
