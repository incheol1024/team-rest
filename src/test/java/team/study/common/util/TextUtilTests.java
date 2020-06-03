package team.study.common.util;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import springfox.documentation.spring.web.json.Json;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;

@SpringBootTest
public class TextUtilTests {

    @Test
    public void whatLanguageTest() {
        String result = TextUtil.whatLanguage("만나서 반가워요!");
        System.out.println(result);
    }

    @Test
    public void translateIntoKoreanTest() {
        String result = TextUtil.translateIntoKorean("만나서 반가워요!");
        System.out.println(result);
    }

    @Test
    public void textToSpeech() throws IOException {
        byte[] result =TextUtil.textToSpeech("만나서 반가워요!");
        CustomFileUtil.makeByteArrayToFile("C:/study", "test.mp3", result);
    }
}
