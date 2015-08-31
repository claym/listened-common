package io.listened.common.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.listened.common.model.podcast.Podcast;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Clay on 6/28/2015.
 * To store contents of iTunes Podcast Genres. Should be pulled from https://itunes.apple.com/WebObjects/MZStoreServices.woa/ws/genres?id=26
 */
@Data
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
    @JoinColumn(name = "parent_id")
    private Genre parent;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "genres")
    private List<Podcast> podcasts;

    @Column(name = "videoPodcastEpisodesChart")
    private String videoPodcastEpisodesChart;

    @Column(name = "podcastsChart")
    private String podcastsChart;

    @Column(name = "audioPodcastEpisodesChart")
    private String audioPodcastEpisodesChart;

    @Column(name = "audioPodcastsChart")
    private String audioPodcastsChart;

    @Column(name = "podcastEpisodesChart")
    private String podcastEpisodesChart;

    @Column(name = "videoPodcastsChart")
    private String videoPodcasts;

    @Column(name = "topVideoPodcastEpisodesRss")
    private String topVideoPodcastEpisodesRss;

    @Column(name = "topAudioPodcastsRss")
    private String topAudioPodcastsRss;

    @Column(name = "topVideoPodcastsRss")
    private String topVideoPodcastsRss;

    @Column(name = "topPodcastsRss")
    private String topPodcastsRss;

    @Column(name = "topAudioPodcastEpisodesRss")
    private String topAudioPodcastEpisodesRss;

    @Column(name = "topPodcastEpisodesRss")
    private String topPodcastEpisodesRss;

}
