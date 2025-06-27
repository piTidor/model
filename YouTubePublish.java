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
@Table(name ="yt_publish")
public class YouTubePublish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = true)
    private String status;

    private String shorts;

    private String r_creation_date;

    private String r_modify_date;

    //sadsad

    @Column(nullable = true)
    private String date;

    @Column(nullable = true)
    private String idInGroup;

    private String url;

    @ManyToOne
    @JoinColumn(name = "yt_group_id")
    private YouTubePosting ytPost;

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
