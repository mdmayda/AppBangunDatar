/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appbangundatar;

/**
 *
 * @author User
 */
abstract class BangunDatar {
    private String namaBangunDatar;

    public BangunDatar() {
    }

    public BangunDatar(String namaBangunDatar) {
        this.namaBangunDatar = namaBangunDatar;
    }

    public String getNamaBangunDatar() {
        return namaBangunDatar;
    }

    public void setNamaBangunDatar(String namaBangunDatar) {
        this.namaBangunDatar = namaBangunDatar;
    }
    
    /* method untuk menghitung luas bangun datar*/
    abstract double luas();
    
    abstract double keliling();
    
}
