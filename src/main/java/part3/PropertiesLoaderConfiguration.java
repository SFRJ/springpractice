package part3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)//Makes this bean a singleton(Only loaded once)
@PropertySource("part3.properties")//Finds the properties file in the classpath
@ComponentScan(basePackages = "part3")//Enables automatic bean detection for the package
public class PropertiesLoaderConfiguration {

    @Autowired
    Environment environment;

    @Bean
    public DemoBean demoBean() {
        return new DemoBean(environment.getProperty("propA"), environment.getProperty("propB"));
    }
}
