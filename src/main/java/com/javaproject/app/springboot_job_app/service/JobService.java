package com.javaproject.app.springboot_job_app.service;

import com.javaproject.app.springboot_job_app.model.JobPost;
import com.javaproject.app.springboot_job_app.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public void addJob(JobPost jobPost){
        jobRepository.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return jobRepository.getAllJobs();
    }
}
