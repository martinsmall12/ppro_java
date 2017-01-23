package blog.forms;


import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Size;
import java.util.Date;

public class CheckHistoryForm {

    @Size(max = 30)
    private String status;

    @Size(max = 1000)
    private String sent;

    @Size(max = 5000)
    private String remark;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Size(max = 30)
    private Date dateOfSent;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Size(max = 30)
    private Date dateOfImpl;

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
