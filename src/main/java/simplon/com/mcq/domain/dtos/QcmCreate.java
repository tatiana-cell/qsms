package simplon.com.mcq.domain.dtos;

public class QcmCreate {

    private String qcmName;

    public String getQcmName() {
        return qcmName;
    }

    public void setQcmName(String qcmName) {
        this.qcmName = qcmName;
    }

    public QcmCreate() 
    {    }

    @Override
    public String toString() {
	return "QsmCreate [qcmName=" + qcmName + ", getQcmName()=" + getQcmName() + ", getClass()=" + getClass()
		+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
   

}
