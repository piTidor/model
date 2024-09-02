package org.example.model;

import com.google.gson.Gson;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;

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

//    @OneToMany(mappedBy = "user")
//    private List<VkGroup> vk_groups;

//    @OneToMany(mappedBy = "user")
//    private List<LastMessages> messages;

    private Date r_creation_date;

    private Date r_modify_date;

    private Long vkId;

    private String token;

    private String name;

    private boolean active;


    public static Users convertJsonToUsers(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Users.class); // Преобразование JSON в объект Users
    }
    public String convertUsersToJson() {
        Gson gson = new Gson();
        return gson.toJson(this); // Преобразование объекта Users в JSON
    }

    public static boolean isEmpty(Users users){
        if (users == null){
            return true;
        }
        return StringUtils.isEmpty(users.getName());
    }

}