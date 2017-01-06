package com.hand.bean;

import java.util.List;

public class LongAndList {

	private Long sum;
	private List list;
	
	public LongAndList() {}

	public LongAndList(Long sum, List list) {
		this.sum = sum;
		this.list = list;
	}
	public Long getSum() {
		return sum;
	}
	public void setSum(Long sum) {
		this.sum = sum;
	}
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	
}
