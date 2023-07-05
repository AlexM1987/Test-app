package com.test.oop.inh.task;

public class Client {
    private int id;
    private String name;
    private String eMail;
    private String pwd1;
    private String pwd2;
    private String role;

    public Client(){
        role = "General User";
    }
    public Client(int id, String name, String eMail, String pwd1, String pwd2, String role){
       this.id = id;
       this.name = name;
       this.eMail = eMail;
       this.pwd1 = pwd1;
       this.pwd2 = pwd2;
       this.role = role;
    }

    public Client(int id, String name, String eMail) {
        this(id, name, eMail, null, null, null);
    }



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPwd1() {
        return pwd1;
    }
    public void setPwd1(String pwd1) {
        this.pwd1 = pwd1;
    }

    public String getPwd2() {
        return pwd2;
    }
    public void setPwd2(String pwd2) {
        this.pwd2 = pwd2;
    }

    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", eMail='" + eMail + '\'' +
                ", pwd1= *****'" +
                ", role='" + role + '\'' +
                '}';
    }
}
