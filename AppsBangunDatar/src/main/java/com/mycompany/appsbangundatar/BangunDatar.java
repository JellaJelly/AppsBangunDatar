/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appsbangundatar;

/**
 *
 * @author nazil
 */
abstract class BangunDatar {
    private String namaBagunDatar;

    public BangunDatar() {
    }

    public String getNamaBagunDatar() {
        return namaBagunDatar;
    }

    public void setNamaBagunDatar(String namaBagunDatar) {
        this.namaBagunDatar = namaBagunDatar;
    }
    
    /* Method untuk menghitung luas bangun datar*/
    
    abstract double luas();
    abstract double keliling();
}
