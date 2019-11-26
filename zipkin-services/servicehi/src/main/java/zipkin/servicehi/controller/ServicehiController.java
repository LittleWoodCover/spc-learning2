package zipkin.servicehi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class ServicehiController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hi")
    public String callHome(){
        log.info("service hi called.method hi()");
        return restTemplate.getForObject("http://localhost:8002/mi", String.class);
    }
    @RequestMapping("/info")
    public String info(){
        log.info("service hi called.method info()");
        return "i'm servicehi";
    }

}
