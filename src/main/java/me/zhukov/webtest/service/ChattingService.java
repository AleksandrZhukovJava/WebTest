package me.zhukov.webtest.service;

import lombok.extern.slf4j.Slf4j;
import me.zhukov.webtest.model.Chat;
import me.zhukov.webtest.model.Message;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
@Slf4j
public class ChattingService {
    private final List<Message> messageList = new ArrayList<>();
    private final List<Chat> chatList = new ArrayList<>();


    public boolean addMessage(Message message) {
        if (chatList.stream().map(Chat::getChatId).toList().contains(message.getChatId())) {
            log.info("chat with id: [{}] exists, message with text: [{}] adding", message.getChatId(), message.getText());
            return messageList.add(message);
        } else {
            log.info("chat with id [{}] not exist", message.getChatId());
            return false;
        }
    }

    public void addChat(Chat chat) {
        chatList.add(chat);
        log.info("chat with id [{}] adding", chat.getChatId());
    }

    @GetMapping
    public List<Message> getAllMessage(){
        return Collections.unmodifiableList(messageList);
    }
    @GetMapping
    public List<Message> getAllMessageByChatId(Long chatId){
        return messageList.stream().filter(x -> x.getChatId().equals(chatId)).toList();
    }
}
