package com.tibame.domain;
//A版
public class TibameHello implements ITibameHello {
	//attribute

	private String companyName;
//	private String companyName="defaulCompanyName:CMIT";
	//存取子用get set
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	//自訂建構子
	public TibameHello() {
	}
	
	//contructor overloading 建構子多載
	public TibameHello(String companyName) {
		this.companyName=companyName;
	}

	@Override
	public String helloWorld(String who) {
		return  String.format("com:%s say... %s Hello World!!", companyName,who);
	}
	
	//自訂初始化method
	public void init() {
		//初始化公司行號
		this.companyName="Tibame 教育平台";
	}
	
}
