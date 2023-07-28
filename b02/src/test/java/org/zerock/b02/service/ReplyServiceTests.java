package org.zerock.b02.service;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.b02.dto.ReplyDTO;
import org.zerock.b02.repository.search.ReplyService;

@SpringBootTest
@Log4j2
public class ReplyServiceTests {

    @Autowired
    private ReplyService replyService;

    @Test
    public void testRegister(){

        ReplyDTO replyDTO = ReplyDTO.builder()
                .replyText("ReplyDTO Text")
                .replyer("replyer")
                .bno(100L)
                .build();

        log.info(replyService.register(replyDTO));
    }
}
