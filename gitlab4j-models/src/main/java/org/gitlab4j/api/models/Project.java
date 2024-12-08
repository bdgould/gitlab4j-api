package org.gitlab4j.api.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.gitlab4j.api.models.ImportStatus.Status;
import org.gitlab4j.models.Constants.AutoDevopsDeployStrategy;
import org.gitlab4j.models.Constants.BuildGitStrategy;
import org.gitlab4j.models.Constants.SquashOption;
import org.gitlab4j.models.utils.JacksonJson;
import org.gitlab4j.models.utils.JacksonJsonEnumHelper;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Project implements Serializable {
    private static final long serialVersionUID = 1L;

    // Enum for the merge_method of the Project instance.
    public enum MergeMethod {
        MERGE,
        REBASE_MERGE,
        FF;

        private static JacksonJsonEnumHelper<MergeMethod> enumHelper = new JacksonJsonEnumHelper<>(MergeMethod.class);

        @JsonCreator
        public static MergeMethod forValue(String value) {
            return enumHelper.forValue(value);
        }

        @JsonValue
        public String toValue() {
            return (enumHelper.toString(this));
        }

        @Override
        public String toString() {
            return (enumHelper.toString(this));
        }
    }

    @JsonProperty("approvals_before_merge")
    private Integer approvalsBeforeMerge;

    @JsonProperty("archived")
    private Boolean archived;

    @JsonProperty("avatar_url")
    private String avatarUrl;

    @JsonProperty("container_registry_enabled")
    private Boolean containerRegistryEnabled;

    @JsonProperty("created_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private Date createdAt;

    @JsonProperty("creator_id")
    private Long creatorId;

    @JsonProperty("default_branch")
    private String defaultBranch;

    @JsonProperty("description")
    private String description;

    @JsonProperty("forks_count")
    private Integer forksCount;

    @JsonProperty("forked_from_project")
    private Project forkedFromProject;

    @JsonProperty("http_url_to_repo")
    private String httpUrlToRepo;

    @JsonProperty("id")
    private Long id;

    @JsonProperty("public")
    private Boolean isPublic;

    @JsonProperty("issues_enabled")
    private Boolean issuesEnabled;

    @JsonProperty("jobs_enabled")
    private Boolean jobsEnabled;

    @JsonProperty("last_activity_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private Date lastActivityAt;

    @JsonProperty("lfs_enabled")
    private Boolean lfsEnabled;

    @JsonProperty("merge_method")
    private MergeMethod mergeMethod;

    @JsonProperty("merge_requests_enabled")
    private Boolean mergeRequestsEnabled;

    @JsonProperty("name")
    private String name;

    @JsonProperty("namespace")
    private Namespace namespace;

    @JsonProperty("name_with_namespace")
    private String nameWithNamespace;

    @JsonProperty("only_allow_merge_if_pipeline_succeeds")
    private Boolean onlyAllowMergeIfPipelineSucceeds;

    @JsonProperty("allow_merge_on_skipped_pipeline")
    private Boolean allowMergeOnSkippedPipeline;

    @JsonProperty("only_allow_merge_if_all_discussions_are_resolved")
    private Boolean onlyAllowMergeIfAllDiscussionsAreResolved;

    @JsonProperty("open_issues_count")
    private Integer openIssuesCount;

    @JsonProperty("owner")
    private Owner owner;

    @JsonProperty("path")
    private String path;

    @JsonProperty("path_with_namespace")
    private String pathWithNamespace;

    @JsonProperty("permissions")
    private Permissions permissions;

    @JsonProperty("public_jobs")
    private Boolean publicJobs;

    @JsonProperty("repository_storage")
    private String repositoryStorage;

    @JsonProperty("request_access_enabled")
    private Boolean requestAccessEnabled;

    @JsonProperty("runners_token")
    private String runnersToken;

    @JsonProperty("shared_runners_enabled")
    private Boolean sharedRunnersEnabled;

    @JsonProperty("shared_with_groups")
    private List<SharedGroup> sharedWithGroups;

    @JsonProperty("snippets_enabled")
    private Boolean snippetsEnabled;

    @JsonProperty("ssh_url_to_repo")
    private String sshUrlToRepo;

    @JsonProperty("star_count")
    private Integer starCount;

    @JsonProperty("tag_list")
    private List<String> tagList;

    @JsonProperty("topics")
    private List<String> topics;

    @JsonProperty("visibility_level")
    private Integer visibilityLevel;

    @JsonProperty("visibility")
    private Visibility visibility;

    @JsonProperty("wall_enabled")
    private Boolean wallEnabled;

    @JsonProperty("web_url")
    private String webUrl;

    @JsonProperty("wiki_enabled")
    private Boolean wikiEnabled;

    @JsonProperty("printing_merge_request_link_enabled")
    private Boolean printingMergeRequestLinkEnabled;

    @JsonProperty("resolve_outdated_diff_discussions")
    private Boolean resolveOutdatedDiffDiscussions;

    @JsonProperty("statistics")
    private ProjectStatistics statistics;

    @JsonProperty("initialize_with_readme")
    private Boolean initializeWithReadme;

    @JsonProperty("packages_enabled")
    private Boolean packagesEnabled;

    @JsonProperty("empty_repo")
    private Boolean emptyRepo;

    @JsonProperty("license_url")
    private String licenseUrl;

    @JsonProperty("license")
    private ProjectLicense license;

    @JsonProperty("custom_attributes")
    private List<CustomAttribute> customAttributes;

    @JsonProperty("build_coverage_regex")
    private String buildCoverageRegex;

    @JsonProperty("build_git_strategy")
    private BuildGitStrategy buildGitStrategy;

    @JsonProperty("readme_url")
    private String readmeUrl;

    @JsonProperty("can_create_merge_request_in")
    private Boolean canCreateMergeRequestIn;

    @JsonProperty("import_status")
    private Status importStatus;

    @JsonProperty("ci_default_git_depth")
    private Integer ciDefaultGitDepth;

    @JsonProperty("ci_forward_deployment_enabled")
    private Boolean ciForwardDeploymentEnabled;

    @JsonProperty("ci_config_path")
    private String ciConfigPath;

    @JsonProperty("remove_source_branch_after_merge")
    private Boolean removeSourceBranchAfterMerge;

    @JsonProperty("auto_devops_enabled")
    private Boolean autoDevopsEnabled;

    @JsonProperty("auto_devops_deploy_strategy")
    private AutoDevopsDeployStrategy autoDevopsDeployStrategy;

    @JsonProperty("autoclose_referenced_issues")
    private Boolean autocloseReferencedIssues;

    @JsonProperty("emails_disabled")
    private Boolean emailsDisabled;

    @JsonProperty("suggestion_commit_message")
    private String suggestionCommitMessage;

    @JsonProperty("squash_option")
    private SquashOption squashOption;

    @JsonProperty("merge_commit_template")
    private String mergeCommitTemplate;

    @JsonProperty("squash_commit_template")
    private String squashCommitTemplate;

    @JsonProperty("issue_branch_template")
    private String issueBranchTemplate;

    @JsonProperty("merge_requests_template")
    private String mergeRequestsTemplate;

    @JsonProperty("issues_template")
    private String issuesTemplate;

    @JsonProperty("_links")
    private Map<String, String> links;

    @JsonProperty("marked_for_deletion_on")
    @JsonSerialize(using = JacksonJson.DateOnlySerializer.class)
    private Date markedForDeletionOn;

    public Integer getApprovalsBeforeMerge() {
        return approvalsBeforeMerge;
    }

    public void setApprovalsBeforeMerge(Integer approvalsBeforeMerge) {
        this.approvalsBeforeMerge = approvalsBeforeMerge;
    }

    public Project withApprovalsBeforeMerge(Integer approvalsBeforeMerge) {
        this.approvalsBeforeMerge = approvalsBeforeMerge;
        return (this);
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Boolean getContainerRegistryEnabled() {
        return containerRegistryEnabled;
    }

    public void setContainerRegistryEnabled(Boolean containerRegistryEnabled) {
        this.containerRegistryEnabled = containerRegistryEnabled;
    }

    public Project withContainerRegistryEnabled(boolean containerRegistryEnabled) {
        this.containerRegistryEnabled = containerRegistryEnabled;
        return (this);
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public Project withDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return (this);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Project withDescription(String description) {
        this.description = description;
        return (this);
    }

    public Integer getForksCount() {
        return forksCount;
    }

    public void setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
    }

    public Project getForkedFromProject() {
        return forkedFromProject;
    }

    public void setForkedFromProject(Project forkedFromProject) {
        this.forkedFromProject = forkedFromProject;
    }

    public String getHttpUrlToRepo() {
        return httpUrlToRepo;
    }

    public void setHttpUrlToRepo(String httpUrlToRepo) {
        this.httpUrlToRepo = httpUrlToRepo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Project withId(Long id) {
        this.id = id;
        return (this);
    }

    public Boolean getIssuesEnabled() {
        return issuesEnabled;
    }

    public void setIssuesEnabled(Boolean issuesEnabled) {
        this.issuesEnabled = issuesEnabled;
    }

    public Project withIssuesEnabled(boolean issuesEnabled) {
        this.issuesEnabled = issuesEnabled;
        return (this);
    }

    public Boolean getJobsEnabled() {
        return jobsEnabled;
    }

    public void setJobsEnabled(Boolean jobsEnabled) {
        this.jobsEnabled = jobsEnabled;
    }

    public Project withJobsEnabled(boolean jobsEnabled) {
        this.jobsEnabled = jobsEnabled;
        return (this);
    }

    public Date getLastActivityAt() {
        return lastActivityAt;
    }

    public void setLastActivityAt(Date lastActivityAt) {
        this.lastActivityAt = lastActivityAt;
    }

    public Boolean getLfsEnabled() {
        return lfsEnabled;
    }

    public void setLfsEnabled(Boolean lfsEnabled) {
        this.lfsEnabled = lfsEnabled;
    }

    public Project withLfsEnabled(Boolean lfsEnabled) {
        this.lfsEnabled = lfsEnabled;
        return (this);
    }

    public MergeMethod getMergeMethod() {
        return mergeMethod;
    }

    public void setMergeMethod(MergeMethod mergeMethod) {
        this.mergeMethod = mergeMethod;
    }

    public Project withMergeMethod(MergeMethod mergeMethod) {
        this.mergeMethod = mergeMethod;
        return (this);
    }

    public Boolean getMergeRequestsEnabled() {
        return mergeRequestsEnabled;
    }

    public void setMergeRequestsEnabled(Boolean mergeRequestsEnabled) {
        this.mergeRequestsEnabled = mergeRequestsEnabled;
    }

    public Project withMergeRequestsEnabled(boolean mergeRequestsEnabled) {
        this.mergeRequestsEnabled = mergeRequestsEnabled;
        return (this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Project withName(String name) {
        this.name = name;
        return (this);
    }

    public Namespace getNamespace() {
        return namespace;
    }

    public void setNamespace(Namespace namespace) {
        this.namespace = namespace;
    }

    public Project withNamespace(Namespace namespace) {
        this.namespace = namespace;
        return (this);
    }

    public Project withNamespaceId(long namespaceId) {
        this.namespace = new Namespace();
        this.namespace.setId(namespaceId);
        return (this);
    }

    public String getNameWithNamespace() {
        return nameWithNamespace;
    }

    public void setNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
    }

    public Boolean getOnlyAllowMergeIfPipelineSucceeds() {
        return onlyAllowMergeIfPipelineSucceeds;
    }

    public void setOnlyAllowMergeIfPipelineSucceeds(Boolean onlyAllowMergeIfPipelineSucceeds) {
        this.onlyAllowMergeIfPipelineSucceeds = onlyAllowMergeIfPipelineSucceeds;
    }

    public Project withOnlyAllowMergeIfPipelineSucceeds(Boolean onlyAllowMergeIfPipelineSucceeds) {
        this.onlyAllowMergeIfPipelineSucceeds = onlyAllowMergeIfPipelineSucceeds;
        return (this);
    }

    public Boolean getAllowMergeOnSkippedPipeline() {
        return allowMergeOnSkippedPipeline;
    }

    public void setAllowMergeOnSkippedPipeline(Boolean allowMergeOnSkippedPipeline) {
        this.allowMergeOnSkippedPipeline = allowMergeOnSkippedPipeline;
    }

    public Project withAllowMergeOnSkippedPipeline(Boolean allowMergeOnSkippedPipeline) {
        this.allowMergeOnSkippedPipeline = allowMergeOnSkippedPipeline;
        return (this);
    }

    public Boolean getOnlyAllowMergeIfAllDiscussionsAreResolved() {
        return onlyAllowMergeIfAllDiscussionsAreResolved;
    }

    public void setOnlyAllowMergeIfAllDiscussionsAreResolved(Boolean onlyAllowMergeIfAllDiscussionsAreResolved) {
        this.onlyAllowMergeIfAllDiscussionsAreResolved = onlyAllowMergeIfAllDiscussionsAreResolved;
    }

    public Project withOnlyAllowMergeIfAllDiscussionsAreResolved(Boolean onlyAllowMergeIfAllDiscussionsAreResolved) {
        this.onlyAllowMergeIfAllDiscussionsAreResolved = onlyAllowMergeIfAllDiscussionsAreResolved;
        return (this);
    }

    public Integer getOpenIssuesCount() {
        return openIssuesCount;
    }

    public void setOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Project withPath(String path) {
        this.path = path;
        return (this);
    }

    public String getPathWithNamespace() {
        return pathWithNamespace;
    }

    public void setPathWithNamespace(String pathWithNamespace) {
        this.pathWithNamespace = pathWithNamespace;
    }

    public Permissions getPermissions() {
        return permissions;
    }

    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public Project withPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return (this);
    }

    public Boolean getPublicJobs() {
        return publicJobs;
    }

    public void setPublicJobs(Boolean publicJobs) {
        this.publicJobs = publicJobs;
    }

    public Project withPublicJobs(boolean publicJobs) {
        this.publicJobs = publicJobs;
        return (this);
    }

    public String getRepositoryStorage() {
        return repositoryStorage;
    }

    public void setRepositoryStorage(String repositoryStorage) {
        this.repositoryStorage = repositoryStorage;
    }

    public Project withRepositoryStorage(String repositoryStorage) {
        this.repositoryStorage = repositoryStorage;
        return (this);
    }

    public Boolean getRequestAccessEnabled() {
        return requestAccessEnabled;
    }

    public void setRequestAccessEnabled(Boolean request_access_enabled) {
        this.requestAccessEnabled = request_access_enabled;
    }

    public Project withRequestAccessEnabled(boolean requestAccessEnabled) {
        this.requestAccessEnabled = requestAccessEnabled;
        return (this);
    }

    public String getRunnersToken() {
        return runnersToken;
    }

    public void setRunnersToken(String runnersToken) {
        this.runnersToken = runnersToken;
    }

    public Boolean getSharedRunnersEnabled() {
        return sharedRunnersEnabled;
    }

    public void setSharedRunnersEnabled(Boolean sharedRunnersEnabled) {
        this.sharedRunnersEnabled = sharedRunnersEnabled;
    }

    public List<SharedGroup> getSharedWithGroups() {
        return sharedWithGroups;
    }

    public void setSharedWithGroups(List<SharedGroup> sharedWithGroups) {
        this.sharedWithGroups = sharedWithGroups;
    }

    public Project withSharedRunnersEnabled(boolean sharedRunnersEnabled) {
        this.sharedRunnersEnabled = sharedRunnersEnabled;
        return (this);
    }

    public Boolean getSnippetsEnabled() {
        return snippetsEnabled;
    }

    public void setSnippetsEnabled(Boolean snippetsEnabled) {
        this.snippetsEnabled = snippetsEnabled;
    }

    public Project withSnippetsEnabled(boolean snippetsEnabled) {
        this.snippetsEnabled = snippetsEnabled;
        return (this);
    }

    public String getSshUrlToRepo() {
        return sshUrlToRepo;
    }

    public void setSshUrlToRepo(String sshUrlToRepo) {
        this.sshUrlToRepo = sshUrlToRepo;
    }

    public Integer getStarCount() {
        return starCount;
    }

    public void setStarCount(Integer starCount) {
        this.starCount = starCount;
    }

    /**
     * Tags will be removed in API v5
     */
    @Deprecated
    public List<String> getTagList() {
        return tagList;
    }

    /**
     * Tags will be removed in API v5
     */
    @Deprecated
    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }

    /**
     * Tags will be removed in API v5
     */
    @Deprecated
    public Project withTagList(List<String> tagList) {
        this.tagList = tagList;
        return (this);
    }

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public Project withTopics(List<String> topics) {
        this.topics = topics;
        return (this);
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public Project withVisibility(Visibility visibility) {
        this.visibility = visibility;
        return (this);
    }

    public Integer getVisibilityLevel() {
        return visibilityLevel;
    }

    public void setVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
    }

    public Project withVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
        return (this);
    }

    public Boolean getWallEnabled() {
        return wallEnabled;
    }

    public void setWallEnabled(Boolean wallEnabled) {
        this.wallEnabled = wallEnabled;
    }

    public Project withWallEnabled(Boolean wallEnabled) {
        this.wallEnabled = wallEnabled;
        return (this);
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public Project withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return (this);
    }

    public Boolean getWikiEnabled() {
        return wikiEnabled;
    }

    public void setWikiEnabled(Boolean wikiEnabled) {
        this.wikiEnabled = wikiEnabled;
    }

    public Project withWikiEnabled(boolean wikiEnabled) {
        this.wikiEnabled = wikiEnabled;
        return (this);
    }

    public Boolean getPrintingMergeRequestLinkEnabled() {
        return printingMergeRequestLinkEnabled;
    }

    public void setPrintingMergeRequestLinkEnabled(Boolean printingMergeRequestLinkEnabled) {
        this.printingMergeRequestLinkEnabled = printingMergeRequestLinkEnabled;
    }

    public Project withPrintingMergeRequestLinkEnabled(Boolean printingMergeRequestLinkEnabled) {
        this.printingMergeRequestLinkEnabled = printingMergeRequestLinkEnabled;
        return (this);
    }

    public Boolean getResolveOutdatedDiffDiscussions() {
        return resolveOutdatedDiffDiscussions;
    }

    public void setResolveOutdatedDiffDiscussions(Boolean resolveOutdatedDiffDiscussions) {
        this.resolveOutdatedDiffDiscussions = resolveOutdatedDiffDiscussions;
    }

    public Project withResolveOutdatedDiffDiscussions(boolean resolveOutdatedDiffDiscussions) {
        this.resolveOutdatedDiffDiscussions = resolveOutdatedDiffDiscussions;
        return (this);
    }

    public Boolean getInitializeWithReadme() {
        return initializeWithReadme;
    }

    public void setInitializeWithReadme(Boolean initializeWithReadme) {
        this.initializeWithReadme = initializeWithReadme;
    }

    public Project withInitializeWithReadme(boolean initializeWithReadme) {
        this.initializeWithReadme = initializeWithReadme;
        return (this);
    }

    public Boolean getPackagesEnabled() {
        return packagesEnabled;
    }

    public void setPackagesEnabled(Boolean packagesEnabled) {
        this.packagesEnabled = packagesEnabled;
    }

    public Project withPackagesEnabled(Boolean packagesEnabled) {
        this.packagesEnabled = packagesEnabled;
        return (this);
    }

    public ProjectStatistics getStatistics() {
        return statistics;
    }

    public void setStatistics(ProjectStatistics statistics) {
        this.statistics = statistics;
    }

    public Boolean getEmptyRepo() {
        return emptyRepo;
    }

    public void setEmptyRepo(Boolean emptyRepo) {
        this.emptyRepo = emptyRepo;
    }

    public Date getMarkedForDeletionOn() {
        return markedForDeletionOn;
    }

    public void setMarkedForDeletionOn(Date markedForDeletionOn) {
        this.markedForDeletionOn = markedForDeletionOn;
    }

    public String getLicenseUrl() {
        return licenseUrl;
    }

    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }

    public ProjectLicense getLicense() {
        return license;
    }

    public void setLicense(ProjectLicense license) {
        this.license = license;
    }

    public List<CustomAttribute> getCustomAttributes() {
        return customAttributes;
    }

    public void setCustomAttributes(List<CustomAttribute> customAttributes) {
        this.customAttributes = customAttributes;
    }

    public static final boolean isValid(Project project) {
        return (project != null && project.getId() != null);
    }

    @Override
    public String toString() {
        return (JacksonJson.toJsonString(this));
    }

    /**
     * Formats a fully qualified project path based on the provided namespace and project path.
     *
     * @param namespace the namespace, either a user name or group name
     * @param path      the project path
     * @return a fully qualified project path based on the provided namespace and project path
     */
    public static final String getPathWithNammespace(String namespace, String path) {
        return (namespace.trim() + "/" + path.trim());
    }

    public String getBuildCoverageRegex() {
        return buildCoverageRegex;
    }

    public void setBuildCoverageRegex(String buildCoverageRegex) {
        this.buildCoverageRegex = buildCoverageRegex;
    }

    public Project withBuildCoverageRegex(String buildCoverageRegex) {
        this.buildCoverageRegex = buildCoverageRegex;
        return this;
    }

    public BuildGitStrategy getBuildGitStrategy() {
        return buildGitStrategy;
    }

    public void setBuildGitStrategy(BuildGitStrategy buildGitStrategy) {
        this.buildGitStrategy = buildGitStrategy;
    }

    public Project withBuildGitStrategy(BuildGitStrategy buildGitStrategy) {
        this.buildGitStrategy = buildGitStrategy;
        return this;
    }

    public String getReadmeUrl() {
        return readmeUrl;
    }

    public void setReadmeUrl(String readmeUrl) {
        this.readmeUrl = readmeUrl;
    }

    public Boolean getCanCreateMergeRequestIn() {
        return canCreateMergeRequestIn;
    }

    public void setCanCreateMergeRequestIn(Boolean canCreateMergeRequestIn) {
        this.canCreateMergeRequestIn = canCreateMergeRequestIn;
    }

    public Status getImportStatus() {
        return importStatus;
    }

    public void setImportStatus(Status importStatus) {
        this.importStatus = importStatus;
    }

    public Integer getCiDefaultGitDepth() {
        return ciDefaultGitDepth;
    }

    public void setCiDefaultGitDepth(Integer ciDefaultGitDepth) {
        this.ciDefaultGitDepth = ciDefaultGitDepth;
    }

    public Boolean getCiForwardDeploymentEnabled() {
        return ciForwardDeploymentEnabled;
    }

    public void setCiForwardDeploymentEnabled(Boolean ciForwardDeploymentEnabled) {
        this.ciForwardDeploymentEnabled = ciForwardDeploymentEnabled;
    }

    public String getCiConfigPath() {
        return ciConfigPath;
    }

    public void setCiConfigPath(String ciConfigPath) {
        this.ciConfigPath = ciConfigPath;
    }

    public Boolean getRemoveSourceBranchAfterMerge() {
        return removeSourceBranchAfterMerge;
    }

    public void setRemoveSourceBranchAfterMerge(Boolean removeSourceBranchAfterMerge) {
        this.removeSourceBranchAfterMerge = removeSourceBranchAfterMerge;
    }

    public Project withRemoveSourceBranchAfterMerge(Boolean removeSourceBranchAfterMerge) {
        this.removeSourceBranchAfterMerge = removeSourceBranchAfterMerge;
        return this;
    }

    public Boolean getAutoDevopsEnabled() {
        return autoDevopsEnabled;
    }

    public void setAutoDevopsEnabled(Boolean autoDevopsEnabled) {
        this.autoDevopsEnabled = autoDevopsEnabled;
    }

    public AutoDevopsDeployStrategy getAutoDevopsDeployStrategy() {
        return autoDevopsDeployStrategy;
    }

    public void setAutoDevopsDeployStrategy(AutoDevopsDeployStrategy autoDevopsDeployStrategy) {
        this.autoDevopsDeployStrategy = autoDevopsDeployStrategy;
    }

    public Boolean getAutocloseReferencedIssues() {
        return autocloseReferencedIssues;
    }

    public void setAutocloseReferencedIssues(Boolean autocloseReferencedIssues) {
        this.autocloseReferencedIssues = autocloseReferencedIssues;
    }

    public Boolean getEmailsDisabled() {
        return emailsDisabled;
    }

    public void setEmailsDisabled(Boolean emailsDisabled) {
        this.emailsDisabled = emailsDisabled;
    }

    public Project withEmailsDisabled(Boolean emailsDisabled) {
        this.emailsDisabled = emailsDisabled;
        return this;
    }

    public String getSuggestionCommitMessage() {
        return this.suggestionCommitMessage;
    }

    public Project withSuggestionCommitMessage(String suggestionCommitMessage) {
        this.suggestionCommitMessage = suggestionCommitMessage;
        return this;
    }

    public void setSuggestionCommitMessage(String suggestionCommitMessage) {
        this.suggestionCommitMessage = suggestionCommitMessage;
    }

    public SquashOption getSquashOption() {
        return squashOption;
    }

    public void setSquashOption(SquashOption squashOption) {
        this.squashOption = squashOption;
    }

    public Project withSquashOption(SquashOption squashOption) {
        this.squashOption = squashOption;
        return this;
    }

    public String getMergeCommitTemplate() {
        return mergeCommitTemplate;
    }

    public void setMergeCommitTemplate(String mergeCommitTemplate) {
        this.mergeCommitTemplate = mergeCommitTemplate;
    }

    public String getSquashCommitTemplate() {
        return squashCommitTemplate;
    }

    public void setSquashCommitTemplate(String squashCommitTemplate) {
        this.squashCommitTemplate = squashCommitTemplate;
    }

    public String getIssueBranchTemplate() {
        return issueBranchTemplate;
    }

    public void setIssueBranchTemplate(String issueBranchTemplate) {
        this.issueBranchTemplate = issueBranchTemplate;
    }

    public String getMergeRequestsTemplate() {
        return mergeRequestsTemplate;
    }

    public void setMergeRequestsTemplate(String mergeRequestsTemplate) {
        this.mergeRequestsTemplate = mergeRequestsTemplate;
    }

    public String getIssuesTemplate() {
        return issuesTemplate;
    }

    public void setIssuesTemplate(String issuesTemplate) {
        this.issuesTemplate = issuesTemplate;
    }

    public Map<String, String> getLinks() {
        return links;
    }

    public void setLinks(Map<String, String> links) {
        this.links = links;
    }

    @JsonIgnore
    public String getLinkByName(String name) {
        if (links == null || links.isEmpty()) {
            return (null);
        }

        return (links.get(name));
    }
}
