package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name ="open_ai_settings")
public class OpenAiIntegration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String r_creation_date;

    private String r_modify_date;

    @ManyToOne
    @JoinColumn(name = "gpt_keys_id")
    private GPTKeys gptKeys;

    private int limited_token;

    private int promptTokens;

    private int completionTokens;

    private int totalTokens;

    @Override
    public String toString() {
        return "Подключенный ChatGPT для изменения тескста публикации:\n" +
                "Ограничение в месяц на количество токенов - " + limited_token +
                "\n" + "Израссходованно токеннов - " + totalTokens + "\n";

    }
}
