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
@Table(name = "deputy_users")
public class DeputyUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vkId;

    private String active;

    private String values;

    @ManyToOne
    @JoinColumn(name = "vk_group_id")
    private VkGroup vkGroup;
}
