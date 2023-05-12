package com.example.servicoRestFull.entidades;

import java.sql.Date;
import java.util.ArrayList;

public class Repositorio {
    private String id;
    private String code_of_conduct;
    private Date created_at;
    private String default_branch;
    private String description;
    private Number forks;
    private String homepage_url;
    private Boolean is_archived;
    private Number issues;
    private String license_info;
    private String mirror_url;
    private String name;
    private String name_with_owner;
    private String open_graph_image_url;
    private Actor owner;
    private String primary_language;
    private Date pushed_at;
    private Number pull_requests;
    private Number releases;
    private ArrayList<String> repository_topics;
    private Number stargazers;
    private Number tags;
    private Date updated_at;
    private String url;
    private Number vulnerability_alerts;
    private Number watchers;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCode_of_conduct() {
        return code_of_conduct;
    }
    public void setCode_of_conduct(String code_of_conduct) {
        this.code_of_conduct = code_of_conduct;
    }
    public Date getCreated_at() {
        return created_at;
    }
    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
    public String getDefault_branch() {
        return default_branch;
    }
    public void setDefault_branch(String default_branch) {
        this.default_branch = default_branch;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Number getForks() {
        return forks;
    }
    public void setForks(Number forks) {
        this.forks = forks;
    }
    public String getHomepage_url() {
        return homepage_url;
    }
    public void setHomepage_url(String homepage_url) {
        this.homepage_url = homepage_url;
    }
    public Boolean getIs_archived() {
        return is_archived;
    }
    public void setIs_archived(Boolean is_archived) {
        this.is_archived = is_archived;
    }
    public Number getIssues() {
        return issues;
    }
    public void setIssues(Number issues) {
        this.issues = issues;
    }
    public String getLicense_info() {
        return license_info;
    }
    public void setLicense_info(String license_info) {
        this.license_info = license_info;
    }
    public String getMirror_url() {
        return mirror_url;
    }
    public void setMirror_url(String mirror_url) {
        this.mirror_url = mirror_url;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName_with_owner() {
        return name_with_owner;
    }
    public void setName_with_owner(String name_with_owner) {
        this.name_with_owner = name_with_owner;
    }
    public String getOpen_graph_image_url() {
        return open_graph_image_url;
    }
    public void setOpen_graph_image_url(String open_graph_image_url) {
        this.open_graph_image_url = open_graph_image_url;
    }
    public Actor getOwner() {
        return owner;
    }
    public void setOwner(Actor owner) {
        this.owner = owner;
    }
    public String getPrimary_language() {
        return primary_language;
    }
    public void setPrimary_language(String primary_language) {
        this.primary_language = primary_language;
    }
    public Date getPushed_at() {
        return pushed_at;
    }
    public void setPushed_at(Date pushed_at) {
        this.pushed_at = pushed_at;
    }
    public Number getPull_requests() {
        return pull_requests;
    }
    public void setPull_requests(Number pull_requests) {
        this.pull_requests = pull_requests;
    }
    public Number getReleases() {
        return releases;
    }
    public void setReleases(Number releases) {
        this.releases = releases;
    }
    public ArrayList<String> getRepository_topics() {
        return repository_topics;
    }
    public void setRepository_topics(ArrayList<String> repository_topics) {
        this.repository_topics = repository_topics;
    }
    public Number getStargazers() {
        return stargazers;
    }
    public void setStargazers(Number stargazers) {
        this.stargazers = stargazers;
    }
    public Number getTags() {
        return tags;
    }
    public void setTags(Number tags) {
        this.tags = tags;
    }
    public Date getUpdated_at() {
        return updated_at;
    }
    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public Number getVulnerability_alerts() {
        return vulnerability_alerts;
    }
    public void setVulnerability_alerts(Number vulnerability_alerts) {
        this.vulnerability_alerts = vulnerability_alerts;
    }
    public Number getWatchers() {
        return watchers;
    }
    public void setWatchers(Number watchers) {
        this.watchers = watchers;
    }

    
}
