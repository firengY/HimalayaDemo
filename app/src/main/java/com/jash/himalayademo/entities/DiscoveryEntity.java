package com.jash.himalayademo.entities;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "DISCOVERY_ENTITY".
 */
public class DiscoveryEntity {

    private Long id;
    private Integer orderNum;
    private String title;
    private String subtitle;
    private String coverPath;
    private String contentType;
    private String url;
    private String sharePic;
    private Boolean enableShare;
    private Boolean isHot;
    private Boolean isExternalUrl;
    private Integer contentUpdatedAt;

    public DiscoveryEntity() {
    }

    public DiscoveryEntity(Long id) {
        this.id = id;
    }

    public DiscoveryEntity(Long id, Integer orderNum, String title, String subtitle, String coverPath, String contentType, String url, String sharePic, Boolean enableShare, Boolean isHot, Boolean isExternalUrl, Integer contentUpdatedAt) {
        this.id = id;
        this.orderNum = orderNum;
        this.title = title;
        this.subtitle = subtitle;
        this.coverPath = coverPath;
        this.contentType = contentType;
        this.url = url;
        this.sharePic = sharePic;
        this.enableShare = enableShare;
        this.isHot = isHot;
        this.isExternalUrl = isExternalUrl;
        this.contentUpdatedAt = contentUpdatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getCoverPath() {
        return coverPath;
    }

    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSharePic() {
        return sharePic;
    }

    public void setSharePic(String sharePic) {
        this.sharePic = sharePic;
    }

    public Boolean getEnableShare() {
        return enableShare;
    }

    public void setEnableShare(Boolean enableShare) {
        this.enableShare = enableShare;
    }

    public Boolean getIsHot() {
        return isHot;
    }

    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    public Boolean getIsExternalUrl() {
        return isExternalUrl;
    }

    public void setIsExternalUrl(Boolean isExternalUrl) {
        this.isExternalUrl = isExternalUrl;
    }

    public Integer getContentUpdatedAt() {
        return contentUpdatedAt;
    }

    public void setContentUpdatedAt(Integer contentUpdatedAt) {
        this.contentUpdatedAt = contentUpdatedAt;
    }

}
