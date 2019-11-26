package zipkin.servicemi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class ServicemiController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/mi")
    public String home(){
        log.info( "service mi called ,method mi()");
        return "hi i'm mi!";
    }


    @RequestMapping("/miya")
    public String info(){
        log.info( "service mi called ,method info()");
        return restTemplate.getForObject("http://localhost:8001/info",String.class);
    }


}
