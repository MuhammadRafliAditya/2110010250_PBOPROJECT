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
public class dsbeli {
    private ArrayList<String> ID_beli;
    private ArrayList<String> ID_jenis;
    private ArrayList<String> ID_barang;
    private ArrayList<String> JM_beli;
    private ArrayList<String> TGL_beli;
    
    public dsbeli(){
        ID_beli = new ArrayList<String>();
        ID_jenis = new ArrayList<String>();
        ID_barang = new ArrayList<String>();
        JM_beli = new ArrayList<String>();
        TGL_beli = new ArrayList<String>();
    }
    
    public void insertID_beli(String isi){
        this.ID_beli.add(isi);
    }
    public ArrayList<String> getRecordID_beli(){
        return this.ID_beli;
    }
    
    public void insertID_jenis(String isi){
        this.ID_jenis.add(isi);
    }
    public ArrayList<String> getRecordID_jenis(){
        return this.ID_jenis;
    }
    
    public void insertID_barang(String isi){
        this.ID_barang.add(isi);
    }
    public ArrayList<String> getRecordID_barang(){
        return this.ID_barang;
    }
    
    public void insertJM_beli(String isi){
        this.JM_beli.add(isi);
    }
    public ArrayList<String> getRecordJM_beli(){
        return this.JM_beli;
    }
    
    public void insertTGL_beli(String isi){
        this.TGL_beli.add(isi);
    }
    public ArrayList<String> getRecordTGL_beli(){
        return this.TGL_beli;
    }
    
    public void insertPembelian(String ID_beli, String ID_jenis, String ID_barang, String JM_beli, 
            String TGL_beli){
        this.ID_beli.add(ID_beli);
        this.ID_jenis.add(ID_jenis);
        this.ID_barang.add(ID_barang);
        this.JM_beli.add(JM_beli);
        this.TGL_beli.add(TGL_beli);
    }
}
