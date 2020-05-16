package spring.boot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"spring.boot.module"})
public class StarterServiceAutoConfiguration {
}
