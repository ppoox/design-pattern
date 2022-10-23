package com.ppoox.pattern.behavioral.templatemethod;

public class KakaoSnsLogin extends SnsLogin {

    @Override
    protected void createAuthUrl() {
        System.out.println("Create Kakao auth url");
    }

    @Override
    protected void getAccessToken() {
        System.out.println("Get Kakao access token");
    }

    @Override
    protected void decodeAccessToken() {
        System.out.println("Decode Kakao token");
    }

    @Override
    protected void getUserInfo() {
        System.out.println("Get user info");
    }
}
