package SpringBasicInf.core.order;

import SpringBasicInf.core.discount.DiscountPolicy;
import SpringBasicInf.core.discount.FixDiscountPolicy;
import SpringBasicInf.core.discount.RateDiscountPolicy;
import SpringBasicInf.core.member.Member;
import SpringBasicInf.core.member.MemberRepository;
import SpringBasicInf.core.member.MemberService;
import SpringBasicInf.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return  new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
