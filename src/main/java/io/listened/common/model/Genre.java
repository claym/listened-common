package io.listened.common.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Clay on 6/28/2015.
 * To store contents of iTunes Podcast Genres. Should be pulled from https://itunes.apple.com/WebObjects/MZStoreServices.woa/ws/genres?id=26
 */
@Entity
@Table(name = "genre")
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "genre_id_seq", sequenceName = "genre_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "url", nullable = false)
    private String url;

    @Column(name="itunes_id", nullable = false)
    private Long iTunesId;

    @OneToMany
    @OrderColumn(name = "id")
    @JoinColumn(name = "parentId")
    private List<Genre> subGenres;

    @ManyToOne
    @JoinColumn(name = "parentId")
    private Genre parent;

    @OneToOne(mappedBy = "genre", fetch = FetchType.EAGER)
    private GenreCharts genreCharts;

    @OneToOne(mappedBy = "genre", fetch = FetchType.EAGER)
    private GenreRss genreRss;

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

    public GenreCharts getGenreCharts() {
        return genreCharts;
    }

    public void setGenreCharts(GenreCharts genreCharts) {
        this.genreCharts = genreCharts;
    }

    public GenreRss getGenreRss() {
        return genreRss;
    }

    public void setGenreRss(GenreRss genreRss) {
        this.genreRss = genreRss;
    }

    public Long getiTunesId() {
        return iTunesId;
    }

    public void setiTunesId(Long iTunesId) {
        this.iTunesId = iTunesId;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", iTunesId=" + iTunesId +
                ", \n\tsubGenres=" + subGenres +
                ", parent=" + parent +
                ", \n\tgenreCharts=" + genreCharts +
                ", \n\tgenreRss=" + genreRss +
                '}';
    }
}
