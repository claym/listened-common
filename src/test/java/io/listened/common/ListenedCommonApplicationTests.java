package io.listened.common;

import io.listened.common.model.podcast.Podcast;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManagerFactory;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ListenedCommonApplication.class)
@Transactional
public class ListenedCommonApplicationTests {


    @Test
    public void contextLoads() {
    }

    @Test
    public void testThis() {

    }


}
