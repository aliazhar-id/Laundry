/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundrypbo.apps.controller;

import com.mysql.jdbc.Connection;
import laundrypbo.apps.database.KonekDB;

/**
 *
 * @author user
 */
public class ManageData {
    
    Connection koneksi;
    String action;
    
    public ManageData(java.awt.Frame parent, boolean modal, String act, String ID){
        super(parent, modal);
        initComponents();
        koneksi = KonekDB.getKoneksi("localhost", "3306", "root", "", "laundry");
    }
}
