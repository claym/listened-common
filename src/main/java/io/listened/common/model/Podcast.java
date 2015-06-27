package io.listened.common.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Clay on 6/21/2015.
 */
@Entity
@Table(name="podcast")
public class Podcast {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "podcast_id_seq", sequenceName = "podcast_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    Long id;

    @Column(name = "feed_url", unique = true, nullable = false)
    String feedUrl;

    @Column(name="copyright")
    String copyright;

    @Column(name="description")
    String description;

    @Column(name="docs")
    String docs;

    @Column(name="language")
    String language;

    @Column(name="link")
    String link;

    @Column(name="publish_date")
    Date publishDate;

    @Column(name="title")
    String title;

    /** Begin iTunes Stuff **/

    @Column(name="summary")
    String summary;

    @Column(name="subtitle")
    String subtitle;

    @Column(name="block")
    Boolean block;

    @Column(name="explicit")
    Boolean explicit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFeedUrl() {
        return feedUrl;
    }

    public void setFeedUrl(String feedUrl) {
        this.feedUrl = feedUrl;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDocs() {
        return docs;
    }

    public void setDocs(String docs) {
        this.docs = docs;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Boolean getBlock() {
        return block;
    }

    public void setBlock(Boolean block) {
        this.block = block;
    }

    public Boolean getExplicit() {
        return explicit;
    }

    public void setExplicit(Boolean explicit) {
        this.explicit = explicit;
    }
}
