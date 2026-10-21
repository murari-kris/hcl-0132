package org.example.notificationService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class WhatsAppService implements NotificationService{
    @Override
    public void sendMessage(String msg) {
        System.out.println("WhatsApp service:"+msg);
    }
}
