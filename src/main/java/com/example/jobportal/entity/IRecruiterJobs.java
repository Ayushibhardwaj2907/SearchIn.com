package com.example.jobportal.entity;

public interface IRecruiterJobs {

    Long getTotalCandidates(); // Ensure Long is properly resolved

    int getJob_post_id();

    String getJob_title();

    int getLocationId();

    String getCity();

    String getState();

    String getCountry();

    int getCompanyId();

    String getName();
}
