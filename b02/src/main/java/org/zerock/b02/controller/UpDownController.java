package org.zerock.b02.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.b02.dto.upload.UploadFileDTO;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;


@RestController
@Log4j2
public class UpDownController {

    @Value ("${org.zerock.upload.path}") // import시 springframework로 시작하는 value
    private String uploadPath;

    @ApiOperation(value = "Upload POST", notes = "POST방식으로 파일 등록")
    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)

    public String upload(UploadFileDTO uploadFileDTO){

        log.info(uploadFileDTO);

        if (uploadFileDTO.getFiles() != null){

            uploadFileDTO.getFiles().forEach(multipartFile -> {
                
                // 중복된 파일명 방지
                String originalName = multipartFile.getOriginalFilename();
                log.info(originalName);

                // UUID로 새로운 코드값 생성
                String uuid = UUID.randomUUID().toString();

                Path savePath = Paths.get(uploadPath, uuid+"_"+ originalName);

                try{
                    multipartFile.transferTo(savePath); // 실제 파일 저장
                } catch (IOException e){
                    e.printStackTrace();
                }

            }); // end each
        } // end if
        return null;
    }
}
