package com.muslim.Bookmark.Verses.model;

import java.util.List;
/* loaded from: classes.dex */
public class VersesBookmarkQuranSuras {
    private String audioLink;
    private List<VersesBookmarkQuranDetails> quranDetails;
    private String sura_id;
    private String sura_meaning;
    private String sura_name;
    private String sura_name_ar;

    public String getAudioLink() {
        return this.audioLink;
    }

    public void setAudioLink(String str) {
        this.audioLink = str;
    }

    public String getSura_id() {
        return this.sura_id;
    }

    public void setSura_id(String str) {
        this.sura_id = str;
    }

    public String getSura_name_ar() {
        return this.sura_name_ar;
    }

    public void setSura_name_ar(String str) {
        this.sura_name_ar = str;
    }

    public String getSuraName() {
        return this.sura_name;
    }

    public void setSuraName(String str) {
        this.sura_name = str;
    }

    public String getSuraMeaning() {
        return this.sura_meaning;
    }

    public void setSuraMeaning(String str) {
        this.sura_meaning = str;
    }

    public List<VersesBookmarkQuranDetails> getQuranDetails() {
        return this.quranDetails;
    }

    public void setQuranDetails(List<VersesBookmarkQuranDetails> list) {
        this.quranDetails = list;
    }
}
