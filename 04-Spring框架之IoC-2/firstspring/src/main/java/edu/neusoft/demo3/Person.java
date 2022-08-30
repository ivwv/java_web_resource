package edu.neusoft.demo3;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
    private Integer pid;
    private String pname;
    private Dog dog;
    private List list;
    private Set set;
    private Map map;

    public Person() {
    }

    public Person(Integer pid, String pname, Dog dog, List list, Set set, Map map) {
        this.pid = pid;
        this.pname = pname;
        this.dog = dog;
        this.list = list;
        this.set = set;
        this.map = map;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pname=" + pname +
                ", dog=" + dog +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                '}';
    }
}
