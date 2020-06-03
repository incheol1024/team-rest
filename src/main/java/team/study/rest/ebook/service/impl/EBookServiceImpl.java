package team.study.rest.ebook.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import team.study.common.util.CustomFileUtil;
import team.study.common.util.ModelMapperUtil;
import team.study.common.util.PdfConverter;
import team.study.common.util.TextUtil;
import team.study.rest.ebook.domain.EBook;
import team.study.rest.ebook.dto.EBookDto;
import team.study.rest.ebook.repository.EBookRepository;
import team.study.rest.ebook.service.EBookService;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EBookServiceImpl implements EBookService {

    private final String path = "C:/study";

    private final EBookRepository eBookRepository;

    @Override
    public boolean pdfToMp3(MultipartFile multipartFile) {
        try {
            File file = CustomFileUtil.covertMultipartFileToFile(this.path, multipartFile);
            String text = PdfConverter.pdfToText(file);

            for (int i = 0; i < 1; i++) {
                String str = text.substring(i * 5000, (i + 1) * 5000 - 1);
                byte[] mp3 = TextUtil.textToSpeech(str);
                CustomFileUtil.makeByteArrayToFile(this.path, file.getName().replace("\\.pdf", ""), mp3);
            }
//            eBookRepository.save(EBook.builder().build());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<EBookDto> getList(int page) {
        return eBookRepository.findAll(PageRequest.of(page, 10)).stream()
                .map(entity -> ModelMapperUtil.convertTo(entity, EBookDto.class))
                .collect(Collectors.toList());
    }

}
