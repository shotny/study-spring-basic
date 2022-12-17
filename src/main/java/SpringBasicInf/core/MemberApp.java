package SpringBasicInf.core;

import SpringBasicInf.core.member.Grade;
import SpringBasicInf.core.member.Member;
import SpringBasicInf.core.member.MemberService;
import SpringBasicInf.core.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);// getBean(Bean 메서드명, 반환타입)
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member =  " + member.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}
