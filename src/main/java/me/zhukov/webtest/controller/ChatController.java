package me.zhukov.webtest.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import me.zhukov.webtest.model.Chat;
import me.zhukov.webtest.model.Message;
import me.zhukov.webtest.service.ChattingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/chat")
@RestController
@RequiredArgsConstructor
public class ChatController {

    private final ChattingService chattingService;

    @PostMapping
    public void addChat(@RequestBody Chat chat){
        chattingService.addChat(chat);
    }
}
