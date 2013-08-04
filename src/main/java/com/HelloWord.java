package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.bean.AppConfig;
import com.bean.HelloBean;

public class HelloWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// xml example
		ApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"services.xml"});
			HelloBean xmlBean = (HelloBean)context.getBean("xmlHelloID");
			System.out.println(xmlBean.getMsg() + " called " + xmlBean.getCount() + " times.");
			
		//	Annotation example
			ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
			  HelloBean annotationBean = ctx.getBean(HelloBean.class);
			  System.out.println(annotationBean.getMsg() + " called " + annotationBean.getCount() + " times.");
	}

}
