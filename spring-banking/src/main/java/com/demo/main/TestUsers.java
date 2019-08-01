package com.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bean.UserBean;

public class TestUsers {
	
public static void main(String[] main)
{
ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
UserBean bean = (UserBean) context.getBean("userBean");
System.out.println(bean.getName() + ":" + bean.getBalance());
bean.deposit(2025);
System.out.println(bean.getName() + ":" + bean.getBalance());

UserBean bean2 = context.getBean("userBean2", UserBean.class);
System.out.println(bean2.getName() + ":" + bean2.getBalance());
bean2.deposit(2025);
System.out.println(bean2.getName() + ":" + bean2.getBalance());


}
}
