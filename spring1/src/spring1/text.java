package spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text {
	public static void main(String[] args) {
        ApplicationContext cn =new ClassPathXmlApplicationContext("applicationContext.xml");
         Student student=(Student)cn.getBean("student");
		student.string();
		student.toString();
		
	}
}
