package org.zerock.b02.dto.upload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UploadResultDTO {

    private String uuid;
    private String fileName;
    private boolean img;

    public String getLink(){

        if (img){
            return "s_"+ uuid +"_"+fileName; // 이미지인경우 썸네일 표시
        } else {
            return uuid+"_"+fileName;
        }
    }
}
