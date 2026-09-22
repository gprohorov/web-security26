package chnu.edu.websecurity26.model;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

/*
  @author   george
  @project   web-security26
  @class  Item
  @version  1.0.0 
  @since 02/09/2026 - 21.08
*/
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Document
public class Item extends AuditMetadata{
    private String id;
    private String name;
    private String description;

    public Item(String description, String name) {
        this.description = description;
        this.name = name;
    }
}
