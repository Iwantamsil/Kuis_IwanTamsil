/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1037.controller;

 
import com.tib.kuis_1037.entity.Aksesories_1037;
import com.tib.kuis_1037.service.Aksesories_1037Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mahasiswa
 */

    @RestController
@RequestMapping("/aksesories_1037")
public class Aksesories_1037Controller {

    @Autowired
    private Aksesories_1037Service aksesories_1037Service;

    @RequestMapping(method = RequestMethod.POST)
    public Aksesories_1037 insert(@RequestBody Aksesories_1037 aksesories_1037) {
        return aksesories_1037Service.insert(aksesories_1037);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Aksesories_1037 update(@RequestBody Aksesories_1037 aksesories_1037) {
        return aksesories_1037Service.update(aksesories_1037);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_aksesories}")
    public boolean delete(@PathVariable("id_aksesories") Long id) {
        return aksesories_1037Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id_aksesories}")
    public Aksesories_1037 getById(@PathVariable("id_aksesories") Long id_aksesories){
        return aksesories_1037Service.getById(id_aksesories);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Aksesories_1037> getAll(){
        return aksesories_1037Service.getAll();
    }
}

   