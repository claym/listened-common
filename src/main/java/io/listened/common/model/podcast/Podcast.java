package io.listened.common.model.podcast;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Clay on 6/21/2015.
 * Podcast attributes standard to the rss namespace
 */
@Data
@Entity
@Table(name="podcast")
public class Podcast {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "podcast_id_seq", sequenceName = "podcast_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    Long id;

    @Column(name = "feed_url", unique = true, nullable = false)
    String feedUrl;

    @Column(name="copyright")
    String copyright;

    @Column(name="description")
    String description;

    @Column(name="docs")
    String docs;

    @Column(name="language")
    String language;

    @Column(name="link")
    String link;

    @Column(name="publish_date")
    Date publishDate;

    @Column(name="title")
    String title;

    /** Begin iTunes Stuff **/

    @Column(name="summary")
    String summary;

    @Column(name="subtitle")
    String subtitle;

    @Column(name="block")
    Boolean block;

    @Column(name="explicit")
    Boolean explicit;

}
