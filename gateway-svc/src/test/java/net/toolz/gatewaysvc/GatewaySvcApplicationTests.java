package net.toolz.gatewaysvc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@SpringBootTest
class GatewaySvcApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    Environment env;

}
