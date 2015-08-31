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

    @Column(name = "videoPodcastEpisodes")
    private String videoPodcastEpisodes;

    @Column(name = "podcastsChart")
    private String podcastsChart;

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

}
