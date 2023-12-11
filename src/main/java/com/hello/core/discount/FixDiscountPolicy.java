package com.hello.core.discount;

import com.hello.core.member.Member;
import com.hello.core.member.grade;

public class FixDiscountPolicy implements DiscountPolicy {

	private int discountFixAmount = 1000;
	
	@Override
	public int discount(Member member, int price) {
		
		if(member.getGrade() == grade.VIP)
			return discountFixAmount;
		
		return 0;
	}
}
