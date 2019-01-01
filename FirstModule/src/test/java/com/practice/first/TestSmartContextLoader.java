package com.practice.first;

import com.practice.first.loaders.LazyApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextLoader;

/**
 * Created by new on 01-01-2019.
 */
public class TestSmartContextLoader implements ContextLoader {

    public String[] processLocations(Class<?> aClass, String... strings) {
        System.out.println(" processLocations called "+aClass+"  "+strings.length);
        return new String[0];
    }

    public ApplicationContext loadContext(String... strings) throws Exception {
        System.out.println(" Location is "+strings.length);
         return new LazyApplicationContext("spring-test.xml");
    }
}
