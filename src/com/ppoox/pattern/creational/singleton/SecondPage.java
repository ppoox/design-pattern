package com.ppoox.pattern.creational.singleton;

public class SecondPage {

    //    private Setting setting = new Setting();
    private Setting setting = Setting.getInstance();

    public void printSetting() {
        System.out.println(setting.toString());
    }
}
