/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1037.repo;

import com.tib.kuis_1037.entity.Aksesories_1037;
import com.tib.kuis_1037.entity.Mobil_1037;
import java.util.List;
import java.util.Locale;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Mahasiswa
 */
public interface Aksesories_1037Repo extends CrudRepository<Aksesories_1037, Long> { 
    
     @Query("select c from aksesories c")
   

    public List<Aksesories_1037> findAllAksesories_1037();

     
    @Query("select p from aksesories p where p.mobil.id_mobil= :id_mobil")
    public List<Aksesories_1037> findByAksesories(@Param("id_mobil") Long id_mobil);
    
  
}


