package org.example.jdbc01;

import lombok.*;

//롬복!!
@AllArgsConstructor
@Getter
@ToString
//@NoArgsConstructor
//@Setter
public class User {
    private long id;
    private String name;
    private String email;
}
