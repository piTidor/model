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
@Table(name ="publish")
public class PublishPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Integer identity;

    @Column(name = "oldText", length = 1000)
    private String oldText;

    @Column(name = "newText", length = 1000)
    private String newText;

    private String r_creation_date;

    private String r_modify_date;

    @Column(nullable = true)
    private String date;

    @Column(nullable = true)
    private String idInGroup;

    private String url;

    @ManyToOne
    @JoinColumn(name = "posting_group_id")
    private PostingGroup postingGroup;

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

    public void setNewText(String newText) {
        if (newText != null && newText.length() > 1000) {
            this.newText = newText.substring(0, 1000); // Обрезаем до 1000 символов
        } else {
            this.newText = newText;
        }
    }
    public void setOldText(String oldText) {
        if (oldText != null && oldText.length() > 1000) {
            this.oldText = oldText.substring(0, 1000); // Обрезаем до 1000 символов
        } else {
            this.oldText = oldText;
        }
    }
}
