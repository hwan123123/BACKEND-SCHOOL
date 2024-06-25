package hwan.filterexam3;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean // 필터를 등록할 때 애노테이션 방법보다 config 방법을 이용하면 좀 더 직관적이고 디테일한 설정 가능
    public FilterRegistrationBean<UserFilter> authenticationFilter() {
        FilterRegistrationBean<UserFilter> registrationBean = new FilterRegistrationBean<>();
        UserFilter userFilter = new UserFilter();
        registrationBean.setFilter(userFilter);
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(1); // 필터 실행 시 우선 순위를 정할 수 있다. 숫자가 작을 수록 높은 우선순위
        return registrationBean;
    }
}
