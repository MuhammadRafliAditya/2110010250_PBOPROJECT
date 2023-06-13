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
public class dsjenis {
    private ArrayList<String> ID_jenis;
    private ArrayList<String> NM_jenis;
    
    public dsjenis() {
        ID_jenis = new ArrayList<String>();
        NM_jenis = new ArrayList<String>();
    }
    
    public void insertID_jenis(String isi){
        this.ID_jenis.add(isi);
    }
    public ArrayList<String> getRecordID_jenis(){
        return this.ID_jenis;
    }
    
    public void insertNM_jenis(String isi){
        this.NM_jenis.add(isi);
    }
    public ArrayList<String> getRecordNM_jenis(){
        return this.NM_jenis;
    }
    
    public void insertBarang(String ID_jenis, String NM_jenis){
        this.ID_jenis.add(ID_jenis);
        this.NM_jenis.add(NM_jenis);
        
    }
    
}
