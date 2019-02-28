package task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class InterestDemo {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(InterestDemo.class);
        Interest interest=context.getBean(Interest.class);
        System.out.print(interest);
    }
}
