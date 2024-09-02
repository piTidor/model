package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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

    private String r_creation_date;

    private String r_modify_date;

    private int lastTimePost;

    private int members_count;

    @Column(nullable = true, columnDefinition = "BOOLEAN DEFAULT true")
    private Boolean postStories;

    private String name;
    @Column(name = "vk_id")
    private Integer vkId;

    private String token;

    boolean active;


}