package com.hello.core.order;

import com.hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.hello.core.member.Member;
import com.hello.core.member.MemberService;
import com.hello.core.member.Grade;

class OrderServiceTest {

	OrderService orderService;
	MemberService memberService;

	@BeforeEach
	public void beforeEach() {
		AppConfig appConfig = new AppConfig();
		memberService = appConfig.memberService();
		orderService = appConfig.orderService();
	}

	@Test
	void createOrder() {
		Long memberId = 1L;
		Member member = new Member(memberId, "memberA", Grade.VIP);
		memberService.join(member);
		
		Order order = orderService.createOrder(memberId, "itemA", 20000);
		Assertions.assertThat(order.getDiscountPrice()).isEqualTo(2000);

		System.out.println("order = " + order);
	}
}
