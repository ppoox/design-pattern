package com.ppoox.pattern.behavioral.templatemethod;

public abstract class SnsLogin {

    protected abstract void createAuthUrl();
    protected abstract void getAccessToken();
    protected abstract void decodeAccessToken();
    protected abstract void getUserInfo();

    public void login() {
        createAuthUrl();
        getAccessToken();
        decodeAccessToken();
        getUserInfo();
    }

}
