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
@Table(name ="vk_settings")
public class MainGroupSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private boolean isTextRefresh;

    private int start_post_date;

    private int finish_post_date;

    private  int max_count;

    @Column(nullable = true)
    private int period;


}
