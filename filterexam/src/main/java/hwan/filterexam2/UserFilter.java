package hwan.filterexam2;

import jakarta.servlet.*;

import java.io.IOException;

public class UserFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // 사용자가 요청하면서 보낸 값이 있다면 추출해서 UserContext에 저장하는 코드 구현
        try {
            User user = new User();
            user.setUsername("hwan");
            user.setPassword("1234");

            UserContext.setUser(user); // UserContext에 값을 저장했을 때 이 값을 어디서 사용할 수 있는지

            filterChain.doFilter(servletRequest, servletResponse);
        } finally {
            UserContext.clear(); // 쓰레드풀을 사용하므로, 기존에 사용했던 쓰레드를 또 쓸 수 있다.
            // 그때 ThreadLocal에 값이 남아있으면 안되므로
        }
    }
}
