package io.listened.common.model.podcast;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Clay on 8/31/2015.
 */
@Data
@Entity
@Table(name="person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "author_id_seq", sequenceName = "author_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    // synd feed value
    @Column(name="uri")
    private String uri;
/**
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "authors")
    private List<Podcast> podcasts;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "contributors")
    private List<Podcast> podcasts;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "editors")
    private List<Podcast> podcasts;
**/
}
