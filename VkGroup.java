
package com.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name ="vk_group")
public class VkGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @OneToOne()
    private MainGroupSettings mainGroupSettings;

    @Column(nullable = true, name = "group_name")
    private String groupName;

    private int lastTimePost;

    private int members_count;

    @Column(nullable = true, columnDefinition = "BOOLEAN DEFAULT true")
    private Boolean postStories;

    private String name;

    @Column(name = "vk_id")
    private Integer vkId;

    @Column(nullable = true)
    private String code;

    private String token;

    boolean active;

    @Column(nullable = true)
    private String r_creation_date;

    @Column(nullable = true)
    private String r_modify_date;

    @PrePersist
    public void onCreate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String now = LocalDateTime.now().format(formatter);
        this.r_creation_date = now;
        this.r_modify_date = now;
    }
    @PreUpdate
    public void onUpdate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.r_modify_date = LocalDateTime.now().format(formatter);
    }


}