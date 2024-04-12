package me.zhukov.webtest.controller;

import me.zhukov.webtest.model.Message;
import me.zhukov.webtest.service.ChattingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping
@Controller
public class MessageController {

    private ChattingService chattingService;

    public boolean addMessage(Message message) {
        return chattingService.addMessage(message);
    }

    public List<Message> getAllMessage() {
        return chattingService.getAllMessage();
    }

    public List<Message> getAllMessageByChatId(Long chatId) {
        return chattingService.getAllMessageByChatId(chatId);
    }
}
