package com.thaleshealthtech.springboot.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class BeforeThrowingException {

    //could be written as this as well\
    @BeforeThrowi(pointcut = "execution(* com.thaleshealthtech..*(..)))", throwing = "ex")
    public void logAfterThrowingExceptionCall(Exception ex) throws Throwable {
        log.info("======THALESHEALTHTECH - Spring Boot AOP After Throwing Exception Example ");
        log.info(ex.getMessage());
        //handle exception with business logic like sending notification or default message
    }
}
