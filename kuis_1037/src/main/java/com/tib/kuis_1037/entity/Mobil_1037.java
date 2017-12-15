/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1037.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Mahasiswa
 */

@Entity
@Table(name = "mobil")

public class Mobil_1037 implements Serializable {     
 

 
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_mobil;
   
    private String nama_mobil;
    @Column(length = 255, nullable = true)
    private String type_mobil;
     @Column(length = 255, nullable = true)
     
     private String harga_mobil;
     
    
    public Long getId_mobil() {
        return id_mobil;
    }

    public void setId_mobil(Long id_mobil) {
        this.id_mobil = id_mobil;
    }

    /**
     * @return the name
     */
    public String getnama_mobil() {
        return nama_mobil;
    }

    /**
     * @param name the name to set
     */
    public void setnama_mobil(String nama_mobil) {
        this.nama_mobil = nama_mobil;
    }

    /**
     * @return the description
     */
    public String gettype_mobil() {
        return type_mobil;
    }

    /**
     * @param description the description to set
     */
    public void settypemobil(String type_mobil) {
        this.type_mobil =type_mobil;
    }
    
     public String getharga_mobil() {
        return harga_mobil;
    }

    /**
     * @param description the description to set
     */
    public void setharga_mobil(String harga_mobil) {
        this.harga_mobil =harga_mobil;
    }
    
    
   

    /**
     * @return the name
     */
    
}

   

