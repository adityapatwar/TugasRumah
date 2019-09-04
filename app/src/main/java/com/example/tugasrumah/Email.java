package com.example.tugasrumah;

public class Email {
    private String title, subtitle,mail,time;
    private int pic;

    public Email(String title, String subtitle, String mail, String time, int pic) {
        this.title = title;
        this.subtitle = subtitle;
        this.mail = mail;
        this.time = time;
        this.pic = pic;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getMail() {
        return mail;
    }

    public String getTime() {
        return time;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
