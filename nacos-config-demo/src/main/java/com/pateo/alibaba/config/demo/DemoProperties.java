package com.pateo.alibaba.config.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "pateo.qingai.demo")
@Data
@EqualsAndHashCode(of = {})
@AllArgsConstructor
@NoArgsConstructor
public class DemoProperties {

    /**
     * 重试次数
     */
    private int retryTimes = 3;

    /**
     * 重试间隔时间（毫秒）
     */
    private long retryDelayMilli = 500;

}
