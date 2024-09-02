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
@Table(name ="gpt_keys")
public class GPTKeys {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String api;

}
