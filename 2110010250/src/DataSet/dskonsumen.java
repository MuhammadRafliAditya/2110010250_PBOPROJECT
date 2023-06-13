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
public class dskonsumen {
    private ArrayList<String> ID_konsumen;
    private ArrayList<String> NM_konsumen;
    private ArrayList<String> Alamat;
    private ArrayList<String> Telepon;
    
    public dskonsumen() {
    ID_konsumen = new ArrayList<String>();
    NM_konsumen = new ArrayList<String>();
    Alamat = new ArrayList<String>();
    Telepon = new ArrayList<String>();
    }
    
    public void insertID_konsumen(String isi){
        this.ID_konsumen.add(isi);
    }
    public ArrayList<String> getRecordID_konsumen(){
        return this.ID_konsumen;
    }
    
    public void insertNM_konsumen(String isi){
        this.NM_konsumen.add(isi);
    }
    public ArrayList<String> getRecordNM_konsumen(){
        return this.NM_konsumen;
    }
    
    public void insertAlamat(String isi){
        this. Alamat.add(isi);
    }
    public ArrayList<String> getRecordAlamat(){
        return this.Alamat;
    }
    
    public void insertTelepon(String isi){
        this.Telepon.add(isi);
    }
    public ArrayList<String> getRecordTelepon(){
        return this.Telepon;
    }
    
    public void insertBarang(String ID_konsumen, String NM_konsumen, String Alamat, String Telepon){
        this.ID_konsumen.add(ID_konsumen);
        this.NM_konsumen.add(NM_konsumen);
        this.Alamat.add(Alamat);
        this.Telepon.add(Telepon);
        
    }
}
    
