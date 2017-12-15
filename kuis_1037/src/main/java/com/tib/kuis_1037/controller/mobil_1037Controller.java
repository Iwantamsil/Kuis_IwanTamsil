/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1037.controller;

import com.tib.kuis_1037.entity.Mobil_1037;
import com.tib.kuis_1037.service.mobil_1037Service;
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
@RequestMapping("/mobil_1037")
public class mobil_1037Controller {

    @Autowired
    private mobil_1037Service mobil_1037Service;

    @RequestMapping(method = RequestMethod.POST)
    public Mobil_1037 insert(@RequestBody Mobil_1037 mobil_1037) {
        return mobil_1037Service.insert(mobil_1037);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Mobil_1037 update(@RequestBody Mobil_1037 mobil_1037) {
        return mobil_1037Service.update(mobil_1037);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id_mobil}")
    public boolean delete(@PathVariable("id_mobil") Long id) {
        return mobil_1037Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id_mobil}")
    public Mobil_1037 getById(@PathVariable("id_mobil_1037") Long id_mobil){
        return mobil_1037Service.getById(id_mobil);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Mobil_1037> getAll(){
        return mobil_1037Service.getAll();
    }
}

   

