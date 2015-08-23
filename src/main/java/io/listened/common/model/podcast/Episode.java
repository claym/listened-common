package io.listened.common.model.podcast;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Clay on 6/29/2015.
 * Episode attributes standard to the rss namespace
 */
@Data
@Entity
@Table(name="episode")
public class Episode {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "podcast_id_seq", sequenceName = "podcast_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "podcastId")
    private Podcast podcast;

    @Column(name="comments")
    private String comments;

    @Column(name="description")
    private String description;

    @Column(name="link")
    private String link;

    @Column(name="publish_date")
    private Date publishDate;

    @Column(name="title")
    private String title;

    @Column(name="updated_date")
    private Date updatedDate;

    // enclosure stuff

    @Column(name="url")
    private String url;

    @Column(name="type")
    private String type;

    @Column(name="length")
    private Long length;

    // itunes stuff

    @Column(name="block")
    private Boolean block;

    @Column(name="explicit")
    private Boolean explicit;

    @Column(name="summary")
    private String summary;

}
