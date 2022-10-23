package com.ppoox.pattern.structural.proxy;

public class RealThumbnail implements Thumbnail {
    private final String title;
    private final String previewUrl;

    public RealThumbnail(String title, String previewUrl) {
        this.title = title;
        this.previewUrl = previewUrl;
        System.out.println("Thumbnail download");
    }

    @Override
    public void showTitle() {
        System.out.println("Title(RealThumbnail) is " + title);
    }

    @Override
    public void showPreview() {
        System.out.println("Preview(RealThumbnail) showing, URL is " + previewUrl);
    }
}
