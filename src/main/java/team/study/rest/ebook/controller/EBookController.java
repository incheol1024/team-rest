package team.study.rest.ebook.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import team.study.rest.ebook.dto.EBookDto;
import team.study.rest.ebook.service.EBookService;

import java.util.List;

@CrossOrigin("*")
@RequestMapping("/ebook")
@RestController
@RequiredArgsConstructor
public class EBookController {

    private final EBookService eBookService;

    @GetMapping("/play/{no}")
    public ResponseEntity<byte[]> playMp3(@PathVariable("no") long no) {
        return ResponseEntity.ok(eBookService.getMp3(no));
    }

    @GetMapping("/list/{page}")
    public ResponseEntity<List<EBookDto>> getList(@PathVariable("page") int page) {
        return ResponseEntity.ok(eBookService.getList(page));
    }

    @PostMapping("/upload")
    public ResponseEntity<String> pdfToMp3(@RequestParam("file") MultipartFile multipartFile) {
        eBookService.pdfToMp3(multipartFile);
        return ResponseEntity.ok("File Transfer SUCCESS!!!");
    }
}
