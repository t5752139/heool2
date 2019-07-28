package it.cast.aop;

import org.springframework.stereotype.Component;

@Component("target")
public class Target implements TaegetInterfacs {
    public void save() {
        System.out.println("ssss");
    }
}
