package SpringBasicInf.core;

import SpringBasicInf.core.member.Grade;
import SpringBasicInf.core.member.Member;
import SpringBasicInf.core.member.MemberService;
import SpringBasicInf.core.member.MemberServiceImpl;
import SpringBasicInf.core.order.Order;
import SpringBasicInf.core.order.OrderService;
import SpringBasicInf.core.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order.toString());
        System.out.println("order.calculatePrice = " + order.calculatePrice());

    }
}
