package afterreturningadvice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("afterreturningadvice")
@EnableAspectJAutoProxy
public class Conf {

}
