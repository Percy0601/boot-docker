package io.training.boot.docker;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/training")
public class TrainingController {

    @GetMapping("/hello")
    public String hello(String name) {
        if(ObjectUtils.isEmpty(name)) {
            name = "Percy";
        }
        return "Hello " + name + "!" + " Now:" + new SimpleDateFormat(" [yyyy-MM-dd  HH:mm:ss]").format(new Date());
    }


}
