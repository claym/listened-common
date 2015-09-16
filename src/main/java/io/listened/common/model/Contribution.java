package io.listened.common.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Clay on 9/12/2015.
 */
@Data
@Entity
@Table(name = "contribution")
public class Contribution {

    @Id
    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name="seq", unique = true)
    private Integer sequence;

}
