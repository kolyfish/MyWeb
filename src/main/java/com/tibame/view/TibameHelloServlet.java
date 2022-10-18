package com.tibame.view;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.domain.Company;
import com.tibame.domain.ITibameHello;
//VIEW層級假裝這是網頁 視覺呈現
@WebServlet("/TibameHelloServlet")
public class TibameHelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       //Attribute new一個工廠出來
	private ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
	
    public TibameHelloServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("big5");
		//執行階段建構物件假設這是a版的類別 最原始的new物件的方式
		//ITibameHello hello = new TibameHello();//A 版到B版開刀式 (改源碼)修改作業
		//BEAN 元件 工廠生產 可以透過工廠抽換版本
		//介面多型化
		ITibameHello hello = factory.getBean("tibamehello3",ITibameHello.class);
		//呼叫方法
		String msg = hello.helloWorld("eric");
		//response.getWriter().println(msg); //UI呈現
		Company com = factory.getBean("com",Company.class);
		String name  = com.getBoss().getName();
		response.getWriter().println(name);
	}

	

}
