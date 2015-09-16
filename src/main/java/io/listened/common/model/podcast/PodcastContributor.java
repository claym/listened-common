package io.listened.common.model.podcast;

import io.listened.common.model.Contribution;
import io.listened.common.model.User;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Clay on 9/16/2015.
 */
@Entity
@Data
@Table(name = "podcast_contributor")
public class PodcastContributor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "podcast_contributor_id_seq", sequenceName = "podcast_contributor_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    private Podcast podcast;

    @ManyToOne
    private Contribution contribution;

    @ManyToOne
    private Person person;

    @ManyToOne
    private User user;

    @Column(name="created_date")
    private Date createdDate = new Date();


}
