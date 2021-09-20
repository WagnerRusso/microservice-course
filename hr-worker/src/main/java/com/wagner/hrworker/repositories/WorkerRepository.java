package com.wagner.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wagner.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
