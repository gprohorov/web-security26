package chnu.edu.websecurity26.model;


/*
  @author   george
  @project   web-security26
  @class  AuditMetadata
  @version  1.0.0 
  @since 22/09/2026 - 12.47
*/

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

public class AuditMetadata {

    @Data
    public class AuditMetaData {

        @CreatedDate
        private LocalDateTime createdDate;
        @CreatedBy
        private String createdBy;
        @LastModifiedDate
        private LocalDateTime lastModifiedDate;
        @LastModifiedBy
        private String lastModifiedBy;

    }
}
