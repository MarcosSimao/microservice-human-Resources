package com.recursoshumano.worker.repositorys;

import com.recursoshumano.worker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface WorkerRepository extends JpaRepository<Worker,Long>{


	
}
