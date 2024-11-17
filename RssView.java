
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
@Table(name ="rss_view")
public class RssView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    private String url;

    @ManyToOne
    @JoinColumn(name = "vk_group_id")
    private VkGroup vkGroup;

}
