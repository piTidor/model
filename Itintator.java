package com.example.downloader.model;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Itintator {
    public void initir (Session session) {
        session.beginTransaction();
        GPTKeys gptKeys = GPTKeys.builder()
                .id(1L)
                .api("sk-31VoUJ0qizpKvWjhvjYgEWr8D3l2U4Gw")
                .build();
        session.save(gptKeys);
        Users users = Users.builder()
                .id(1L)
                .vkId(296590050L)
                .name("я")
                .active(true)
                .token("vk1.a.MoVcCvqnDbeu5qaIHiJP57_ZB2UMGMq4JvJ3rZ4SuvbZoUaftevrVrRW5GeBZLEoJP9d1rxw1-_BX24uWZyZ_DX0x2bE12H2q5Q8QZxh0kgZYyYhJpihfTx2L-QeFoMNG_CSDzRFtXWqJhZBu_pKSvVUzhFgYjtxG-nnwvQFaPcG1iKhAoSEI5p61BL9d5ZxmdE1AIa9Gc5ItwMTe8-lRw")
                .build();
        session.save(users);

        // Русалочка
        MainGroupSettings mainGroupSettings = MainGroupSettings.builder()
                .max_count(10)
                .start_post_date(9)
                .period(7200)
                .isTextRefresh(true)
                .finish_post_date(21)
                .build();
        session.save(mainGroupSettings);
        VkGroup vkGroup = VkGroup.builder()
                .mainGroupSettings(mainGroupSettings)
                .user(users)
                .token("vk1.a._Njs_IEjJCFEsqgIByffTZ5mp0iuBpsC9hVTrWifNKSRTn7o9QOj0RriF0DB6s7XXq51RmeJo1ntpv8ED4ZoLziVCmNJMWmQWBAaHQ5RXo-mljE37Lm5ZO4bqCbhv0rS4L1rbuRLUmu9SU7JwvUi4aGqUmGVObh_qizb3p36dN0gac4yUEfrxp3ZXMHS7bwVeT7_5XXFls7w7dmWVuzemQ")
                .name("Русалочка")
                .postStories(true)
                .active(true)
                .lastTimePost(1725825600)
                .members_count(109120)
                .vkId(166253156)
                .build();
        session.save(vkGroup);

        //группа постинг
        GroupSettings groupSettings = GroupSettings.builder()
                .text(true)
                .VideoIfHasPhoto(true)
                .PhotoIfHasVideo(false)
                .onliVideo(false)
                .onliPhoto(false)
                .linkBlocker(true)
                .count(10)
                .build();
        session.save(groupSettings);
        OpenAiIntegration openAiIntegration = OpenAiIntegration.builder()
                .gptKeys(gptKeys)
                .limited_token(0)
                .promptTokens(0)
                .completionTokens(0)
                .build();
        session.save(openAiIntegration);
        PostingGroup postingGroup = PostingGroup.builder()
                .hasPined(false)
                .deleted(false)
                .vkId(-35294456)
                .vkGroup(vkGroup)
                .openAiIntegration(openAiIntegration)
                .groupSettings(groupSettings)
                .name("Как я встретил столбняк")
                .build();
        session.save(postingGroup);
        // след группа постинг

        GroupSettings groupSettings1 = GroupSettings.builder()
                .text(true)
                .VideoIfHasPhoto(true)
                .PhotoIfHasVideo(false)
                .onliVideo(false)
                .onliPhoto(false)
                .linkBlocker(true)
                .count(10)
                .build();
        session.save(groupSettings1);
        OpenAiIntegration openAiIntegration1 = OpenAiIntegration.builder()
                .gptKeys(gptKeys)
                .limited_token(0)
                .promptTokens(0)
                .completionTokens(0)
                .build();
        session.save(openAiIntegration1);
        PostingGroup postingGroup1 = PostingGroup.builder()
                .hasPined(false)
                .deleted(false)
                .vkId(-161035654)
                .vkGroup(vkGroup)
                .openAiIntegration(openAiIntegration1)
                .groupSettings(groupSettings1)
                .name("Кажется, у меня депрессия.")
                .build();
        session.save(postingGroup1);
        // конец
        ////////////////////////////////////////


        MainGroupSettings mainGroupSettings1 = MainGroupSettings.builder()
                .max_count(10)
                .start_post_date(-1)
                .period(7200)
                .isTextRefresh(true)
                .finish_post_date(21)
                .build();
        session.save(mainGroupSettings1);
        VkGroup vkGroup1 = VkGroup.builder()
                .mainGroupSettings(mainGroupSettings1)
                .user(users)
                .token("vk1.a.wsYatFto76Zd5T_LW0mO1yzVstYnJvJ-No1Ge285RYjInNQ5rmmSI-EgxrTn7oge3OIOz9zUW-F9Xy2Ts2fPbgycRBUgC1sS38S9ZcVaQiRMBpmIO2N4eoKoeXGD51J95dRrL-8UNTDUGEAJuFynhFyjz0sTdTQL0GsULPm8l5PoEHIzj0_qA0qBKASvGV6iVBdSnTS07AT3UCV_omJ7Zg")
                .name("Стакан в лоб")
                .postStories(true)
                .active(true)
                .lastTimePost(0)
                .members_count(2)
                .vkId(227210380)
                .build();
        session.save(vkGroup1);

        //группа постинг
        GroupSettings groupSettings2 = GroupSettings.builder()
                .text(true)
                .VideoIfHasPhoto(true)
                .PhotoIfHasVideo(false)
                .onliVideo(false)
                .onliPhoto(false)
                .linkBlocker(true)
                .count(10)
                .build();
        session.save(groupSettings2);
        OpenAiIntegration openAiIntegration2 = OpenAiIntegration.builder()
                .gptKeys(gptKeys)
                .limited_token(0)
                .promptTokens(0)
                .completionTokens(0)
                .build();
        session.save(openAiIntegration2);
        PostingGroup postingGroup2 = PostingGroup.builder()
                .hasPined(false)
                .deleted(false)
                .vkId(-194944166)
                .vkGroup(vkGroup1)
                .openAiIntegration(openAiIntegration2)
                .groupSettings(groupSettings2)
                .name("ND - Новости Дня")
                .build();
        session.save(postingGroup2);
        // след группа постинг

        GroupSettings groupSettings3 = GroupSettings.builder()
                .text(true)
                .VideoIfHasPhoto(true)
                .PhotoIfHasVideo(false)
                .onliVideo(false)
                .onliPhoto(false)
                .linkBlocker(true)
                .count(10)
                .build();
        session.save(groupSettings3);
        OpenAiIntegration openAiIntegration3 = OpenAiIntegration.builder()
                .gptKeys(gptKeys)
                .limited_token(0)
                .promptTokens(0)
                .completionTokens(0)
                .build();
        session.save(openAiIntegration3);
        PostingGroup postingGroup3 = PostingGroup.builder()
                .hasPined(false)
                .deleted(false)
                .vkId(-206530812)
                .vkGroup(vkGroup1)
                .openAiIntegration(openAiIntegration3)
                .groupSettings(groupSettings3)
                .name("Liberty News")
                .build();
        session.save(postingGroup3);
        session.getTransaction().commit();
        Transaction transaction = null;
        transaction = session.beginTransaction();

        String sql = "INSERT INTO youtube_group_view (text, url, video, group_id, count) VALUES (true, 'https://www.youtube.com/@i11ush/shorts', true, 1, 1)";
        Query query = session.createNativeQuery(sql);
        query.executeUpdate();
        sql = "INSERT INTO youtube_group_view (text, url, video, group_id, count) VALUES (true, 'https://www.youtube.com/@GudsSonn/shorts', true, 1, 1)";
        query = session.createNativeQuery(sql);
        query.executeUpdate();
        sql = "INSERT INTO youtube_group_view (text, url, video, group_id, count ) VALUES (true, 'https://www.youtube.com/@Animuli', true, 1, 3)";
        query = session.createNativeQuery(sql);
        query.executeUpdate();
        sql = "INSERT INTO youtube_group_view (text, url, video, group_id, count) VALUES (true, 'https://www.youtube.com/@swamidanya/shorts', true, 2, 2)";
        query = session.createNativeQuery(sql);
        query.executeUpdate();
        sql = "insert into stories_group_view ( photo, text, video, vkid, group_id) VALUES (true,true,true, -145162768 , 2)";
        query = session.createNativeQuery(sql);
        query.executeUpdate();


        transaction.commit();
    }
}
