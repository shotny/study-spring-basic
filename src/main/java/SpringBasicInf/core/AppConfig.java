package SpringBasicInf.core;

import SpringBasicInf.core.discount.DiscountPolicy;
import SpringBasicInf.core.discount.FixDiscountPolicy;
import SpringBasicInf.core.discount.RateDiscountPolicy;
import SpringBasicInf.core.member.*;
import SpringBasicInf.core.order.OrderService;
import SpringBasicInf.core.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private static MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public static DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}
