package edu.neusoft.loginSpringMVC.model.vo;

public class Person {
    private Integer pid;
    private String username;
    private String password;

    public Person() {
    }

    public Person(Integer pid, String username, String password) {
        this.pid = pid;
        this.username = username;
        this.password = password;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
