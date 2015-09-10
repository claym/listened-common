package io.listened.common.model.podcast;

import io.listened.common.model.Genre;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by Clay on 9/7/2015.
 * Podcast -> Genre mapping with ranking information
 */
@Entity
@Data
@Table(name = "podcast_genre")
public class PodcastGenre {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "podcast_genre_id_seq", sequenceName = "podcast_genre_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(targetEntity = Podcast.class)
    @JoinColumn(name = "podcast_id")
    private Podcast podcast;

    @ManyToOne(targetEntity = Genre.class)
    @JoinColumn(name = "genre_id")
    private Genre genre;

    @Column(name="rank")
    private Long rank;

    public PodcastGenre() {
        super();
    }

    public PodcastGenre(Podcast podcast, Genre genre) {
        this.podcast = podcast;
        this.genre = genre;
    }

    public PodcastGenre(Podcast podcast, Genre genre, Long rank) {
        this.podcast = podcast;
        this.genre = genre;
        this.rank = rank;
    }


}
