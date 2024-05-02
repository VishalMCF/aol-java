package com.gatomalvado.service;


import com.gatomalvado.model.Log;

public class LogService {
    private static final LogService LOG_SERVICE = new LogService();

    private LogService(){

    }

    private LogService get(){
        return LOG_SERVICE;
    }

    private Log openLog(){

    }
}
