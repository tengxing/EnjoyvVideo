package com.domain;

import java.util.List;

public class t_org {
    private List<t_url> t_url;


    private String id;
    private String content;
    private String title;
    private String imageUrl ;
    private String publishTime ;
    private String videoType ;
    private String updateTime;
    private String majorActor ;
    private String  status    ;

    public List<com.domain.t_url> getT_url() {
        return t_url;
    }

    public void setT_url(List<com.domain.t_url> t_url) {
        this.t_url = t_url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getMajorActor() {
        return majorActor;
    }

    public void setMajorActor(String majorActor) {
        this.majorActor = majorActor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
