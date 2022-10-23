package com.ppoox.pattern.behavioral.templatemethod;

public class Main {
    public static void main(String[] args) {
        /**
         * 어떤 작업을 처리하는 일부분을 서브 클래스로 캡슐화해 전체 일을 수행하는 구조는 바꾸지 않으면서 특정 단계에서 수행하는 내역을 바꾸는 패턴
         */
        new KakaoSnsLogin().login();
        System.out.println("============================");
        new NaverSnsLogin().login();
    }
}
