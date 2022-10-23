package com.ppoox.pattern.structural.proxy;

public class ProxyThumbnail implements Thumbnail {
    private final String title;
    private final String previewUrl;

    private RealThumbnail realThumbnail;

    public ProxyThumbnail(String title, String previewUrl) {
        this.title = title;
        this.previewUrl = previewUrl;
    }

    @Override
    public void showTitle() {
        System.out.println("Title(ProxyThumbnail) is " + title);
    }

    @Override
    public void showPreview() {
        if (realThumbnail == null) {
            realThumbnail = new RealThumbnail(title, previewUrl);
        }
        realThumbnail.showPreview();
    }
}
