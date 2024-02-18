package com.linss.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linss.hrpayroll.entities.Payment;
import com.linss.hrpayroll.entities.Worker;
import com.linss.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(Long workerId, int days) {		
		
		Worker worker = workerFeignClient.findById(workerId).getBody(); 
		
		return new Payment(worker.getName(), worker.getDailyIncome(), days );		
		
	}
	
	
	

}
