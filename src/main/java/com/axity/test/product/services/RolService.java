package com.axity.test.product.services;

import com.axity.test.product.repository.RolRepository;
import com.axity.test.product.repository.datamodel.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RolService {
    @Autowired
    private RolRepository rolRepository;

    @GetMapping("/roles")
    public List<Rol> getRoles() {
        return rolRepository.findAll();
    }
    @PostMapping("/rol")
    public Rol addRol(@RequestBody Rol rol) {
        return rolRepository.save(rol);
    }

}
