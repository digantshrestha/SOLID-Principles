package com.pro.file;

import com.pro.file.entity.Battry;
import com.pro.file.entity.RemoteController;

public class Program{
    public static void main(String[] args){
        RemoteController rc=new RemoteController(new Battry("sony"));
        rc.on();
        rc.off();
        System.out.println(rc.battry.getBattry());
    }
}