package com.model;

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
@Table(name ="yt_post_settings")
public class YouTubePostingSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column( columnDefinition = "BOOLEAN DEFAULT false")
    private boolean background;

    @Column( columnDefinition = "BOOLEAN DEFAULT false")
    private boolean namesLine;

    @Column( columnDefinition = "BOOLEAN DEFAULT false")
    private boolean allMOde;

    private String waterMark;

    private int topMergin;

    private int botMergin;

}
