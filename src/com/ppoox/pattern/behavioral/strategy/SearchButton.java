package com.ppoox.pattern.behavioral.strategy;

public class SearchButton {

    private SearchStrategy searchStrategy;

    public SearchButton() {
        this.searchStrategy = new SearchAll();
    }

    public SearchButton(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    public void onClick() {
        searchStrategy.search();
    }
}
