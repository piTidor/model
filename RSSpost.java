
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
@Table(name ="rss_post")
public class RSSpost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    private String title;

    private String description ;

    private String image;

    private String inditif;

    private boolean posting;

    @ManyToOne
    @JoinColumn(name = "rss_group_id")
    private RssView rssView;
}
