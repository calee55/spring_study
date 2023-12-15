package com.hello.core.singleton;

import com.hello.core.AppConfig;
import com.hello.core.member.MemberRepository;
import com.hello.core.member.MemberServiceImpl;
import com.hello.core.order.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class ConfigurationSingletonTest {

    @Test
    void configurationTest() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberServiceImpl m = ac.getBean("memberService", MemberServiceImpl.class);
        OrderServiceImpl o = ac.getBean("orderService", OrderServiceImpl.class);
        MemberRepository realM = ac.getBean("memberRepository", MemberRepository.class);

        MemberRepository m1 = m.getMemberRepository();
        MemberRepository m2 = o.getMemberRepository();

        assertThat(m1).isSameAs(m2);
        assertThat(m1).isSameAs(realM);
    }

    @Test
    void configurationDeep() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        AppConfig bean = ac.getBean(AppConfig.class);

        System.out.println("bean" + bean.getClass());
    }
}
