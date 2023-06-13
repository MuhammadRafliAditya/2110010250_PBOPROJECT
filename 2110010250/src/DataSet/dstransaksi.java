/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataSet;
import java.util.ArrayList;
/**
 *
 * @author Jared
 */
public class dstransaksi {
    private ArrayList<String> ID_trans;
    private ArrayList<String> ID_jual;
    private ArrayList<String> ID_beli;
    private ArrayList<String> TOT_jumlah;
    private ArrayList<String> TOT_hargabeli;
    private ArrayList<String> TOT_hargajual;
    private ArrayList<String> Status;
    
    public dstransaksi() {
        ID_trans = new ArrayList<String>();
        ID_jual = new ArrayList<String>();
        ID_beli = new ArrayList<String>();
        TOT_jumlah = new ArrayList<String>();
        TOT_hargabeli = new ArrayList<String>();
        TOT_hargajual = new ArrayList<String>();
        Status = new ArrayList<String>();
    }
    
    public void insertID_trans(String isi){
        this.ID_trans.add(isi);
    }
    public ArrayList<String> getRecordID_trans(){
        return this.ID_trans;
    }
    
    public void insertID_jual(String isi){
        this.ID_jual.add(isi);
    }
    public ArrayList<String> getRecordID_jual(){
        return this.ID_jual;
    }
    
    public void insertID_beli(String isi){
        this.ID_beli.add(isi);
    }
    public ArrayList<String> getRecordID_beli(){
        return this.ID_beli;
    }
    
    public void insertTOT_jumlah(String isi){
        this.TOT_jumlah.add(isi);
    }
    public ArrayList<String> getRecordTOT_jumlah(){
        return this.TOT_jumlah;
    }
    
    public void insertTOT_hargabeli(String isi){
        this.TOT_hargabeli.add(isi);
    }
    public ArrayList<String> getRecordTOT_hargabeli(){
        return this.TOT_hargabeli;
    }
    
    public void insertTOT_hargajual(String isi){
        this.TOT_hargajual.add(isi);
    }
    public ArrayList<String> getRecordTOT_hargajual(){
        return this.TOT_hargajual;
    }
    
    public void insertStatus(String isi){
        this.Status.add(isi);
    }
    public ArrayList<String> getRecordStatus(){
        return this.Status;
    }
    
    public void insertPelanggan(String ID_trans, String ID_jual, String ID_beli, String TOT_jumlah, 
            String TOT_hargabeli, String TOT_hargajual, String Status){
        this.ID_trans.add(ID_trans);
        this.ID_jual.add(ID_jual);
        this.ID_beli.add(ID_beli);
        this.TOT_jumlah.add(TOT_jumlah);
        this.TOT_hargabeli.add(TOT_hargabeli);
        this.TOT_hargajual.add(TOT_hargajual);
        this.Status.add(Status);
    }
       
}
    
    
