public class Insurance {

    private String insuranceId;
    private String provider;
    private String policyNumber;
    private String coverageDetails;

    public Insurance(String insuranceId, String provider, String policyNumber, String coverageDetails) {
        this.insuranceId = insuranceId;
        this.provider = provider;
        this.policyNumber = policyNumber;
        this.coverageDetails = coverageDetails;
    }

    public String getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(String insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getCoverageDetails() {
        return coverageDetails;
    }

    public void setCoverageDetails(String coverageDetails) {
        this.coverageDetails = coverageDetails;
    }
}
