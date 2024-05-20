package org.example.springjdbc05;

import lombok.Setter;
import lombok.ToString;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.List;

@ToString
@Setter
public class User {
    private Long id;
    private String name;
    private String email;

    //권한 List..
//    List<Role> roles = new ArrayList<>();
}
