
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
@Table(name ="posting_group")
public class PostingGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int vkId;
    @Column(nullable = true)
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private GroupSettings groupSettings;

    @OneToOne(cascade = CascadeType.ALL)
    private OpenAiIntegration openAiIntegration;

    @Column(name = "last_post_date")
    private int lastTimePost;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private VkGroup vkGroup;

    @ManyToOne
    @JoinColumn(name = "posting_cluster", nullable = true)
    private PostingСluster postingСluster;

    @Column(nullable = true,columnDefinition = "BOOLEAN DEFAULT false")
    private boolean hasPined;


    @Column(nullable = true, columnDefinition = "BOOLEAN DEFAULT false")
    private boolean deleted;

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

    @Override
    public String toString() {

        return "Группа для копирайта:\n" +
                "Имя - " + name +
                "\nID группы - " + vkId +
                "\n" + groupSettings.toString() +
                openAiIntegration.toString() +
                "\nИмя группы - " + vkGroup.getName();
    }
}
