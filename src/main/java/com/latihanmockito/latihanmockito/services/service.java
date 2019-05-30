package com.latihanmockito.latihanmockito.services;

import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.ArrayList;

@Service
public class service {

    public String getMantan(){
        ArrayList list = new ArrayList<String>();
            list.add("Januari");
            list.add("Februari");
            list.add("Maret");
        return list.toString();
    }

}
