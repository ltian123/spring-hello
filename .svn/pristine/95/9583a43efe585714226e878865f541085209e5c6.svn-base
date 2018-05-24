package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import service.UserService;

public class Test {
	public static void main(String[] args) {
//		Resource resource=new ClassPathResource("applicationContext.xml");
//		BeanFactory bf=new XmlBeanFactory(resource);
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserService userService=(UserService) ac.getBean("userService");
		
		userService.regist();
	}
}
