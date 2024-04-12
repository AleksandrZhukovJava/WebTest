package me.zhukov.webtest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Chat {
    private String chatType;
    private Long chatId;
}
