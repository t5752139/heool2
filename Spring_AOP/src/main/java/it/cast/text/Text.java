package it.cast.text;

import it.cast.aop.TaegetInterfacs;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-anno.xml")
public class Text {

    @Autowired
    private TaegetInterfacs target;
    @Test
    public void save(){
        target.save();

    }

}
