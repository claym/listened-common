package io.listened.common;

import io.listened.common.model.podcast.Podcast;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManagerFactory;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ListenedCommonApplication.class)
@ContextConfiguration(classes = { TestConfig.class })
@Transactional
public class ListenedCommonApplicationTests {

    @Autowired
    SessionFactory sessionFactory;


    @Test
    public void contextLoads() {
    }

    @Test
    public void createPodcast() {
        Session s = sessionFactory.getCurrentSession();
        Podcast podcast = new Podcast();
        podcast.setFeedUrl("http://revolutionspodcast.libsyn.com/rss/");
        Long id = (Long) s.save(podcast);
        assert id != null;
        log.info("Saved podcast {}", id);
        podcast = (Podcast) s.get(Podcast.class, id);
        assert podcast != null;
    }


}
