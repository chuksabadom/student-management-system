package com.chuksabadom.sms.repository;

import com.chuksabadom.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
