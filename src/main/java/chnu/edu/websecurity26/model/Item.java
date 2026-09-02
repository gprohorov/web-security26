package chnu.edu.websecurity26.model;


import lombok.*;

/*
  @author   george
  @project   web-security26
  @class  Item
  @version  1.0.0 
  @since 02/09/2026 - 21.08
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Item {
    private String id;
    private String name;
    private String description;
}
