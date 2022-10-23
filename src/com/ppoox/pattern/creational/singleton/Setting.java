package com.ppoox.pattern.creational.singleton;

public class Setting {

    private static volatile Setting instance;
    private int fontSize = 13;
    private boolean darkMode = false;

    private Setting() {

    }

    public static Setting getInstance() {

        if (instance == null) {
            synchronized (Setting.class) {
                if (instance == null) {
                    instance = new Setting();
                }
            }
        }
        return instance;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public boolean isDarkMode() {
        return darkMode;
    }

    public void setDarkMode(boolean darkMode) {
        this.darkMode = darkMode;
    }

    @Override
    public String toString() {
        return "Setting{" +
                "fontSize=" + fontSize +
                ", darkMode=" + darkMode +
                '}';
    }
}
