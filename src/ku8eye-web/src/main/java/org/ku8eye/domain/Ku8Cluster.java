package org.ku8eye.domain;

import java.util.Date;

public class Ku8Cluster {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku8_cluster.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku8_cluster.TENANT_ID
     *
     * @mbggenerated
     */
    private Integer tenantId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku8_cluster.ZONE_ID
     *
     * @mbggenerated
     */
    private Integer zoneId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku8_cluster.NAME
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku8_cluster.LABELS
     *
     * @mbggenerated
     */
    private String labels;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku8_cluster.K8S_VERSION
     *
     * @mbggenerated
     */
    private String k8sVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku8_cluster.INSTALL_TYPE
     *
     * @mbggenerated
     */
    private Byte installType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku8_cluster.NOTE
     *
     * @mbggenerated
     */
    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku8_cluster.LAST_UPDATED
     *
     * @mbggenerated
     */
    private Date lastUpdated;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku8_cluster.ID
     *
     * @return the value of ku8_cluster.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku8_cluster.ID
     *
     * @param id the value for ku8_cluster.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku8_cluster.TENANT_ID
     *
     * @return the value of ku8_cluster.TENANT_ID
     *
     * @mbggenerated
     */
    public Integer getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku8_cluster.TENANT_ID
     *
     * @param tenantId the value for ku8_cluster.TENANT_ID
     *
     * @mbggenerated
     */
    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku8_cluster.ZONE_ID
     *
     * @return the value of ku8_cluster.ZONE_ID
     *
     * @mbggenerated
     */
    public Integer getZoneId() {
        return zoneId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku8_cluster.ZONE_ID
     *
     * @param zoneId the value for ku8_cluster.ZONE_ID
     *
     * @mbggenerated
     */
    public void setZoneId(Integer zoneId) {
        this.zoneId = zoneId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku8_cluster.NAME
     *
     * @return the value of ku8_cluster.NAME
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku8_cluster.NAME
     *
     * @param name the value for ku8_cluster.NAME
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku8_cluster.LABELS
     *
     * @return the value of ku8_cluster.LABELS
     *
     * @mbggenerated
     */
    public String getLabels() {
        return labels;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku8_cluster.LABELS
     *
     * @param labels the value for ku8_cluster.LABELS
     *
     * @mbggenerated
     */
    public void setLabels(String labels) {
        this.labels = labels;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku8_cluster.K8S_VERSION
     *
     * @return the value of ku8_cluster.K8S_VERSION
     *
     * @mbggenerated
     */
    public String getK8sVersion() {
        return k8sVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku8_cluster.K8S_VERSION
     *
     * @param k8sVersion the value for ku8_cluster.K8S_VERSION
     *
     * @mbggenerated
     */
    public void setK8sVersion(String k8sVersion) {
        this.k8sVersion = k8sVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku8_cluster.INSTALL_TYPE
     *
     * @return the value of ku8_cluster.INSTALL_TYPE
     *
     * @mbggenerated
     */
    public Byte getInstallType() {
        return installType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku8_cluster.INSTALL_TYPE
     *
     * @param installType the value for ku8_cluster.INSTALL_TYPE
     *
     * @mbggenerated
     */
    public void setInstallType(Byte installType) {
        this.installType = installType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku8_cluster.NOTE
     *
     * @return the value of ku8_cluster.NOTE
     *
     * @mbggenerated
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku8_cluster.NOTE
     *
     * @param note the value for ku8_cluster.NOTE
     *
     * @mbggenerated
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku8_cluster.LAST_UPDATED
     *
     * @return the value of ku8_cluster.LAST_UPDATED
     *
     * @mbggenerated
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku8_cluster.LAST_UPDATED
     *
     * @param lastUpdated the value for ku8_cluster.LAST_UPDATED
     *
     * @mbggenerated
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}