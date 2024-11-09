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
@Table(name ="vk_settings")
public class MainGroupSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private boolean isTextRefresh;

    private int start_post_date;

    private int finish_post_date;
    @Column(nullable = true)
    @Builder.Default
    private int start_clip = 10;
    @Column(nullable = true)
    @Builder.Default
    private int finish_clip = 22;

    @Column(nullable = true)
    @Builder.Default
    private int clip_hour = 10;

    private  int max_count;

    @Column(nullable = true)
    private int period;


}
