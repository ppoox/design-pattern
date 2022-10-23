package com.ppoox.pattern.behavioral.strategy;

public class SearchNews implements SearchStrategy {
    @Override
    public void search() {
        System.out.println("Search news!");
    }
}
