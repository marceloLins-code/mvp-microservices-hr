package com.linss.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.linss.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
