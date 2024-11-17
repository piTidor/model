
package com.example.downloader.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    @Column(nullable = true)
    private String date;

    @Column(nullable = true)
    private String idInGroup;

    private String url;

    @ManyToOne
    @JoinColumn(name = "posting_group_id")
    private PostingGroup postingGroup;

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
