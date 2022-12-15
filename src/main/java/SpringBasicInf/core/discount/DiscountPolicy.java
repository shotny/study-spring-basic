package SpringBasicInf.core.discount;

import SpringBasicInf.core.member.Member;

public interface DiscountPolicy {
    // 할인 대상 금액 return
    int discount(Member member, int price);
}
