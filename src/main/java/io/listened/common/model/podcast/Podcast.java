package io.listened.common.model.podcast;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Clay on 6/21/2015.
 * Podcast attributes standard to the rss namespace
 */
@Data
@Entity
@Table(name = "podcast")
@ToString(exclude = {"podcastGenres", "episodes", "podcastKeywords"})
public class Podcast {

    public static final String STATUS_UNPROCESSED = "U";
    public static final String STATUS_PROCESSING = "P";
    public static final String STATUS_COMPLETED = "C";
    public static final String STATUS_FAILED = "F";
    public static final String STATUS_REQUESTED = "R";
    public static final String STATUS_QUEUED = "Q";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "podcast_id_seq", sequenceName = "podcast_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    Long id;
    @Column(name = "feed_url", unique = true, nullable = false)
    String feedUrl;
    @Column(name = "copyright", columnDefinition = "text")
    String copyright;
    @Column(name = "description", columnDefinition = "text")
    String description;
    @Column(name = "docs", columnDefinition = "text")
    String docs;
    @Column(name = "language")
    String language;
    @Column(name = "link", columnDefinition = "text")
    String link;
    @Column(name = "publish_date")
    Date publishDate;
    @Column(name = "title", columnDefinition = "text")
    String title;

    /**
     * Image Stuff
     */
    @Column(name="image_url", columnDefinition = "text")
    private String imageUrl;

    @Column(name="image_title", columnDefinition = "text")
    private String imageTitle;

    @Column(name="imageLink", columnDefinition = "text")
    private String imageLink;

    /**
     * Begin iTunes Stuff
     **/

    @Column(name = "summary", columnDefinition = "text")
    String summary;
    @Column(name = "subtitle", columnDefinition = "text")
    String subtitle;
    @Column(name = "block")
    Boolean block;
    @Column(name = "explicit")
    Boolean explicit;
    @Column(name="itunes_id")
    Long itunesId;
    @Column(name="author", columnDefinition = "text")
    private String author;


    // listened processing info
    @Column(name = "last_processed")
    Date lastProcessed;

    @Column(name = "status")
    String status = STATUS_UNPROCESSED;

    /** Association **/

    /**
     * @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Genre.class)
     * @JoinTable(name="podcast_genre", joinColumns = {
     * @JoinColumn(name = "PODCAST_ID", nullable = false, updatable = false) },
     * inverseJoinColumns = { @JoinColumn(name = "GENRE_ID",
     * nullable = false, updatable = false) })
     * private List<Genre> genres;
     **/

    @OneToMany(mappedBy = "podcast", fetch = FetchType.LAZY, targetEntity = PodcastGenre.class)
    private List<PodcastGenre> podcastGenres;

    @OneToMany(mappedBy = "podcast", fetch = FetchType.LAZY)
    private List<Episode> episodes;

    @OneToMany(mappedBy = "podcast", fetch = FetchType.LAZY, targetEntity = PodcastKeyword.class, orphanRemoval = true)
    private List<PodcastKeyword> podcastKeywords;

}
