import Person.Patient;

public class Billing {

    private String billId;
    private Patient patient;
    private String totalAmount;
    private String billingDate;
    private String payment;

    public Billing(String billId, Patient patient, String totalAmount, String billingDate, String payment) {
        this.billId = billId;
        this.patient = patient;
        this.totalAmount = totalAmount;
        this.billingDate = billingDate;
        this.payment = payment;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(String billingDate) {
        this.billingDate = billingDate;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
}
