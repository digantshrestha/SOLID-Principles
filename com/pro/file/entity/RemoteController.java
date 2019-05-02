package com.pro.file.entity;

import com.pro.file.entity.Battry;

public class RemoteController{
    private String battryName;
    private boolean hasBattry=false;
    public Battry battry;

    public RemoteController(){}

    public RemoteController(Battry battry){
        this.battry=battry;
        hasBattry=true;
    }

    public void on(){
        if(hasBattry==true){
            System.out.println("turn on");
        }else{
            System.out.println("please insert battry");
        }
    }

    public void off(){
        if(hasBattry==true){
            System.out.println("turn off");
        }else{
            System.out.println("please insert battry");
        }
    }
}