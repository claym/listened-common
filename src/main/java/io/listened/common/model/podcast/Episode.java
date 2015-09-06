package io.listened.common.model.podcast;

import lombok.Data;
import org.hibernate.annotations.Type;
import org.hibernate.type.TextType;

import javax.persistence.*;
import java.sql.Types;
import java.util.Date;
import java.util.List;

/**
 * Created by Clay on 6/29/2015.
 * Episode attributes standard to the rss namespace
 *
 * skipped stuff
 * links
 * titleex
 * contents
 * source
 */
@Data
@Entity
@Table(name="episode")
public class Episode {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "episode_id_seq", sequenceName = "episode_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="comments", columnDefinition = "text")
    private String comments;

    @Column(name="description", columnDefinition = "text")
    private String description;

    @Column(name="link", columnDefinition = "text")
    private String link;

    @Column(name="published_date")
    private Date publishedDate;

    @Column(name="title", columnDefinition = "text")
    private String title;

    @Column(name="updated_date")
    private Date updatedDate;

    @Column(name="last_processed")
    Date lastProcessed;

    // called uri in syndentry
    @Column(name="guid", columnDefinition = "text")
    private String guid;

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

    @Column(name="summary", columnDefinition = "text")
    private String summary;

    // associations

    @ManyToOne
    @JoinColumn(name = "podcast_id")
    private Podcast podcast;

    @OneToMany(mappedBy = "episode")
    private List<EpisodeKeyword> episodeKeyword;

}
