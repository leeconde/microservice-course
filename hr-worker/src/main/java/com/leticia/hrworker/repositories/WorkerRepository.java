package com.leticia.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leticia.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
