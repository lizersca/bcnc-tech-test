package org.bcnc.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LogBeanPostProcessor implements BeanPostProcessor {

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName)
      throws BeansException {
    //log.info("Bean instantiated with name {} and class {}", beanName, bean.getClass().getSimpleName());
    return bean;
  }
}