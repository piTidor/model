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
@Table(name ="timer_post")
public class TimerPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "timer_type")
    @Enumerated(EnumType.STRING)
    private TimerType timerType;

    @Column(name = "period")
    private int period;

    @Column(name = "start_post_date", nullable = true)
    private int startPostDate;

    @Column(name = "finish_post_date", nullable = true)
    private int finishPostDate;

    @Column(name = "last_post_date")
    private int lastTimePost;

    @Column(name = "schedule", nullable = true)
    private String schedule;
}
