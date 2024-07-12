package hwan.eventexam;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomEventPublisher {
    // post-comment 예제였다면 이 클래스가 CommentService였을 것이다.
    private final ApplicationEventPublisher applicationEventPublisher;

    // 댓글 등록하는 메서드
    public void publishEvent(final String message) {
        System.out.println("댓글 등록!!");
        // 댓글 등록하는 일을 하고

        CustomEvent customEvent = new CustomEvent(this, message);
        applicationEventPublisher.publishEvent(customEvent);
    }
}
