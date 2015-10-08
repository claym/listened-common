package io.listened.common.model.podcast;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Clay on 6/30/2015.
 * Podcast  attributes specific to Listened
 */
@Data
@Entity
@Table(name = "PODCAST_META")
public class PodcastMeta {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "podcast_id_seq", sequenceName = "podcast_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    Long id;

    @Column(name = "slug", unique = true)
    private String slug;

    @OneToOne
    @JoinColumn(name = "podcast_id")
    private Podcast podcast;

}
