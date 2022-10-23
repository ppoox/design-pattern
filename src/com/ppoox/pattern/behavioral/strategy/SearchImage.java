package com.ppoox.pattern.behavioral.strategy;

public class SearchImage implements SearchStrategy {
    @Override
    public void search() {
        System.out.println("Search image!");
    }
}
