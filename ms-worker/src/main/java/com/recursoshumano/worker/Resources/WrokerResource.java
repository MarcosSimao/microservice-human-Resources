package com.recursoshumano.worker.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recursoshumano.worker.entities.Worker;
import com.recursoshumano.worker.repositorys.WorkerRepository;

@RestController
@RequestMapping(value="/workers")
public class WrokerResource {
    @Autowired
	private WorkerRepository repor;
    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
    	List<Worker> list=repor.findAll();
    	return ResponseEntity.ok(list);
    	}
    
    
    @GetMapping(value="/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id){
    	Worker worker=repor.findById(id).get();
    	return ResponseEntity.ok(worker);
    	}
    }
