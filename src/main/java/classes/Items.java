package classes;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Hp_Workplace on 2017. 05. 27..
 */
public class Items {

    private List<String> tags;
    private HashMap<String, String> player;
    private HashMap<String, String> status;
    private String ratingCount;
    private String uploader;
    private AccessControl accessControl;
    private String aspectRatio;
    private String uploaded;
    private String commentCount;
    private String id;
    private HashMap<String, String> content;
    private String category;
    private String title;
    private String duration;
    private String favoriteCount;
    private String updated;
    private String description;
    private String rating;
    private String viewCount;
    private HashMap<String, String> thumbnail;


    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(String ratingCount) {
        this.ratingCount = ratingCount;
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    public AccessControl getAccessControl() {
        return accessControl;
    }

    public void setAccessControl(AccessControl accessControl) {
        this.accessControl = accessControl;
    }

    public String getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public String getUploaded() {
        return uploaded;
    }

    public void setUploaded(String uploaded) {
        this.uploaded = uploaded;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(String favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getViewCount() {
        return viewCount;
    }

    public void setViewCount(String viewCount) {
        this.viewCount = viewCount;
    }

    public HashMap<String, String> getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(HashMap<String, String> thumbnail) {
        this.thumbnail = thumbnail;
    }

    public HashMap<String, String> getPlayer() {
        return player;
    }

    public void setPlayer(HashMap<String, String> player) {
        this.player = player;
    }

    public HashMap<String, String> getContent() {
        return content;
    }

    public void setContent(HashMap<String, String> content) {
        this.content = content;
    }

    public HashMap<String, String> getStatus() {
        return status;
    }

    public void setStatus(HashMap<String, String> status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Items{" +
                "tags=" + tags +
                ", player=" + player +
                ", status=" + status +
                ", ratingCount='" + ratingCount + '\'' +
                ", uploader='" + uploader + '\'' +
                ", accessControl=" + accessControl +
                ", aspectRatio='" + aspectRatio + '\'' +
                ", uploaded='" + uploaded + '\'' +
                ", commentCount='" + commentCount + '\'' +
                ", id='" + id + '\'' +
                ", content=" + content +
                ", category='" + category + '\'' +
                ", title='" + title + '\'' +
                ", duration='" + duration + '\'' +
                ", favoriteCount='" + favoriteCount + '\'' +
                ", updated='" + updated + '\'' +
                ", description='" + description + '\'' +
                ", rating='" + rating + '\'' +
                ", viewCount='" + viewCount + '\'' +
                ", thumbnail=" + thumbnail +
                '}';
    }
}
