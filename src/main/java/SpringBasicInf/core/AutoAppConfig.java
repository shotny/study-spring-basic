package SpringBasicInf.core;

// section6.component scan

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
) //Component 붙은 클래스 스캔해서 스프링빈으로 자동 등록, (뺄거 지정)
public class AutoAppConfig {
}
