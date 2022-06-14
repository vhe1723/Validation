package hello;

import org.junit.jupiter.api.Test;

public class testClass {

    @Test
    public void test(){
        String[] strings = new String[]{"a","b","c"};
        for(int i=0; i<strings.length; i++){
            System.out.println(strings[i]);
        }
    }
}
