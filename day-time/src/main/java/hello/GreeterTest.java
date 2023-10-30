package hello;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

public class GreeterTest {
    private Greeter greeter =  new Greeter();

    @Test
    public void greeterSaysHello(){
        assertThat(greeter.sayHello(), containsString("Hello"));
    }
}
