package com.example.mohamed_ahmed.guide.Fragment;

public class ListItem {
    private String Name;
    private String Location;
    private String contact;
    private int image;

    public ListItem(String name, String location, String contact) {
        Location = location;
        Name = name;
        this.contact = contact;
        image = 0;
    }

    public ListItem(String name, String location, String contact, int image) {
        Location = location;
        Name = name;
        this.contact = contact;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
