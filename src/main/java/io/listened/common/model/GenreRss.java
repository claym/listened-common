package io.listened.common.model;

import javax.persistence.*;

/**
 * Created by Clay on 6/28/2015.
 * Holds to Genre values for rssUrls from https://itunes.apple.com/WebObjects/MZStoreServices.woa/ws/genres?id=26*
 */
@Entity
@Table(name = "genre_rss")
public class GenreRss {

    @Id
    @Column(name = "genre_id")
    @GeneratedValue
    private Long id;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "genre_id")
    private Genre genre;

    @Column(name = "topVideoPodcastEpisodes")
    private String topVideoPodcastEpisodes;

    @Column(name = "topAudioPodcasts")
    private String topAudioPodcasts;

    @Column(name = "topVideoPodcasts")
    private String topVideoPodcasts;

    @Column(name = "topPodcasts")
    private String topPodcasts;

    @Column(name = "topAudioPodcastEpisodes")
    private String topAudioPodcastEpisodes;

    @Column(name = "topPodcastEpisodes")
    private String topPodcastEpisodes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getTopVideoPodcastEpisodes() {
        return topVideoPodcastEpisodes;
    }

    public void setTopVideoPodcastEpisodes(String topVideoPodcastEpisodes) {
        this.topVideoPodcastEpisodes = topVideoPodcastEpisodes;
    }

    public String getTopAudioPodcasts() {
        return topAudioPodcasts;
    }

    public void setTopAudioPodcasts(String topAudioPodcasts) {
        this.topAudioPodcasts = topAudioPodcasts;
    }

    public String getTopVideoPodcasts() {
        return topVideoPodcasts;
    }

    public void setTopVideoPodcasts(String topVideoPodcasts) {
        this.topVideoPodcasts = topVideoPodcasts;
    }

    public String getTopPodcasts() {
        return topPodcasts;
    }

    public void setTopPodcasts(String topPodcasts) {
        this.topPodcasts = topPodcasts;
    }

    public String getTopAudioPodcastEpisodes() {
        return topAudioPodcastEpisodes;
    }

    public void setTopAudioPodcastEpisodes(String topAudioPodcastEpisodes) {
        this.topAudioPodcastEpisodes = topAudioPodcastEpisodes;
    }

    public String getTopPodcastEpisodes() {
        return topPodcastEpisodes;
    }

    public void setTopPodcastEpisodes(String topPodcastEpisodes) {
        this.topPodcastEpisodes = topPodcastEpisodes;
    }

    @Override
    public String toString() {
        return "GenreRss{" +
                "id=" + id +
                ", genre=" + genre +
                ", topVideoPodcastEpisodes='" + topVideoPodcastEpisodes + '\'' +
                ", topAudioPodcasts='" + topAudioPodcasts + '\'' +
                ", topVideoPodcasts='" + topVideoPodcasts + '\'' +
                ", topPodcasts='" + topPodcasts + '\'' +
                ", topAudioPodcastEpisodes='" + topAudioPodcastEpisodes + '\'' +
                ", topPodcastEpisodes='" + topPodcastEpisodes + '\'' +
                '}';
    }
}
