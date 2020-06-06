package team.study.rest.ebook.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import team.study.rest.ebook.domain.EBook;
import team.study.rest.ebook.dto.EBookDto;

import java.io.File;
import java.util.List;


public interface EBookService {

    boolean pdfToMp3(MultipartFile multipartFile);

    List<EBookDto> getList(int page);

    byte[] getMp3(long no);
}
