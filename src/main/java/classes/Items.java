package classes;

import java.util.List;

/**
 * Created by Hp_Workplace on 2017. 05. 27..
 */
public class Items {

    private List<String> tags;
    private Player player;
    private Status status;
    private String ratingCount;
    private String uploader;
    private AccessControl accessControl;
    private String aspectRatio;
    private String uploaded;
    private String commentCount;
    private String id;
    private Content content;
    private String category;
    private String title;
    private String duration;
    private Thumbnail thumbnail;
    private String favoriteCount;
    private String updated;
    private String description;
    private String rating;
    private String viewCount;

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
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

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
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
                ", thumbnail=" + thumbnail +
                ", favoriteCount='" + favoriteCount + '\'' +
                ", updated='" + updated + '\'' +
                ", description='" + description + '\'' +
                ", rating='" + rating + '\'' +
                ", viewCount='" + viewCount + '\'' +
                '}';
    }
}
