package pl.sda.spring.coredi.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class EngineBeanPostprocessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("engine")) {
            Engine engine = (Engine) bean;
            engine.setEngineVolume(engine.getEngineVolume() + 100);
        }
        System.out.println("BEFORE INIT " + beanName);

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("AFTER INIT");

        return null;
    }
}
