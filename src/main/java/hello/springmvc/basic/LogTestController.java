package hello.springmvc.basic;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

    //@Slf4j 어노테이션을 이용해서 이걸 생략 가능
    //private final Logger log = LoggerFactory.getLogger(getClass());
    //로그확인 가능


    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info("info log= {}", name);
        log.warn("warn log= {}", name);
        log.error("error log= {}", name);

        return "ok";
    }
}
