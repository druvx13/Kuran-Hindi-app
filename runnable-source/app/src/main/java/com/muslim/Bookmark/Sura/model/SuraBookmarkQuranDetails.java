package com.muslim.Bookmark.Sura.model;

public class SuraBookmarkQuranDetails {
    public String content;
    public String id;
    public String modified_content;
    public String sura_id;
    public String trans;

    public String getTrans() {
        return this.trans;
    }

    public void setTrans(String str) {
        this.trans = str;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        this.id = str;
    }

    public String getSura_id() {
        return this.sura_id;
    }

    public void setSura_id(String str) {
        this.sura_id = str;
    }

    public String getModified_content() {
        return this.modified_content;
    }

    public void setModified_content(String str) {
        this.modified_content = str;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }
}
