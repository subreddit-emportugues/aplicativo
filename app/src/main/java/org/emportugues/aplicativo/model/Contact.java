package org.emportugues.aplicativo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Contact {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("age")
    @Expose
    private Long age;
    @SerializedName("recent_submissions")
    @Expose
    private Number recent_submissions;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("members")
    @Expose
    private Number members;
    @SerializedName("recent_comments")
    @Expose
    private Number recent_comments;
    @SerializedName("nsfw")
    @Expose
    private Boolean nsfw;
    @SerializedName("moderators")
    @Expose
    private String[] moderators;

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return The age
     */
    public Long getAge() {
        return age;
    }

    /**
     * @param age The age
     */
    public void setAge(Long age) {
        this.age = age;
    }

    /**
     * @return The recent_submissions
     */
    public Number getRecentSubmissions() {
        return recent_submissions;
    }

    /**
     * @param recent_submissions The recent_submissions
     */
    public void setRecentSubmissions(Number recent_submissions) {
        this.recent_submissions = recent_submissions;
    }

    /**
     * @return The icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon The profile_pic
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @return The members
     */
    public Number getMembers() {
        return members;
    }

    /**
     * @param members The members
     */
    public void setMembers(Number members) {
        this.members = members;
    }

    /**
     * @return The recent_comments
     */
    public Number getRecentComments() {
        return recent_comments;
    }

    /**
     * @param recent_comments The recent_comments
     */
    public void setRecentComments(Number recent_comments) {
        this.recent_comments = recent_comments;
    }

    public Boolean getNSFW() {
        return nsfw;
    }

    /**
     * @param recent_comments The recent_comments
     */
    public void setNSFW(Boolean recent_comments) {
        this.nsfw = recent_comments;
    }

    /**
     * @return The moderators
     */
    public String[] getModerators() {
        return moderators;
    }

    /**
     * @param moderators The moderators
     */
    public void setModerators(String[] moderators) {
        this.moderators = moderators;
    }

}
