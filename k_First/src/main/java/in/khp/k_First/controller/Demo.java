package in.khp.k_First.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
@RestController
public class Demo {

    public class KFirstApplication {
        @GetMapping("/")

        public String welcomemessage() {
            return "hi welcome";
        }

        @GetMapping("/Date")
        public Date getDate() {
            return new Date();
        }
    }
}
