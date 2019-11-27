package com.jon.recyclerview;

public class Contacts {
    private String name;
    private String address;
    private String phoneNo;
    private String gender;
    private int imageId;
    private int imgdelete;

    public Contacts(String name, String phoneNo,String address, String gender , int imageId, int imgdelete) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
        this.gender=gender;
        this.imageId = imageId;
        this.imgdelete= imgdelete;
    }

    public String getName() {
        return name;
    }



    public String getAddress() {

        return address;
    }
    public String getGender() {

        return gender;
    }
    public String getPhoneNo() {

        return phoneNo;
    }
    public int getImageId() {
        return imageId;
    }


    public int getImgdelete() {
        return imgdelete;
    }

}

