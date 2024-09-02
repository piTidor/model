package org.example.model;

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

    @ManyToOne
    @JoinColumn(name = "group_id")
    private VkGroup vkGroup;

    @Column(nullable = true, columnDefinition = "BOOLEAN DEFAULT false")
    private boolean photo;
    @Column(nullable = true, columnDefinition = "BOOLEAN DEFAULT false")
    private boolean video;
    @Column(nullable = true, columnDefinition = "BOOLEAN DEFAULT false")
    private boolean text;
    @Column(nullable = true,columnDefinition = "BOOLEAN DEFAULT false")
    private boolean hasPined;

    @Column(nullable = true)
    private int maxCount;

    @Column(nullable = true)
    private int timePost;

    @Column(nullable = true, columnDefinition = "BOOLEAN DEFAULT false")
    private boolean deleted;

    private int countPost;


    @Override
    public String toString() {

        long seconds = timePost;
        long hours = seconds / 3600;
        long minutes = (seconds % 3600) / 60;

        return "Группа для копирайта:\n" +
                "Имя - " + name +
                "\nКопировать вместе с текстом - " + (text ? "Да" : "Нет") +
                "\nМожно ли копировать видео - " + (video ? "Да" : "Нет") +
                "\nМожно ли копировать картинки - " + (photo ? "Да" : "Нет") +
                "\nИнтервал публикаций - " + hours + " ч " + minutes + " мин" +
                "\nID группы - " + vkId +
                "\n" + groupSettings.toString() +
                openAiIntegration.toString() +
                "\nИмя группы - " + vkGroup.getName();
    }
}
