package com.ppoox.pattern.behavioral.strategy;

import com.ppoox.pattern.structural.adapter.FindMovieAlgorithm;
import com.ppoox.pattern.structural.adapter.SearchFindAdapter;

public class Main {
    public static void main(String[] args) {
        /**
         * 행위를 클래스로 캡슐화해 동적으로 행위를 자유롭게 바꿀 수 있게 해주는 패턴
         */
        SearchButton searchAllButton = new SearchButton();
        searchAllButton.onClick();

        SearchButton searchImageButton = new SearchButton(new SearchImage());
        searchImageButton.onClick();

        SearchButton searchNewsButton = new SearchButton(new SearchNews());
        searchNewsButton.onClick();

        SearchButton searchMapButton = new SearchButton(new SearchMap());
        searchMapButton.onClick();

        // Adapter pattern에서 추가
        SearchButton searchMovieButton = new SearchButton(new SearchFindAdapter(new FindMovieAlgorithm()));
        searchMovieButton.onClick();
    }
}
