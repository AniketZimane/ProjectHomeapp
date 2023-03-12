package com.example.ProjectHomeapp.dao;

import com.example.ProjectHomeapp.Entity.Studentinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StuRepo extends JpaRepository<Studentinfo,Long> {
}
