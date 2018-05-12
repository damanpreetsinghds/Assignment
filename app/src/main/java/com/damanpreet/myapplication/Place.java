
package com.damanpreet.myapplication;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Place {

    @SerializedName("address")
    private String address;
    @SerializedName("bid")
    private String bid;
    @SerializedName("fb_id")
    private Object fbId;
    @SerializedName("loc")
    private List<String> loc;
    @SerializedName("name")
    private String name;
    @SerializedName("room_id")
    private Object roomId;
    @SerializedName("room_name")
    private String roomName;
    @Expose
    private String _id;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public Object getFbId() {
        return fbId;
    }

    public void setFbId(Object fbId) {
        this.fbId = fbId;
    }

    public List<String> getLoc() {
        return loc;
    }

    public void setLoc(List<String> loc) {
        this.loc = loc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getRoomId() {
        return roomId;
    }

    public void setRoomId(Object roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    @Override
    public String toString() {
        return "Place{" +
                "address='" + address + '\'' +
                ", bid='" + bid + '\'' +
                ", fbId=" + fbId +
                ", loc=" + loc +
                ", name='" + name + '\'' +
                ", roomId=" + roomId +
                ", roomName='" + roomName + '\'' +
                ", _id='" + _id + '\'' +
                '}';
    }
}
