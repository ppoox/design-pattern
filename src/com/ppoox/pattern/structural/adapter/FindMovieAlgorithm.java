package com.ppoox.pattern.structural.adapter;

public class FindMovieAlgorithm implements FindAlgorithm {
    @Override
    public void find(boolean global) {
        System.out.println("Find movie, global is " + global);
    }
}
