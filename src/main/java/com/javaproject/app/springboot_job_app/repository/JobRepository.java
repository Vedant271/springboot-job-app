package com.javaproject.app.springboot_job_app.repository;

import com.javaproject.app.springboot_job_app.model.JobPost;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobRepository {
    List<JobPost> jobs = new ArrayList<>();

    public void addJob(JobPost jobPost){
        jobs.add(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return jobs;
    }
}
