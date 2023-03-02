package com.acai.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * DESC
 *
 * @author YangMingCai
 * @date 2023年03月02日 11:05
 */
@Configuration
@ComponentScan(value = "com.acai", excludeFilters = @ComponentScan.Filter(
        type = FilterType.ANNOTATION,
        classes = Controller.class
))
public class SpringConfig {
}
