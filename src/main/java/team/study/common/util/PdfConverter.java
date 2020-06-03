package team.study.common.util;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class PdfConverter {

    public static String pdfToText(File file) throws IOException {
        PDDocument document = PDDocument.load(file);
        return new PDFTextStripper().getText(document);
    }
}
