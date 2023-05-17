package com.example.servicoRestFull.entidades;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Repositorio {
    @JsonProperty("id")
    private String id;

    @JsonProperty("assignable_users")
    private int assignable_users;

    @JsonProperty("code_of_conduct")
    private String code_of_conduct;

    @JsonProperty("created_at")
    private LocalDateTime created_at;

    @JsonProperty("database_id")
    private int database_id;

    @JsonProperty("default_branch")
    private String default_branch;

    @JsonProperty("delete_branch_on_merge")
    private boolean delete_branch_on_merge;

    @JsonProperty("description")
    private String description;

    @JsonProperty("disk_usage")
    private int disk_usage;

    @JsonProperty("forks")
    private int forks;

    @JsonProperty("has_issues_enabled")
    private boolean has_issues_enabled;

    @JsonProperty("has_projects_enabled")
    private boolean has_projects_enabled;

    @JsonProperty("has_wiki_enabled")
    private boolean has_wiki_enabled;

    @JsonProperty("homepage_url")
    private String homepage_url;

    @JsonProperty("is_archived")
    private boolean is_archived;

    @JsonProperty("is_blank_issues_enabled")
    private boolean is_blank_issues_enabled;

    @JsonProperty("is_disabled")
    private boolean is_disabled;

    @JsonProperty("is_empty")
    private boolean is_empty;

    @JsonProperty("is_fork")
    private boolean is_fork;

    @JsonProperty("is_in_organization")
    private boolean is_in_organization;

    @JsonProperty("is_locked")
    private boolean is_locked;

    @JsonProperty("is_mirror")
    private boolean is_mirror;

    @JsonProperty("is_private")
    private boolean is_private;

    @JsonProperty("is_security_policy_enabled")
    private boolean is_security_policy_enabled;

    @JsonProperty("is_template")
    private boolean is_template;

    @JsonProperty("is_user_configuration_repository")
    private boolean is_user_configuration_repository;

    @JsonProperty("issues")
    private int issues;

    @JsonProperty("labels")
    private int labels;

    @JsonProperty("languages")
    private String languages;

    @JsonProperty("license_info")
    private String license_info;

    @JsonProperty("mentionable_users")
    private int mentionable_users;

    @JsonProperty("merge_commit_allowed")
    private boolean merge_commit_allowed;

    @JsonProperty("milestones")
    private int milestones;

    @JsonProperty("name")
    private String name;

    @JsonProperty("name_with_owner")
    private String name_with_owner;

    @JsonProperty("open_graph_image_url")
    private String open_graph_image_url;

    @JsonProperty("owner")
    private Ator owner;

    @JsonProperty("primary_language")
    private String primary_language;

    @JsonProperty("pushed_at")
    private LocalDateTime pushed_at;

    @JsonProperty("pull_requests")
    private int pull_requests;

    @JsonProperty("rebase_merge_allowed")
    private boolean rebase_merge_allowed;

    @JsonProperty("releases")
    private int releases;

    @JsonProperty("repository_topics")
    private String repository_topics;

    @JsonProperty("squash_merge_allowed")
    private boolean squash_merge_allowed;

    @JsonProperty("stargazers")
    private int stargazers;

    @JsonProperty("tags")
    private int tags;

    @JsonProperty("updated_at")
    private LocalDateTime updated_at;

    @JsonProperty("url")
    private String url;

    @JsonProperty("uses_custom_open_graph_image")
    private boolean uses_custom_open_graph_image;

    @JsonProperty("vulnerability_alerts")
    private int vulnerability_alerts;

    @JsonProperty("watchers")
    private int watchers;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAssignable_users() {
        return assignable_users;
    }

    public void setAssignable_users(int assignable_users) {
        this.assignable_users = assignable_users;
    }

    public String getCode_of_conduct() {
        return code_of_conduct;
    }

    public void setCode_of_conduct(String code_of_conduct) {
        this.code_of_conduct = code_of_conduct;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public int getDatabase_id() {
        return database_id;
    }

    public void setDatabase_id(int database_id) {
        this.database_id = database_id;
    }

    public String getDefault_branch() {
        return default_branch;
    }

    public void setDefault_branch(String default_branch) {
        this.default_branch = default_branch;
    }

    public boolean isDelete_branch_on_merge() {
        return delete_branch_on_merge;
    }

    public void setDelete_branch_on_merge(boolean delete_branch_on_merge) {
        this.delete_branch_on_merge = delete_branch_on_merge;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDisk_usage() {
        return disk_usage;
    }

    public void setDisk_usage(int disk_usage) {
        this.disk_usage = disk_usage;
    }

    public int getForks() {
        return forks;
    }

    public void setForks(int forks) {
        this.forks = forks;
    }

    public boolean isHas_issues_enabled() {
        return has_issues_enabled;
    }

    public void setHas_issues_enabled(boolean has_issues_enabled) {
        this.has_issues_enabled = has_issues_enabled;
    }

    public boolean isHas_projects_enabled() {
        return has_projects_enabled;
    }

    public void setHas_projects_enabled(boolean has_projects_enabled) {
        this.has_projects_enabled = has_projects_enabled;
    }

    public boolean isHas_wiki_enabled() {
        return has_wiki_enabled;
    }

    public void setHas_wiki_enabled(boolean has_wiki_enabled) {
        this.has_wiki_enabled = has_wiki_enabled;
    }

    public String getHomepage_url() {
        return homepage_url;
    }

    public void setHomepage_url(String homepage_url) {
        this.homepage_url = homepage_url;
    }

    public boolean isIs_archived() {
        return is_archived;
    }

    public void setIs_archived(boolean is_archived) {
        this.is_archived = is_archived;
    }

    public boolean isIs_blank_issues_enabled() {
        return is_blank_issues_enabled;
    }

    public void setIs_blank_issues_enabled(boolean is_blank_issues_enabled) {
        this.is_blank_issues_enabled = is_blank_issues_enabled;
    }

    public boolean isIs_disabled() {
        return is_disabled;
    }

    public void setIs_disabled(boolean is_disabled) {
        this.is_disabled = is_disabled;
    }

    public boolean isIs_empty() {
        return is_empty;
    }

    public void setIs_empty(boolean is_empty) {
        this.is_empty = is_empty;
    }

    public boolean isIs_fork() {
        return is_fork;
    }

    public void setIs_fork(boolean is_fork) {
        this.is_fork = is_fork;
    }

    public boolean isIs_in_organization() {
        return is_in_organization;
    }

    public void setIs_in_organization(boolean is_in_organization) {
        this.is_in_organization = is_in_organization;
    }

    public boolean isIs_locked() {
        return is_locked;
    }

    public void setIs_locked(boolean is_locked) {
        this.is_locked = is_locked;
    }

    public boolean isIs_mirror() {
        return is_mirror;
    }

    public void setIs_mirror(boolean is_mirror) {
        this.is_mirror = is_mirror;
    }

    public boolean isIs_private() {
        return is_private;
    }

    public void setIs_private(boolean is_private) {
        this.is_private = is_private;
    }

    public boolean isIs_security_policy_enabled() {
        return is_security_policy_enabled;
    }

    public void setIs_security_policy_enabled(boolean is_security_policy_enabled) {
        this.is_security_policy_enabled = is_security_policy_enabled;
    }

    public boolean isIs_template() {
        return is_template;
    }

    public void setIs_template(boolean is_template) {
        this.is_template = is_template;
    }

    public boolean isIs_user_configuration_repository() {
        return is_user_configuration_repository;
    }

    public void setIs_user_configuration_repository(boolean is_user_configuration_repository) {
        this.is_user_configuration_repository = is_user_configuration_repository;
    }

    public int getIssues() {
        return issues;
    }

    public void setIssues(int issues) {
        this.issues = issues;
    }

    public int getLabels() {
        return labels;
    }

    public void setLabels(int labels) {
        this.labels = labels;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getLicense_info() {
        return license_info;
    }

    public void setLicense_info(String license_info) {
        this.license_info = license_info;
    }

    public int getMentionable_users() {
        return mentionable_users;
    }

    public void setMentionable_users(int mentionable_users) {
        this.mentionable_users = mentionable_users;
    }

    public boolean isMerge_commit_allowed() {
        return merge_commit_allowed;
    }

    public void setMerge_commit_allowed(boolean merge_commit_allowed) {
        this.merge_commit_allowed = merge_commit_allowed;
    }

    public int getMilestones() {
        return milestones;
    }

    public void setMilestones(int milestones) {
        this.milestones = milestones;
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

    public Ator getOwner() {
        return owner;
    }

    public void setOwner(Ator owner) {
        this.owner = owner;
    }

    public String getPrimary_language() {
        return primary_language;
    }

    public void setPrimary_language(String primary_language) {
        this.primary_language = primary_language;
    }

    public LocalDateTime getPushed_at() {
        return pushed_at;
    }

    public void setPushed_at(LocalDateTime pushed_at) {
        this.pushed_at = pushed_at;
    }

    public int getPull_requests() {
        return pull_requests;
    }

    public void setPull_requests(int pull_requests) {
        this.pull_requests = pull_requests;
    }

    public boolean isRebase_merge_allowed() {
        return rebase_merge_allowed;
    }

    public void setRebase_merge_allowed(boolean rebase_merge_allowed) {
        this.rebase_merge_allowed = rebase_merge_allowed;
    }

    public int getReleases() {
        return releases;
    }

    public void setReleases(int releases) {
        this.releases = releases;
    }

    public String getRepository_topics() {
        return repository_topics;
    }

    public void setRepository_topics(String repository_topics) {
        this.repository_topics = repository_topics;
    }

    public boolean isSquash_merge_allowed() {
        return squash_merge_allowed;
    }

    public void setSquash_merge_allowed(boolean squash_merge_allowed) {
        this.squash_merge_allowed = squash_merge_allowed;
    }

    public int getStargazers() {
        return stargazers;
    }

    public void setStargazers(int stargazers) {
        this.stargazers = stargazers;
    }

    public int getTags() {
        return tags;
    }

    public void setTags(int tags) {
        this.tags = tags;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isUses_custom_open_graph_image() {
        return uses_custom_open_graph_image;
    }

    public void setUses_custom_open_graph_image(boolean uses_custom_open_graph_image) {
        this.uses_custom_open_graph_image = uses_custom_open_graph_image;
    }

    public int getVulnerability_alerts() {
        return vulnerability_alerts;
    }

    public void setVulnerability_alerts(int vulnerability_alerts) {
        this.vulnerability_alerts = vulnerability_alerts;
    }

    public int getWatchers() {
        return watchers;
    }

    public void setWatchers(int watchers) {
        this.watchers = watchers;
    }

}
