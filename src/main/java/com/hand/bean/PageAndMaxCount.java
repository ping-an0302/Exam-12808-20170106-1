package com.hand.bean;

public class PageAndMaxCount {

	private int page;
	private int maxcount;
	
	public PageAndMaxCount() {}

	public PageAndMaxCount(int page, int maxcount) {
		this.page = page;
		this.maxcount = maxcount;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getMaxcount() {
		return maxcount;
	}
	public void setMaxcount(int maxcount) {
		this.maxcount = maxcount;
	}
}
