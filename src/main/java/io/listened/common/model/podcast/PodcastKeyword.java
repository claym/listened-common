package io.listened.common.model.podcast;

import io.listened.common.model.User;
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

    @ManyToOne
    @JoinColumn(name="created_by")
    private User createdBy;

    public PodcastKeyword() {
        super();
    }

    public PodcastKeyword(Podcast podcast, Keyword keyword) {
        super();
        this.podcast = podcast;
        this.keyword = keyword;
    }

    public PodcastKeyword(Podcast podcast, Keyword keyword, boolean identified, boolean submitted, User createdBy) {
        super();
        this.podcast = podcast;
        this.keyword = keyword;
        this.identified = identified;
        this.submitted = submitted;
        this.createdBy = createdBy;
    }

}
