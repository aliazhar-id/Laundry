/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundrypbo.apps.entity;

import java.util.Objects;

/**
 *
 * @author azkaz
 */
public class Customer {
    

    public Customer(){
        
    }
    public Customer(String nama, int harga, String layanan, int berat, String tgl_masuk, String tgl_keluar){
        this.nama_customer = nama;
        this.harga = harga;
        this.layanan = layanan;
        this.berat = berat;
        this.tgl_keluar = tgl_keluar;
        this.tgl_masuk = tgl_masuk;
    }
    private int Id;
    private String nama_customer;
    private int harga;
    private String layanan;
    private int  berat;
    private String tgl_masuk;
    private String tgl_keluar;

    public String getNama_customer() {
        return nama_customer;
    }

    public void setNama_customer(String nama_customer) {
        this.nama_customer = nama_customer;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }



    public String getLayanan() {
        return layanan;
    }

    public void setLayanan(String layanan) {
        this.layanan = layanan;
    }

  

    public String getTgl_masuk() {
        return tgl_masuk;
    }

    public void setTgl_masuk(String tgl_masuk) {
        this.tgl_masuk = tgl_masuk;
    }

    public String getTgl_keluar() {
        return tgl_keluar;
    }

    public void setTgl_keluar(String tgl_keluar) {
        this.tgl_keluar = tgl_keluar;
    }
    
    @Override
    public int hashCode(){
        int hash = 7;
        hash = 23 * hash + this.Id;
        hash = 23 * hash + Objects.hashCode(this.nama_customer);
        hash = 23 * hash + Objects.hashCode(this.harga);
        hash = 23 * hash + Objects.hashCode(this.layanan);
        hash = 23 * hash + Objects.hashCode(this.berat);
        hash = 23 * hash + Objects.hashCode(this.tgl_masuk);
        hash = 23 * hash + Objects.hashCode(this.tgl_keluar);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        } 
        if(obj == null){
            return false;
        } 
        if(getClass() != obj.getClass()){
            return false;
        }
        final Customer other = (Customer) obj;
        if(this.Id != other.Id){
            return false;
        }
        
        if (!Objects.equals(this.nama_customer, other.nama_customer)){
            return false;
        }
        if(!Objects.equals(this.berat, other.berat)){
            return false;
        }
        if(!Objects.equals(this.harga, other.harga)){
            return false;
        }
        if(!Objects.equals(this.layanan, other.layanan)){
            return false;
        }
        if(!Objects.equals(this.tgl_masuk, other.tgl_masuk)){
            return false;
        }
        if(!Objects.equals(this.tgl_keluar, other.tgl_keluar)){
            return false;
        }
        
        return true;
    }
}
