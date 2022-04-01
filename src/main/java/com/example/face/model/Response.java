package com.example.face.model;

import java.io.Serializable;

public class Response implements Serializable {
    private int error_code;
    private String error_msg;
    private long log_id;
    private long timestamp;
    private int cached;
    private com.example.face.model.Result result;

    @Override
    public String toString() {
        return "Response{" +
                "error_code=" + error_code +
                ", error_msg='" + error_msg + '\'' +
                ", log_id=" + log_id +
                ", timestamp=" + timestamp +
                ", cached=" + cached +
                ", result=" + result +
                '}';
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getError_msg() {
        return error_msg;
    }

    public void setError_msg(String error_msg) {
        this.error_msg = error_msg;
    }

    public long getLog_id() {
        return log_id;
    }

    public void setLog_id(long log_id) {
        this.log_id = log_id;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getCached() {
        return cached;
    }

    public void setCached(int cached) {
        this.cached = cached;
    }

    public com.example.face.model.Result getResult() {
        return result;
    }

    public void setResult(com.example.face.model.Result result) {
        this.result = result;
    }
}
