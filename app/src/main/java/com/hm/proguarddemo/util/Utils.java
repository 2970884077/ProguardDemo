package com.hm.proguarddemo.util;

public class Utils {

    public void methodNormal() {
        String logMessage = "this is normal method";
        logMessage = logMessage.toLowerCase();
        System.out.println(logMessage);
    }

    public void methodUnused() {
        String logMessage = "this is unused method";
        logMessage = logMessage.toLowerCase();
        System.out.println(logMessage);
    }

}