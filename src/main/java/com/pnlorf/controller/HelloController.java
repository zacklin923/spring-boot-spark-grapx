package com.pnlorf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 * author: liping@mininglamp.com
 * date: ${DATE}
 * package: ${PACKAGE_NAME}
 * 测试用controller
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello, World";
    }
}
