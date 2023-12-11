package com.hello.core.discount;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.hello.core.member.Member;
import com.hello.core.member.grade;

class RateDiscountPolicyTest {

	RateDiscountPolicy discountPolicy = new RateDiscountPolicy();
	
	@Test
	@DisplayName("VIP는 10% 할인이 적용되어야 함")
	void vip_o() {

		Member member = new Member(1L, "memberA", grade.VIP);
		
		int discount = discountPolicy.discount(member, 10000);
		
		assertThat(discount).isEqualTo(1000);
	}

	@Test
	@DisplayName("VIP가 아니면 할인이 적용되지 않아야 한다")
	void vip_x() {

		Member member = new Member(2L, "memberBASIC", grade.BASIC);
		
		int discount = discountPolicy.discount(member, 10000);
		
		assertThat(discount).isEqualTo(0);
	}
}
