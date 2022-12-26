package SpringBasicInf.core.scan;

import SpringBasicInf.core.AutoAppConfig;
import SpringBasicInf.core.member.Member;
import SpringBasicInf.core.member.MemberRepository;
import SpringBasicInf.core.member.MemberService;
import SpringBasicInf.core.member.MemberServiceImpl;
import SpringBasicInf.core.order.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoAppConfigTest {

    @Test
    void basicScan() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);

        MemberService memberService = ac.getBean(MemberService.class);
        Assertions.assertThat(memberService).isInstanceOf(MemberServiceImpl.class);

        OrderServiceImpl bean = ac.getBean(OrderServiceImpl.class);
        MemberRepository memberRepository = bean.getMemberRepository();
        System.out.println("memberRepository = " + memberRepository);
    }
}
