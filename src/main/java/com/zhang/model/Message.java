package com.zhang.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Message {

    private String uid;
    private long timestamp;
    private String content;

    public String getUid() {
        return uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }
    public long getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    @Override
    public String toString() {
        Date date = new Date(timestamp);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "Message [用户ID：" + uid + "\n, 发布时间：" + sdf.format(date) + "\n, 微博内容：" + content + "]";
    }
}
