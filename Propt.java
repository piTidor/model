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
@Table(name ="propt")
public class Propt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String proxyIP;

    private int proxyPort;

    private String proxyUser;

    private String proxyPass;

    private String proxyURL;

    private String testGroupToken;

    private String testUserToken;

    private int day;

    private int hour;
}