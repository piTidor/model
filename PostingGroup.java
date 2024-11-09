
package com.example.collectorvk.model;


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

    @Column(nullable = true,columnDefinition = "BOOLEAN DEFAULT false")
    private boolean hasPined;


    @Column(nullable = true, columnDefinition = "BOOLEAN DEFAULT false")
    private boolean deleted;



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
