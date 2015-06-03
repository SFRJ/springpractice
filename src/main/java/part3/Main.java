package part3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    /*
        This example show Singleton Spring beans and also loading properties files with Spring
    */

    public static void main(String[] args) {
        AnnotationConfigApplicationContext contextFromAnnotation = new AnnotationConfigApplicationContext(PropertiesLoaderConfiguration.class);
        DemoBean bean = contextFromAnnotation.getBean(DemoBean.class);
        System.out.println(bean);
    }

}
