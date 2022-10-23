package com.ppoox.pattern.creational.singleton;

public class FirstPage {

    //    private Setting setting = new Setting();
    private Setting setting = Setting.getInstance();

    public void setAndPrintSetting() {
        System.out.println(setting.toString());

        setting.setDarkMode(true);
        setting.setFontSize(15);
    }
}
