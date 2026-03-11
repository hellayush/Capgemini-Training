package com.gal.all;

import com.gal.algo.Calc;
import com.gal.algo.PasswordHasher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class MainBean {
    static void main() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.gal");
        context.refresh();

        PasswordHasher bean = context.getBean(PasswordHasher.class);
        PasswordHasher bean1 = context.getBean(PasswordHasher.class);
        System.out.println(bean);
        System.out.println(bean1);
        System.out.println(bean.hash("hello"));
        StringBuilder bean3 = context.getBean(StringBuilder.class);
        Calc bean4 = context.getBean(Calc.class);
        int sum = bean4.add(4,5);
        System.out.println(sum);

        String[] beans = context.getBeanDefinitionNames();

        for(String beanName : beans){
            System.out.println(beanName);
        }

        Object bean5 = context.getBean("getCalc");
        Object bean6 = context.getBean("calcNamedBean");

        DataSource ds = context.getBean(DataSource.class);
        System.out.println(ds);
        context.close();
    }


}
