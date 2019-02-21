package pl.sda.spring.coredi.beans;

import java.util.List;

import org.springframework.beans.factory.InitializingBean;

public class Philosopher implements InitializingBean {

    private String name;
    private HeavyQuestion mostImportantQuestion;
    private List<PhilosopherAttribute> attributes;

    public Philosopher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void afterPropertiesSet() throws Exception {
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    public HeavyQuestion getMostImportantQuestion() {
        return mostImportantQuestion;
    }

    public void setMostImportantQuestion(HeavyQuestion mostImportantQuestion) {
        this.mostImportantQuestion = mostImportantQuestion;
    }

    public List<PhilosopherAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<PhilosopherAttribute> attributes) {
        this.attributes = attributes;
    }
}

