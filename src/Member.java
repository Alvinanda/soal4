/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author guest-84Oxfe
 */
public class Member {
    private String nama, team;
    private int umur, penampilan, suara, attitude, rata;
    
    Member(){
    nama="";
    team = "";
    umur= 0;
    penampilan = 0;
    suara = 0;
    attitude = 0;
     }
    
    public void setNama(String nama){
    this.nama = nama;
    }
    
    public void setTeam(String team){
    this.team = team;
    }
    
    public void setUmur(int umur){
    this.umur = umur;
    }
    
    public void setPenampilan(int nilai){
    penampilan = nilai;
    }
    
    public void setSuara(int nilai){
    suara = nilai;
    }
    
    public void setAttitude(int nilai){
    attitude = nilai;
    }
    
    public String getNama(){
      return nama;
    }
    
    public String getTeam(){
    return team;
    }
    
    public int getUmur(){
    return umur;
    }
    
    public int getSuara(){
    return suara;
    }
    
    public int getPenampilan(){
    return penampilan;
    }
    
    public int getAttitude(){
    return attitude;
    }
    
    public int getRata(){
    return rata= (suara + penampilan + attitude)/3;
    }
    
    public void tampil(){
        System.out.println("===================");
        System.out.println("nama    : "+getNama());
        System.out.println("Team    : "+getTeam());
        System.out.println("Umur    : "+getUmur());
        System.out.println("Nilai   : "+getRata());
    
    }
}
