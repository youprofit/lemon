package com.mossle.humantask.persistence.domain;

// Generated by Hibernate Tools
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TaskDefNotification .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "TASK_DEF_NOTIFICATION")
public class TaskDefNotification implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private TaskDefBase taskDefBase;

    /** null. */
    private String eventName;

    /** null. */
    private String receiver;

    /** null. */
    private String type;

    /** null. */
    private String templateCode;

    public TaskDefNotification() {
    }

    public TaskDefNotification(TaskDefBase taskDefBase, String eventName,
            String receiver, String type, String templateCode) {
        this.taskDefBase = taskDefBase;
        this.eventName = eventName;
        this.receiver = receiver;
        this.type = type;
        this.templateCode = templateCode;
    }

    /** @return null. */
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BASE_ID")
    public TaskDefBase getTaskDefBase() {
        return this.taskDefBase;
    }

    /**
     * @param taskDefBase
     *            null.
     */
    public void setTaskDefBase(TaskDefBase taskDefBase) {
        this.taskDefBase = taskDefBase;
    }

    /** @return null. */
    @Column(name = "EVENT_NAME", length = 100)
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @param eventName
     *            null.
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /** @return null. */
    @Column(name = "RECEIVER", length = 200)
    public String getReceiver() {
        return this.receiver;
    }

    /**
     * @param receiver
     *            null.
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    /** @return null. */
    @Column(name = "TYPE", length = 50)
    public String getType() {
        return this.type;
    }

    /**
     * @param type
     *            null.
     */
    public void setType(String type) {
        this.type = type;
    }

    /** @return null. */
    @Column(name = "TEMPLATE_CODE", length = 200)
    public String getTemplateCode() {
        return this.templateCode;
    }

    /**
     * @param templateCode
     *            null.
     */
    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }
}
