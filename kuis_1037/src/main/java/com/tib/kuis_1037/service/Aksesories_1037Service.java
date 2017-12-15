/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1037.service;

import com.tib.kuis_1037.entity.Aksesories_1037;
import com.tib.kuis_1037.entity.Mobil_1037;
import com.tib.kuis_1037.repo.Aksesories_1037Repo;
import com.tib.kuis_1037.repo.Mobil_1037Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mahasiswa
 */

    @Service("AksesoriesService")
@Transactional
public class Aksesories_1037Service {
     @Autowired
    private Aksesories_1037Repo repo;

    public Aksesories_1037 insert(Aksesories_1037 aksesories_1037) {
        return repo.save(aksesories_1037);
    }
    
    public Aksesories_1037 update(Aksesories_1037 aksesories_1037) {
        return repo.save(aksesories_1037);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Aksesories_1037 getById(Long id_aksesories){
        return repo.findOne(id_aksesories);
    }
    
    public List<Aksesories_1037> getAll(){
        return repo.findAllAksesories_1037();
    }
}


 
