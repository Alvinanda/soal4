/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.ArrayList;

/**
 *
 * @author guest-84Oxfe
 */
public class Main {
    public static void main(String[] args) {
        String a,b;
        int c, d , e,f;
        
      
        ArrayList <Member> listMember = new ArrayList<>();
        Member wong = new Member();
        Member wongLagi = new Member();
        Member LagiLagiWong = new Member();
        listMember.add(wong);
        listMember.add(wongLagi);
        listMember.add(LagiLagiWong);
        
        wong.setNama("febri");
        wong.setTeam("Telengus");
        wong.setUmur(20);
        wong.setPenampilan(70);
        wong.setSuara(80);
        wong.setAttitude(50);
        
        wongLagi.setNama("affan");
        wongLagi.setTeam("gambli");
        wongLagi.setUmur(10);
        wongLagi.setSuara(50);
        wongLagi.setPenampilan(70);
        wongLagi.setAttitude(90);
        
        LagiLagiWong.setNama("Rijal");
        LagiLagiWong.setTeam("Gembel");
        LagiLagiWong.setUmur(20);
        LagiLagiWong.setSuara(90);
        LagiLagiWong.setPenampilan(80);
        LagiLagiWong.setAttitude(70);
        
        for(int i = 0; i < listMember.size(); i++){
            listMember.get(i).tampil();
        
        }
        
        
    }
}
