package com.didispace.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author $Hongdong.Fu
 * @date 2019/8/14
 */
@RestController
public class HelloController {
    @RequestMapping("/bye")
    public String index(){
        return "Bye World!";
    }
}
