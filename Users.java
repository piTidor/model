
package com.example.downloader.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name ="users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String r_creation_date;

    private String r_modify_date;

    private Long vkId;

    private String token;

    private String name;

    private boolean active;


    public static boolean isEmpty(Users users){
        if (users == null){
            return true;
        }
        return StringUtils.isEmpty(users.getName());
    }

}