package io.listened.common.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Clay on 6/28/2015.
 * To store contents of iTunes Podcast Genres. Should be pulled from https://itunes.apple.com/WebObjects/MZStoreServices.woa/ws/genres?id=26
 */
@Entity
@Table(name = "genre")
public class Genre implements Serializable {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Column(name = "url", nullable = false)
    private String url;

    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
    private List<Genre> subGenres;

    @ManyToOne
    @JoinColumn(name = "parentId")
    private Genre parent;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Genre> getSubGenres() {
        return subGenres;
    }

    public void setSubGenres(List<Genre> subGenres) {
        this.subGenres = subGenres;
    }

    public Genre getParent() {
        return parent;
    }

    public void setParent(Genre parent) {
        this.parent = parent;
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
        return "Genre{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
