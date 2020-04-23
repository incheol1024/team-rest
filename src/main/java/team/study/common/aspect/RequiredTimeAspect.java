package team.study.common.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class RequiredTimeAspect {

    private Object requiredTimeLog(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = proceedingJoinPoint.proceed();
        log.info(proceedingJoinPoint.toShortString() + "소요시간 : " + (System.currentTimeMillis() - startTime));
        return result;
    }

     @Around("execution(* team.study.rest..controller.*Controller.*(..))")
    public Object requiredTimeLogController(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
       return this.requiredTimeLog(proceedingJoinPoint);
    }

    @Around("@annotation(team.study.common.annotation.RequiredTime)")
    public Object requiredTimeLogAnnotation(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        return this.requiredTimeLog(proceedingJoinPoint);
    }
}
