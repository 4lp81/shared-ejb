package at.fhv.TeamE.shared.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

public class MessageDTO implements Serializable {
    private String topic;
    private String title;
    private String message;
    private Timestamp timestamp;
    private boolean isAcknowledged;
    private String userTag;

    public MessageDTO() {

    }

    //nix3


    public MessageDTO(String topic, String title, String message, Timestamp timestamp, boolean isAcknowledged, String userTag) {
        this.topic = topic;
        this.title = title;
        this.message = message;
        this.timestamp = timestamp;
        this.isAcknowledged = false;
        this.userTag = userTag;
    }

    public String getTopic() {
        return topic;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public boolean isAcknowledged() {
        return isAcknowledged;
    }

    public String getUserTag() {
        return userTag;
    }

    public void setAcknowledged(boolean acknowledged) {
        isAcknowledged = acknowledged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MessageDTO that = (MessageDTO) o;
        return isAcknowledged == that.isAcknowledged && Objects.equals(topic, that.topic) && Objects.equals(title, that.title) && Objects.equals(message, that.message) && Objects.equals(timestamp, that.timestamp) && Objects.equals(userTag, that.userTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, title, message, timestamp, isAcknowledged, userTag);
    }
}

//6
