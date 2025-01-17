package com.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name ="post_settings")
public class GroupSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = true, columnDefinition = "BOOLEAN DEFAULT false")
    private boolean text;

    private int count;

    private boolean onliVideo;

    private boolean linkBlocker;

    private boolean onliPhoto;

    private boolean VideoIfHasPhoto;

    private boolean PhotoIfHasVideo;

    @Column(name = "nop_on_day",columnDefinition = "int DEFAULT 0")
    private int topOnDay;

    @Column(columnDefinition = "int DEFAULT 0", name = "hour_post")
    private int hourPost;

    @Column(columnDefinition = "BOOLEAN DEFAULT false", name = "today_posted")
    private boolean todayPosted;

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
        return "Углубленные настройки:\n" +
                "Копировать только посты с видео: " + (onliVideo ? "Да" : "Нет") + "\n" +
                "Копировать только посты с картинками: " + (onliPhoto ? "Да" : "Нет") + "\n" +
                "Копировать посты с видео, если там есть картинки: " + (VideoIfHasPhoto ? "Да" : "Нет") + "\n" +
                "Копировать посты с картинками, если там есть видео: " + (PhotoIfHasVideo ? "Да" : "Нет") + "\n" +
                "Можно ли копировать посты с ссылками: " + (linkBlocker ? "Да" : "Нет") + "\n";
    }
}
