package io.listened.common.model;

import javax.persistence.*;

/**
 * Created by Clay on 6/28/2015.
 * Holds to Genre values for chartUrls from https://itunes.apple.com/WebObjects/MZStoreServices.woa/ws/genres?id=26
 */
@Entity
@Table(name = "genre_charts")
public class GenreCharts {

    @Id
    @Column(name = "genre_id")
    @GeneratedValue
    private Long id;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "genre_id")
    private Genre genre;

    @Column(name = "videoPodcastEpisodes")
    private String videoPodcastEpisodes;

    @Column(name = "podcasts")
    private String podcasts;

    @Column(name = "audioPodcastEpisodes")
    private String audioPodcastEpisodes;

    @Column(name = "audioPodcasts")
    private String audioPodcasts;

    @Column(name = "podcastEpisodes")
    private String podcastEpisodes;

    @Column(name = "videoPodcasts")
    private String videoPodcasts;

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

    public String getVideoPodcastEpisodes() {
        return videoPodcastEpisodes;
    }

    public void setVideoPodcastEpisodes(String videoPodcastEpisodes) {
        this.videoPodcastEpisodes = videoPodcastEpisodes;
    }

    public String getPodcasts() {
        return podcasts;
    }

    public void setPodcasts(String podcasts) {
        this.podcasts = podcasts;
    }

    public String getAudioPodcastEpisodes() {
        return audioPodcastEpisodes;
    }

    public void setAudioPodcastEpisodes(String audioPodcastEpisodes) {
        this.audioPodcastEpisodes = audioPodcastEpisodes;
    }

    public String getAudioPodcasts() {
        return audioPodcasts;
    }

    public void setAudioPodcasts(String audioPodcasts) {
        this.audioPodcasts = audioPodcasts;
    }

    public String getPodcastEpisodes() {
        return podcastEpisodes;
    }

    public void setPodcastEpisodes(String podcastEpisodes) {
        this.podcastEpisodes = podcastEpisodes;
    }

    public String getVideoPodcasts() {
        return videoPodcasts;
    }

    public void setVideoPodcasts(String videoPodcasts) {
        this.videoPodcasts = videoPodcasts;
    }
}
