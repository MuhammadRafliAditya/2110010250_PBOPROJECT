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
public class dsjual {
    private ArrayList<String> ID_jual;
    private ArrayList<String> ID_jenis;
    private ArrayList<String> ID_barang;
    private ArrayList<String> JML_jual;
    private ArrayList<String> TGL_transaksi;
    private ArrayList<String> ID_konsumen;
    
    public dsjual() {
        ID_jual = new ArrayList<String>();
        ID_jenis = new ArrayList<String>();
        ID_barang = new ArrayList<String>();
        JML_jual = new ArrayList<String>();
        TGL_transaksi = new ArrayList<String>();
        ID_konsumen = new ArrayList<String>();
    }
    
    public void insertID_jual(String isi){
        this.ID_jual.add(isi);
    }
    public ArrayList<String> getRecordID_jual(){
        return this.ID_jual;
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
    
    public void insertJML_jual(String isi){
        this.JML_jual.add(isi);
    }
    public ArrayList<String> getRecordJML_jual(){
        return this.JML_jual;
    }
    
    public void insertTGL_transaksi(String isi){
        this.TGL_transaksi.add(isi);
    }
    public ArrayList<String> getRecordTGL_transaksi(){
        return this.TGL_transaksi;
    }
    
    public void insertID_konsumen(String isi){
        this.ID_konsumen.add(isi);
    }
    public ArrayList<String> getRecordID_konsumen(){
        return this.ID_konsumen;
    }
    
    public void insertBarang(String ID_jual, String ID_jenis, String ID_barang, String JML_jual, 
            String TGL_transaksi, String ID_konsumen){
        this.ID_jual.add(ID_jual);
        this.ID_jenis.add(ID_jenis);
        this.ID_barang.add(ID_barang);
        this.JML_jual.add(JML_jual);
        this.TGL_transaksi.add(TGL_transaksi);
        this.ID_konsumen.add(ID_konsumen);
        
    }
}
