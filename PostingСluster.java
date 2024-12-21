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
@Table(name ="posting_cluster")
public class PostingСluster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "alisa_name")
    private String alias;

    @ManyToOne
    @JoinColumn(name = "timer_post", nullable = true)
    private TimerPost timerPost;
}
