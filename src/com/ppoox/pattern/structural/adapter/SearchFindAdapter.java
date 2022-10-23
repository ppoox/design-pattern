package com.ppoox.pattern.structural.adapter;

import com.ppoox.pattern.behavioral.strategy.SearchStrategy;

public class SearchFindAdapter implements SearchStrategy {

    private final FindAlgorithm findAlgorithm;

    public SearchFindAdapter(FindAlgorithm findAlgorithm) {
        this.findAlgorithm = findAlgorithm;
    }

    @Override
    public void search() {
        findAlgorithm.find(true);
    }
}
