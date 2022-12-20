package SpringBasicInf.core;

import SpringBasicInf.core.discount.DiscountPolicy;
import SpringBasicInf.core.discount.FixDiscountPolicy;
import SpringBasicInf.core.discount.RateDiscountPolicy;
import SpringBasicInf.core.member.*;
import SpringBasicInf.core.order.OrderService;
import SpringBasicInf.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
