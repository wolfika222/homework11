package classes;

/**
 * Created by Hp_Workplace on 2017. 05. 27..
 */
public class AccessControl {

    private String commentVote;
    private String syndicate;
    private String rate;
    private String list;
    private String comment;
    private String embed;
    private String videoRespond;

    public String getCommentVote() {
        return commentVote;
    }

    public void setCommentVote(String commentVote) {
        this.commentVote = commentVote;
    }

    public String getSyndicate() {
        return syndicate;
    }

    public void setSyndicate(String syndicate) {
        this.syndicate = syndicate;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getEmbed() {
        return embed;
    }

    public void setEmbed(String embed) {
        this.embed = embed;
    }

    public String getVideoRespond() {
        return videoRespond;
    }

    public void setVideoRespond(String videoRespond) {
        this.videoRespond = videoRespond;
    }

    @Override
    public String toString() {
        return "AccessControl{" +
                "commentVote='" + commentVote + '\'' +
                ", syndicate='" + syndicate + '\'' +
                ", rate='" + rate + '\'' +
                ", list='" + list + '\'' +
                ", comment='" + comment + '\'' +
                ", embed='" + embed + '\'' +
                ", videoRespond='" + videoRespond + '\'' +
                '}';
    }
}
