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
@Table(name="author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "author_id_seq", sequenceName = "author_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotBlank
    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "author")
    private List<Podcast> podcasts;

}
