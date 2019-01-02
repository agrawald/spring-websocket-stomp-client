package au.poc.dj.model;

import lombok.*;

import java.util.Date;

public class ServerMessage {
    private String from;
    private String message;
    private String topic;
    private final Date time = new Date();

    public ServerMessage() {
    }

    public ServerMessage(String from, String message, String topic) {
        this.from = from;
        this.message = message;
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "ServerMessage{" +
                "from='" + from + '\'' +
                ", message='" + message + '\'' +
                ", topic='" + topic + '\'' +
                ", time=" + time +
                '}';
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
