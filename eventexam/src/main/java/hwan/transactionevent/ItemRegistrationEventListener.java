package hwan.transactionevent;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ItemRegistrationEventListener {
    @EventListener
    public void handleItemRegistrationEvent(ItemRegistrationEvent event) {
        // 이벤트가 발생했을 때 할 일 구현   아이템이 등록되었을 때 부수적으로 할 일이 있다면 여기 구현
        // 상품이 등록되었을 때 고객에게 문자나 이메일 등을 발송하는 등의 일을 처리할 수 있다.
        System.out.println("아이템 등록 이벤트 처리 :: 상품 이름 :: " + event.getName() + " 상품 가격 :: " + event.getPrice());

    }
}
