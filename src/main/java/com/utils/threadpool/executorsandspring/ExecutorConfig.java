package com.utils.threadpool.executorsandspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author xs
 * @date 2021/04/01 22:05
 * 使用Executor接口，springboot，@Async注解创建线程池。
 */
@Configuration
@EnableAsync
public class ExecutorConfig {
    @Bean("asyncServiceExecutor")
    public Executor asyncServiceExecutor() {
        //ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        ThreadPoolTaskExecutor executor = new VisiableThreadPoolTaskExecutor();
        //配置核心线程数
        executor.setCorePoolSize(5);
        //配置最大线程数
        executor.setMaxPoolSize(5);
        //配置队列大小
        executor.setQueueCapacity(99999);
        //配置线程池中的线程的名称前缀
        executor.setThreadNamePrefix("自定义线程池ExecutorConfig");
        // rejection-policy：当pool已经达到max size的时候，如何处理新任务
        // CALLER_RUNS：不在新线程中执行任务，而是有调用者所在的线程来执行
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        //执行初始化
        executor.initialize();
        return executor;
    }
}
