package demo;

import org.springframework.stereotype.Component;

@Component
public class Singer {
    public String song(String sname){
        System.out.println("小岳岳想给大家唱首歌："+sname);
        String splace="大连";
//        int a=3/0;
        return splace;
    }
}
