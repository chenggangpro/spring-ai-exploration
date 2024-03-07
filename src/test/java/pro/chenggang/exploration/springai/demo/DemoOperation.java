package pro.chenggang.exploration.springai.demo;

import org.junit.jupiter.api.Test;
import org.springframework.ai.chat.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import pro.chenggang.exploration.springai.SpringAiExplorationApplicationTests;

/**
 * @author evans
 * @version 1.0.0
 * @since 1.0.0
 */
public class DemoOperation extends SpringAiExplorationApplicationTests {

    @Autowired
    ChatClient chatClient;

    @Test
    void chat() {

    }

    @Test
    void htmlDocument() {
        // http://blog.codinglabs.org/articles/theory-of-mysql-index.html

    }

    @Test
    void pdfDocument() {
        // MySQL索引背后的数据结构及算法原理.pdf
    }

}
