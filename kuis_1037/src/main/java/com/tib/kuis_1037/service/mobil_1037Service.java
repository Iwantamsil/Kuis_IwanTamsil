/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1037.service;

import com.tib.kuis_1037.entity.Mobil_1037;
import com.tib.kuis_1037.repo.Mobil_1037Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mahasiswa
 */

  @Service("adminService")
@Transactional
public class mobil_1037Service {
     @Autowired
    private Mobil_1037Repo repo;

    public Mobil_1037 insert(Mobil_1037 mobil_1037) {
        return repo.save(mobil_1037);
    }
    
    public Mobil_1037 update(Mobil_1037 mobil_1037) {
        return repo.save(mobil_1037);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Mobil_1037 getById(Long id_admin){
        return repo.findOne(id_admin);
    }
    
    public List<Mobil_1037> getAll(){
        return repo.findAllMobil_1037();
    }
}


  

