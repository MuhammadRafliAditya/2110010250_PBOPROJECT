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
public class dsbarang {
    private ArrayList<String> ID_barang;
    private ArrayList<String> ID_jenis;
    private ArrayList<String> NM_barang;
    
    public dsbarang() {
        ID_barang = new ArrayList<String>();
        ID_jenis = new ArrayList<String>();
        NM_barang = new ArrayList<String>();
    }
    
    public void insertID_barang(String isi){
        this.ID_barang.add(isi);
    }
    public ArrayList<String> getRecordID_barang(){
        return this.ID_barang;
    }
    
    public void insertID_jenis(String isi){
        this.ID_jenis.add(isi);
    }
    public ArrayList<String> getRecordID_jenis(){
        return this.ID_jenis;
    }
    
    public void insertNM_barang(String isi){
        this.NM_barang.add(isi);
    }
    public ArrayList<String> getRecordNM_barang(){
        return this.NM_barang;
    }
    
    
    public void insertBarang(String ID_barang, String ID_jenis, String NM_barang){
        this.ID_barang.add(ID_barang);
        this.ID_jenis.add(ID_jenis);
        this.NM_barang.add(NM_barang);
        
    }
}
    
