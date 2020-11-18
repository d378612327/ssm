package jee.support.entity;

import lombok.Data;
@Data
public class Attachment
{
    long attachmentId;
    String fileName;
    String mimeType;
    String fileUrl;
    long studentId;


    public void setFileName(String filename) {
    }

    public void setMimeType(String contentType) {
    }

    public void setFileUrl(String s) {
    }
}
