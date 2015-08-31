package io.listened.common.model.podcast;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Clay on 8/31/2015.
 */
@Data
@Entity
@Table(name = "episode_keyword")
public class EpisodeKeyword {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "episode_keyword_id_seq", sequenceName = "episode_keyword_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "episode_id")
    private Episode episode;

    @ManyToOne
    @JoinColumn(name = "keyword_id")
    private Keyword keyword;

    @Column(name = "identified")
    private boolean identified = false;

    @Column(name = "submitted")
    private boolean submitted = false;

}
