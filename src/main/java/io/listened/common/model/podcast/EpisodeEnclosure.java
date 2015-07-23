package io.listened.common.model.podcast;

import javax.persistence.*;

/**
 * Created by Clay on 6/29/2015.
 * Contains enclosure information for podcast episode entries
 */
@Entity
@Table(name = "episode_enclosure")
public class EpisodeEnclosure {

    @Id
    @GeneratedValue
    @Column(name="episode_id")
    private Long id;

    @OneToOne
    @PrimaryKeyJoinColumn(name="episode_id")
    private Episode episode;

    @Column(name="url")
    private String url;

    @Column(name="type")
    private String type;

    @Column(name="length")
    private Long length;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Episode getEpisode() {
        return episode;
    }

    public void setEpisode(Episode episode) {
        this.episode = episode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "EpisodeEnclosure{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", type='" + type + '\'' +
                ", length=" + length +
                '}';
    }
}
