package kouclo.dubbo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Consumer {
 
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
 
        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果
        System.out.println( demoService.sayFuck("you") ); // 显示调用结果
        List<User> list=demoService.getUsers();
        if (list != null && list.size() > 0) {  
            for (int i = 0; i < list.size(); i++) {  
                System.out.println(list.get(i).getName());  
            }  
        }  
    }
 
}