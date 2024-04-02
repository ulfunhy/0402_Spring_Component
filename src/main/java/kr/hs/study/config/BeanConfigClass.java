package kr.hs.study.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"kr.hs.study.beans"})
// base패키지 밑의 모든 클래스들에 잇는 어노테이션을 분석해서 컨테이터에 보관해라
public class BeanConfigClass {
}
