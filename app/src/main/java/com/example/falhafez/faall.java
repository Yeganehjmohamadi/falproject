package com.example.falhafez;

public class faall {
    private String title;
    private String plainText;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public faall(String title, String plainText) {
        this.title = title;
        this.plainText = plainText;
    }
}
