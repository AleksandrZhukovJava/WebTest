package me.zhukov.webtest.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import me.zhukov.webtest.model.Message;
import me.zhukov.webtest.service.ChattingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/message")
@RestController
@RequiredArgsConstructor
public class MessageController {

    private final ChattingService chattingService;

    @PostMapping
    public boolean addMessage(@RequestBody Message message){
        return chattingService.addMessage(message);
    }
    @GetMapping("/getall")
    public List<Message> getAllMessage(){
        return chattingService.getAllMessage();
    }
    @GetMapping("/getall/{chatId}")
    public List<Message> getAllMessageByChatId(@PathVariable Long chatId){
        return chattingService.getAllMessageByChatId(chatId);
    }
}
