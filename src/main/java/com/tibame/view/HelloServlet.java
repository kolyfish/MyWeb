package com.tibame.view;

import java.io.IOException;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tibame.domain.Hello;
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public HelloServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 // 1.需要一個need bean 工廠  套用合約書
		response.setCharacterEncoding("UTF-8");
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.去要一個打招呼的物件來用(類別的多型化架構)
		 Hello hello= factory.getBean("hello",Hello.class);
		 String msg=hello.hellowWorld();
		 response.getWriter().println(msg);
		
	}

}
