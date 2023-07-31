package org.zerock.b02.controller;

import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.b02.dto.upload.UploadFileDTO;

@RestController
@Log4j2
public class UpDownController {

    @ApiOperation(value = "Upload POST", notes = "POST방식으로 파일 등록")
    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)

    public String upload(UploadFileDTO uploadFileDTO){

        log.info(uploadFileDTO);

        return null;
    }
}
