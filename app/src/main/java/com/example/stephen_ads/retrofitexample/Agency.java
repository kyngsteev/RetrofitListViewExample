package com.example.stephen_ads.retrofitexample;

public class Agency {
    private String AgencyRef;
    private String FullName;
    private String HeadRef;
    private String orcAgency;
    private String AgencyOrcFullName;

    public Agency(String agencyRef, String fullName, String headRef, String orcAgency, String agencyOrcFullName) {
        AgencyRef = agencyRef;
        FullName = fullName;
        HeadRef = headRef;
        this.orcAgency = orcAgency;
        AgencyOrcFullName = agencyOrcFullName;
    }

    public String getAgencyRef() {
        return AgencyRef;
    }

    public String getFullName() {
        return FullName;
    }

    public String getHeadRef() {
        return HeadRef;
    }

    public String getOrcAgency() {
        return orcAgency;
    }

    public String getAgencyOrcFullName() {
        return AgencyOrcFullName;
    }
}
