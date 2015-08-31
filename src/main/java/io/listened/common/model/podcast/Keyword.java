package io.listened.common.model.podcast;

import io.listened.common.model.User;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Clay on 7/1/2015.
 * Podcast keywords
 */
@Data
@Entity
@Table(name="keyword")
public class Keyword {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "keyword_id_seq", sequenceName = "keyword_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotBlank
    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name="created_by")
    private User createdBy;

    @OneToMany(mappedBy = "keyword")
    private List<EpisodeKeyword> episodeKeywords;

    @OneToMany(mappedBy = "keyword")
    private List<PodcastKeyword> podcastKeywords;

}
