package team.study.common.util;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class PdfConverterTests {

    @Test
    public void pdfToTextTest() throws IOException {
        String text = PdfConverter.pdfToText(new File("C:\\Users\\SH\\Desktop\\book\\JohnsonChapter4.pdf"));
        System.out.println(text.length());
    }
}
