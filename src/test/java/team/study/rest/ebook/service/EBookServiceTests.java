package team.study.rest.ebook.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
public class EBookServiceTests {

    @Autowired
    private EBookService eBookService;

    @Test
    public void test() {
        eBookService.test(new File("C:\\Users\\SH\\Desktop\\book\\JohnsonChapter4.pdf"));
    }
}
