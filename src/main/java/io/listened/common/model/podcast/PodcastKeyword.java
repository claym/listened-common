package io.listened.common.model.podcast;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Clay on 8/31/2015.
 */
@Data
@Entity
@Table(name="podcast_keyword")
public class PodcastKeyword {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "podcast_keyword_id_seq", sequenceName = "podcast_keyword_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(targetEntity = Podcast.class)
    @JoinColumn(name="podcast_id")
    private Podcast podcast;

    @ManyToOne(targetEntity = Keyword.class)
    @JoinColumn(name = "keyword_id")
    private Keyword keyword;

    @Column(name="identified")
    private boolean identified = false;

    @Column(name="submitted")
    private boolean submitted = false;

}
