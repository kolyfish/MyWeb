package com.tibame.domain;
//功能規範method
public interface ITibameHello {
	//打招呼功能規範  抽象方法
	public String helloWorld(String who);
		//強迫注入實現property 規範(setter 建構子多載 this.companyName=companyName )
	public void setCompanyName(String companyName);
}
