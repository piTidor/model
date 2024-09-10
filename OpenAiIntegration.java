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

    @Builder.Default
    private String systemText = "Ты анализируешь подпись к посту в социальной сети тебе нужно переформулировать текст соханив смысл следуя правилам: 1 если текст состоит из 10 и меньше слов, оставь его как есть, но комментарий добавь. 2 все что в скобках или кавычках оставь без измененний. 3 не сокращай перечисления. 4 если в тексте говорится о преступлении или о катастрофе или ещё о чем-то плохой, то коментарий не должен содержать вопросо о том кто виноват, илип просить подписчика выразить моральную оценку ситуации, просто спроси, что он об этом думает. 4 в тексте могут встретится слова на разных языках, не переводи, оставь все слова на оригиинальном языке.";

    @Builder.Default
    private String userText = "Измени текст, что бы смысл оставался прежним, сделай перенос строки и добавь короткий креативный комментарий, в вопросительной форме к подписчикам. вот текст для изменнения: ";

    @Builder.Default
    private String model = "gpt-4o-mini";

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
