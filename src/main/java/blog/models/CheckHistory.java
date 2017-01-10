/*
 * Copyright (c) 2017. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package blog.models;


import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "checkHistory")
public class CheckHistory {
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

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "checkHistory")
    private Set<ContOnProdSold> contOnProdSolds;


    public CheckHistory(String status, String sent, String remark, Date dateOfSent, Date dateOfImpl) {
        this.status = status;
        this.sent = sent;
        this.remark = remark;
        this.dateOfSent = dateOfSent;
        this.dateOfImpl = dateOfImpl;
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
}


