package com.yangli.design_pattern.config;

import com.yangli.design_pattern.singleton.LazySingleton;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@ComponentScan(basePackages = {"com.yangli.design_pattern"})
@Import(value = {LazySingleton.class})
@Configuration
public class MainConfig {

}
