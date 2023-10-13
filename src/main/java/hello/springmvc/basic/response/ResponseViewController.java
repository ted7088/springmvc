package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {
    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1(){
        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data","hello!");

        return mav;
    }

    //모델로 넘기는 방법
    @RequestMapping("/response-view-v2")
    public String responseViewV2(Model model){
        model.addAttribute("data", "hello");

        return "response/hello";
    }

    //모델로 넘기는 방법 근데 jsp 즉 스트링을 넘기지 않아 불명확
    @RequestMapping("/response/hello")
    public void responseViewV3(Model model) {
        model.addAttribute("data", "hello!!");
    }

}
