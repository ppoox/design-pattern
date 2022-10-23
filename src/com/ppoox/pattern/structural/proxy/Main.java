package com.ppoox.pattern.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Thumbnail> thumbnails = new ArrayList<>();
        thumbnails.add(new ProxyThumbnail("썸네일1", "localhost/1"));
        thumbnails.add(new ProxyThumbnail("썸네일2", "localhost/2"));
        thumbnails.add(new ProxyThumbnail("썸네일3", "localhost/3"));
        thumbnails.add(new ProxyThumbnail("썸네일4", "localhost/4"));
        thumbnails.add(new ProxyThumbnail("썸네일5", "localhost/5"));

        for (Thumbnail thumbnail : thumbnails) {
            thumbnail.showTitle();
        }

        thumbnails.get(2).showPreview();
        thumbnails.get(2).showPreview();
        thumbnails.get(4).showPreview();
        thumbnails.get(1).showPreview();

    }
}
