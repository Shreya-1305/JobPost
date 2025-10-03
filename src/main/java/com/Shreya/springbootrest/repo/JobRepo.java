package com.Shreya.springbootrest.repo;

import java.util.List;

import com.Shreya.springbootrest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

	List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);


}
