package controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author deshan
 * @since 7 Jun 2020
 */
@RestController
public class WelcomeController {

    @RequestMapping(method = RequestMethod.GET, produces = {"application/json"})
    public @ResponseBody String helloWorld() {
        return "Hello World!!!";
    }
}