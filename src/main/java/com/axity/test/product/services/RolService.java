package com.axity.test.product.services;

import com.axity.test.product.repository.RolRepository;
import com.axity.test.product.repository.datamodel.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/rol")
public class RolService {
    @Autowired
    private RolRepository rolRepository;

    @GetMapping("/getRoles")
    public List<Rol> getRoles() {
        return rolRepository.findAll();
    }
    @PostMapping("/createRol")
    public Rol addRol(@RequestBody Rol rol) {
        return rolRepository.save(rol);
    }
    @PutMapping("/updateRol/{id_rol}")
    public Rol updateRol(@PathVariable int id_rol, @RequestBody Rol rol) {
        return rolRepository.save(rol);
    }

    @DeleteMapping("/deleteRole/{id_rol}")
    public void deleteRol(@PathVariable int id_rol) {
        rolRepository.deleteById(id_rol);
    }

}
