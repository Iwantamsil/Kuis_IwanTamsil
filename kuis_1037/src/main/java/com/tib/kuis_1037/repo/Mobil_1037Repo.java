/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1037.repo;

import com.tib.kuis_1037.entity.Mobil_1037;
import java.util.List;
import java.util.Locale;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Mahasiswa
 */
public interface Mobil_1037Repo extends CrudRepository<Mobil_1037, Long> { 
    
     @Query("select c from mobil c")
   

    public Mobil_1037 save(Mobil_1037 mobil_1037);

    public List<Mobil_1037> findAllMobil_1037();
}


