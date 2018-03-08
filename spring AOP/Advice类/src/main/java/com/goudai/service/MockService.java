package com.goudai.service;

public class MockService {

    public void doService(){
        System.out.println("doing Service ...");
    }

    public void throwException() throws Exception{
        System.out.println("throwing Exception");
        throw new Exception("service Exception");
    }
}
