package org.zerock.apps3.util;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class S3UploaderTest {

    @Autowired
    private S3Uploader s3Uploader;

    @Test
    public void testUpload() {

        try {
            String filePath = "C:\\zzz\\test.jpg";
            String uploadName = s3Uploader.upload(filePath);
            log.info(uploadName);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

    @Test
    public void testRemove() {

            try{

                s3Uploader.removeS3File("test.jpg");
            } catch (Exception e){
                log.error(e.getMessage());
            }
        }
    }
