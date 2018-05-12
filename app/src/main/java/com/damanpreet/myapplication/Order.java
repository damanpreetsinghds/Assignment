
package com.damanpreet.myapplication;

import com.google.gson.annotations.SerializedName;


public class Order {

    @SerializedName("can_check_out")
    private Boolean canCheckOut;
    @SerializedName("checked_out_at")
    private String checkedOutAt;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("event")
    private Event event;
    @SerializedName("id")
    private String id;

    public Boolean getCanCheckOut() {
        return canCheckOut;
    }

    public void setCanCheckOut(Boolean canCheckOut) {
        this.canCheckOut = canCheckOut;
    }

    public String getCheckedOutAt() {
        return checkedOutAt;
    }

    public void setCheckedOutAt(String checkedOutAt) {
        this.checkedOutAt = checkedOutAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public com.damanpreet.myapplication.Event getEvent() {
        return event;
    }

    public void setEvent(com.damanpreet.myapplication.Event event) {
        this.event = event;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "canCheckOut=" + canCheckOut +
                ", checkedOutAt='" + checkedOutAt + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", event=" + event +
                ", id='" + id + '\'' +
                '}';
    }

}
