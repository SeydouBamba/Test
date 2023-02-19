package sn.esmt.admin.ws;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import sn.esmt.admin.doa.AppRoleRepository;
import sn.esmt.admin.entities.AppRoleEntity;

import java.util.List;
@RestController
@RequestMapping(value = "/users")
@AllArgsConstructor
public class AppRoleController {
    private AppRoleRepository appRoleRepository;

    //fonction d'insertion dans la base
    @PostMapping(path = "/save")//Request POST
    public AppRoleEntity save(@RequestBody AppRoleEntity appRoleEntity){
        return appRoleRepository.save(appRoleEntity);
    }

    @GetMapping(path = "/login")//Request POST
    public AppRoleEntity login(@RequestParam int id){
        return appRoleRepository.findById(id);
    }

    //Fonction qui retourne les résultats sous forme de liste
    @GetMapping(path = "/all")
    public List<AppRoleEntity> getAll(){
        return appRoleRepository.findAll();
    }
}
