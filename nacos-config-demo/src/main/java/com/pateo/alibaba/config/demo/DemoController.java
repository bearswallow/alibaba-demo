package com.pateo.alibaba.config.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/demo")
@RequiredArgsConstructor
public class DemoController {

    private final DemoProperties demoProperties;

    @GetMapping(path = "/get/properties")
    public DemoProperties getProperties() {
        return demoProperties;
    }

}
