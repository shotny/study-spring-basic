package SpringBasicInf.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE)  // TYPE->클래스레벨에 붙음
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {
}
