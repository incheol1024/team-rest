package team.study.common.util;

import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public final class CustomFileUtil {

    public static File covertMultipartFileToFile(String path, MultipartFile multipartFile) throws IOException {
        File file = new File(path + "/" + multipartFile.getOriginalFilename());
        file.createNewFile();
        FileOutputStream out = new FileOutputStream(file);
        out.write(multipartFile.getBytes());
        out.close();
        return file;
    }

    public static void makeByteArrayToFile(String path, String fileName, byte[] array) throws IOException {
        FileUtils.writeByteArrayToFile(new File(path + "/" + fileName), array, true);
    }
}
