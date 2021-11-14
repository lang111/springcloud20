package com.atguigu.springcloud.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

/**
 * @auther lang
 * @create 2019-11-15 15:00
 */
@RestController
@RefreshScope
public class ConfigClientController
{
    @Value("${config.version}")
    private String version;

    @GetMapping("/getVersion")
    public String getversion()
    {
        return version;
    }
}





