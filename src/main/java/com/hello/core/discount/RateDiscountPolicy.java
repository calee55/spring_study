package com.hello.core.discount;

import com.hello.core.member.Member;
import com.hello.core.member.Grade;

public class RateDiscountPolicy implements DiscountPolicy {
	
	private int discountPercent = 10;
	
	@Override
	public int discount(Member member, int price) {
		if (member.getGrade() == Grade.VIP)
			return price * discountPercent / 100;
		return 0;
	}
}
