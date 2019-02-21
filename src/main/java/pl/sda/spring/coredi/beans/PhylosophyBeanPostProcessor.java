package pl.sda.spring.coredi.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PhylosophyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("heavyQuestion".equals(beanName)) {
            HeavyQuestion concreteBean = (HeavyQuestion) bean;
            concreteBean.setQuestion(concreteBean.getQuestion() + " Indeed hard question...");
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }
}
