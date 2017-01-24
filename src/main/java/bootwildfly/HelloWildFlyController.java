package bootwildfly;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.common.GreetingsResponse;

@RestController
@RequestMapping("/benTest")
public class HelloWildFlyController {


    @CrossOrigin(origins = "*")
    @RequestMapping(value="/greetings", method= RequestMethod.GET)	    
    @ResponseBody
    public  GreetingsResponse greetings() {
    	GreetingsResponse greetingsResponse=new GreetingsResponse();
    	greetingsResponse.setGreetings("Hello, ben!");
        return greetingsResponse;
    }
}
