package com.example.demo;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
public class Demo2AppControler {
    private Object Integer;

    @RequestMapping(value="/", method= RequestMethod.GET)

    public String helloWorld(@CookieValue(value="counter", defaultValue="-1") Integer counter, HttpServletResponse res) {
        counter++;
        Cookie cookie = new Cookie("counter", counter.toString());
        res.addCookie(cookie);
        String mv= "hello-world";
        return mv+"-"+counter.toString();
    }
}
