public class Appointment {

    private String appointmentId;
    private String appointmentdate;
    private String appointmentTime;
    private String appointmentReason;

    public Appointment(String appointmentId, String appointmentdate, String appointmentTime, String appointmentReason) {
        this.appointmentId = appointmentId;
        this.appointmentdate = appointmentdate;
        this.appointmentTime = appointmentTime;
        this.appointmentReason = appointmentReason;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getAppointmentdate() {
        return appointmentdate;
    }

    public void setAppointmentdate(String appointmentdate) {
        this.appointmentdate = appointmentdate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getAppointmentReason() {
        return appointmentReason;
    }

    public void setAppointmentReason(String appointmentReason) {
        this.appointmentReason = appointmentReason;
    }
}
