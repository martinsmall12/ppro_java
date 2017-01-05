/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package blog.models;


import java.util.Date;

@Entity
@Table(name = "CheckHistory")
public class CheckHistory   {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(length = 30)
        private String status;

        @Column(length = 1000)
        private String sent;

        @Column(length = 5000)
        private String remark;

        @Column(length = 30)
        private Date dateOfSent;

        @Column(length = 30)
        private Date dateOfImpl;

    public Check(String status, String sent, String remark, Date dateOfSent, Date dateOfImpl) {
        this.name = status;
        this.consequences = sent;
        this.price = remark;
        this.period = dateOfSent;
        this.period = dateOfImpl;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSent() {
        return sent;
    }

    public void setSent(String sent) {
        this.sent = sent;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getDateOfSent() {
        return dateOfSent;
    }

    public void setDateOfSent(Date dateOfSent) {
        this.dateOfSent = dateOfSent;
    }

    public Date getDateOfImpl() {
        return dateOfImpl;
    }

    public void setDateOfImpl(Date dateOfImpl) {
        this.dateOfImpl = dateOfImpl;
    }


