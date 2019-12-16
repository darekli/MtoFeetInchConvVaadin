package mf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;

public abstract class GenericFactory<T> {

    @Autowired
    private AutowireCapableBeanFactory autowireBeanFactory;
    private T createdBean;

    public T createBean() {
        // creation logic
        autowireBeanFactory.autowireBean(createdBean);
        return createdBean;
    }
}
