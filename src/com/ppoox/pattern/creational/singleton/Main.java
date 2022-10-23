package com.ppoox.pattern.creational.singleton;

public class Main {
    public static void main(String[] args) {
        /**
         * 전역 변수를 사용하지 않고 객체를 하나만 생성하도록 하며, 생성된 객체를 어디에서든지 참조할 수 있도록 하는 패턴
         * 멀티스레드 환경에서 동기화 유의
         */
        new FirstPage().setAndPrintSetting();
        new SecondPage().printSetting();
    }
}
