package com.hibernet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class run {
    public static void main(String args[]){
        ApplicationContext context=new ClassPathXmlApplicationContext("hibernet.xml");
        HibernateTemplate hibernateTemplate=context.getBean("template",HibernateTemplate.class);
        System.out.println(hibernateTemplate);
    }
}
