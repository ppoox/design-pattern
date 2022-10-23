package com.ppoox.pattern.behavioral.templatemethod;

public class NaverSnsLogin extends SnsLogin {
    @Override
    protected void createAuthUrl() {
        System.out.println("Create Naver auth url");
    }

    @Override
    protected void getAccessToken() {
        System.out.println("Get Naver access token");
    }

    @Override
    protected void decodeAccessToken() {
        System.out.println("Decode Naver token");
    }

    @Override
    protected void getUserInfo() {
        System.out.println("Get user info");
    }
}
