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
@Table(name ="publish")
public class PublishPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Integer identity;

    @Column(nullable = true)
    private String date;

    @Column(nullable = true)
    private String idInGroup;

    @ManyToOne
    @JoinColumn(name = "posting_group_id")
    private PostingGroup postingGroup;
}
