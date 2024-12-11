package org.gitlab4j.api.models;

import java.io.Serializable;
import java.util.Date;

import org.gitlab4j.models.Constants;
import org.gitlab4j.models.Constants.ProjectOrderBy;
import org.gitlab4j.models.Constants.SortOrder;
import org.gitlab4j.models.GitLabForm;
import org.gitlab4j.models.utils.JacksonJson;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *  This class is used to filter Projects when getting lists of projects for a specified user.
 */
public class ProjectFilter implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("archived")
    private Boolean archived;

    @JsonProperty("visibility")
    private Visibility visibility;

    @JsonProperty("order_by")
    private ProjectOrderBy orderBy;

    @JsonProperty("sort")
    private SortOrder sort;

    @JsonProperty("search")
    private String search;

    @JsonProperty("search_namespaces")
    private Boolean searchNamespaces;

    @JsonProperty("simple")
    private Boolean simple;

    @JsonProperty("owned")
    private Boolean owned;

    @JsonProperty("membership")
    private Boolean membership;

    @JsonProperty("starred")
    private Boolean starred;

    @JsonProperty("statistics")
    private Boolean statistics;

    @JsonProperty("with_custom_attributes")
    private Boolean withCustomAttributes;

    @JsonProperty("with_issues_enabled")
    private Boolean withIssuesEnabled;

    @JsonProperty("with_merge_requests_enabled")
    private Boolean withMergeRequestsEnabled;

    @JsonProperty("with_programming_language")
    private String withProgrammingLanguage;

    @JsonProperty("wiki_checksum_failed")
    private Boolean wikiChecksumFailed;

    @JsonProperty("repository_checksum_failed")
    private Boolean repositoryChecksumFailed;

    @JsonProperty("min_access_level")
    private AccessLevel minAccessLevel;

    @JsonProperty("id_after")
    private Long idAfter;

    @JsonProperty("id_before")
    private Long idBefore;

    @JsonProperty("last_activity_after")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private Date lastActivityAfter;

    @JsonProperty("last_activity_before")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private Date lastActivityBefore;

    @JsonProperty("repository_storage")
    private String repositoryStorage;

    @JsonProperty("imported")
    private Boolean imported;

    @JsonProperty("topic")
    private String topic;

    @JsonProperty("topic_id")
    private Integer topic_id;

    /**
     * Limit by archived status.
     *
     * @param archived if true will only return archived projects
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withArchived(Boolean archived) {
        this.archived = archived;
        return (this);
    }

    /**
     * Limit by visibility public, internal, or private.
     *
     * @param visibility the visibility to match
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withVisibility(Visibility visibility) {
        this.visibility = visibility;
        return (this);
    }

    /**
     * Return projects ordered by id, name, path, created_at, updated_at, or last_activity_at fields. Default is created_at.
     *
     * @param orderBy specifies what field to order by
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withOrderBy(ProjectOrderBy orderBy) {
        this.orderBy = orderBy;
        return (this);
    }

    /**
     * Return projects sorted in asc or desc order. Default is desc.
     *
     * @param sort sort direction, ASC or DESC
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withSortOder(SortOrder sort) {
        this.sort = sort;
        return (this);
    }

    /**
     * Return list of projects matching the search criteria.
     *
     * @param search the search criteria
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withSearch(String search) {
        this.search = search;
        return (this);
    }

    /**
     * Include ancestor namespaces when matching search criteria. Default is false.
     *
     * @param searchNamespaces if true, include ancestor namespaces when matching search criteria
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withSearchNamespaces(Boolean searchNamespaces) {
        this.searchNamespaces = searchNamespaces;
        return (this);
    }

    /**
     * Return only limited fields for each project. This is a no-op without
     * authentication as then only simple fields are returned.
     *
     * @param simple if true, return only limited fields for each project
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withSimple(Boolean simple) {
        this.simple = simple;
        return (this);
    }

    /**
     * Limit by projects explicitly owned by the current user
     *
     * @param owned if true, limit to projects explicitly owned by the current user
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withOwned(Boolean owned) {
        this.owned = owned;
        return (this);
    }

    /**
     * Limit by projects that the current user is a member of
     *
     * @param membership if true, limit by projects that the current user is a member of
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withMembership(Boolean membership) {
        this.membership = membership;
        return (this);
    }

    /**
     * Limit by projects starred by the current user.
     *
     * @param starred if true, limit by projects starred by the current user
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withStarred(Boolean starred) {
        this.starred = starred;
        return (this);
    }

    /**
     * Include project statistics.
     *
     * @param statistics if true, include project statistics
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withStatistics(Boolean statistics) {
        this.statistics = statistics;
        return (this);
    }

    /**
     *  Include custom attributes in response (admins only).
     *
     * @param withCustomAttributes if true, include custom attributes in the repsonse
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withCustomAttributes(Boolean withCustomAttributes) {
        this.withCustomAttributes = withCustomAttributes;
        return (this);
    }

    /**
     * Limit by enabled issues feature
     *
     * @param withIssuesEnabled if true, limit by enabled issues feature
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withIssuesEnabled(Boolean withIssuesEnabled) {
        this.withIssuesEnabled = withIssuesEnabled;
        return (this);
    }

    /**
     * Limit by enabled merge requests feature
     *
     * @param withMergeRequestsEnabled if true, limit by enabled merge requests feature
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withMergeRequestsEnabled(Boolean withMergeRequestsEnabled) {
        this.withMergeRequestsEnabled = withMergeRequestsEnabled;
        return (this);
    }

    /**
     * Limit by projects which use the given programming language.
     *
     * @param withProgrammingLanguage limit by projects which use the given programming language
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withProgrammingLanguage(String withProgrammingLanguage) {
        this.withProgrammingLanguage = withProgrammingLanguage;
        return (this);
    }

    /**
     * Limit projects where the wiki checksum calculation has failed.
     *
     * @since GitLab 11.2
     * @param wikiChecksumFailed if true, limit projects where the wiki checksum calculation has failed
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withWikiChecksumFailed(Boolean wikiChecksumFailed) {
        this.wikiChecksumFailed = wikiChecksumFailed;
        return (this);
    }

    /**
     * Limit projects where the repository checksum calculation has failed.
     *
     * @since GitLab 11.2
     * @param repositoryChecksumFailed if true, limit projects where the repository checksum calculation has failed
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withRepositoryChecksumFailed(Boolean repositoryChecksumFailed) {
        this.repositoryChecksumFailed = repositoryChecksumFailed;
        return (this);
    }

    /**
     * Limit by current user minimal access level.
     *
     * @param minAccessLevel limit by current user minimal access level
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withMinAccessLevel(AccessLevel minAccessLevel) {
        this.minAccessLevel = minAccessLevel;
        return (this);
    }

    /**
     * Limit results to projects with IDs greater than the specified projectID.
     *
     * @param idAfter limit results to projects with IDs greater than the specified project ID
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withIdAfter(Long idAfter) {
        this.idAfter = idAfter;
        return (this);
    }

    /**
     * Limit results to projects with IDs less than the specified project ID.
     *
     * @param idBefore limit results to projects with IDs less than the specified project ID
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withIdBefore(Long idBefore) {
        this.idBefore = idBefore;
        return (this);
    }

    /**
     * Limit results to projects with last_activity after specified time.
     *
     * @param lastActivityAfter limit results to projects with last_activity after specified time
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withLastActivityAfter(Date lastActivityAfter) {
        this.lastActivityAfter = lastActivityAfter;
        return (this);
    }

    /**
     * Limit results to projects with last_activity before specified time.
     *
     * @param lastActivityBefore limit results to projects with last_activity before specified time
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withLastActivityBefore(Date lastActivityBefore) {
        this.lastActivityBefore = lastActivityBefore;
        return (this);
    }

    /**
     * Limit results to projects stored on the specified repository_storage. Available for admins only.
     *
     * @param repositoryStorage limit results to projects stored on repository_storage
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withRepositoryStorage(String repositoryStorage) {
        this.repositoryStorage = repositoryStorage;
        return (this);
    }

    /**
     * Limit results to projects which were imported from external systems by current user.
     *
     * @param imported limit results to projects imported from external systems by current user
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withImported(Boolean imported) {
        this.imported = imported;
        return (this);
    }

    /**
     *  Limit results to projects that match all of given topics.
     *
     * @param topic Comma-separated topic names.
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withTopic(String topic) {
        this.topic = topic;
        return (this);
    }

    /**
     *  Limit results to projects with the assigned topic given by the topic ID.
     *
     * @param topic_id the topic ID
     * @return the reference to this ProjectFilter instance
     */
    public ProjectFilter withTopicId(Integer topic_id) {
        this.topic_id = topic_id;
        return (this);
    }

    /**
     * Get the query params specified by this filter.
     *
     * @param page specifies the page number
     * @param perPage specifies the number of items per page
     * @return a GitLabApiForm instance holding the query parameters for this ProjectFilter instance
     */
    public GitLabForm getQueryParams(int page, int perPage) {
        return (getQueryParams().withParam(Constants.PAGE_PARAM, page).withParam(Constants.PER_PAGE_PARAM, perPage));
    }

    /**
     * Get the query params specified by this filter.
     *
     * @return a GitLabApiForm instance holding the query parameters for this ProjectFilter instance
     */
    public GitLabForm getQueryParams() {
        return (new GitLabForm()
                .withParam("archived", archived)
                .withParam("visibility", visibility)
                .withParam("order_by", orderBy)
                .withParam("sort", sort)
                .withParam("search", search)
                .withParam("search_namespaces", searchNamespaces)
                .withParam("simple", simple)
                .withParam("owned", owned)
                .withParam("membership", membership)
                .withParam("starred", starred)
                .withParam("statistics", statistics)
                .withParam("with_custom_attributes", withCustomAttributes)
                .withParam("with_issues_enabled", withIssuesEnabled)
                .withParam("with_merge_requests_enabled", withMergeRequestsEnabled)
                .withParam("with_programming_language", withProgrammingLanguage)
                .withParam("wiki_checksum_failed", wikiChecksumFailed)
                .withParam("repository_checksum_failed", repositoryChecksumFailed)
                .withParam("min_access_level", (minAccessLevel != null ? minAccessLevel.toValue() : null))
                .withParam("id_after", idAfter)
                .withParam("id_before", idBefore)
                .withParam("last_activity_after", lastActivityAfter)
                .withParam("last_activity_before", lastActivityBefore)
                .withParam("repository_storage", repositoryStorage)
                .withParam("imported", imported)
                .withParam("topic", topic)
                .withParam("topic_id", topic_id));
    }

    @Override
    public String toString() {
        return (JacksonJson.toJsonString(this));
    }
}