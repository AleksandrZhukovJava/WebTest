package me.zhukov.webtest.controller;

import me.zhukov.webtest.model.Chat;
import me.zhukov.webtest.service.ChattingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Controller
public class ChatController {

    private ChattingService chattingService;

    @GetMapping
    public void addChat(Chat chat) {
        chattingService.addChat(chat);
    }
}
