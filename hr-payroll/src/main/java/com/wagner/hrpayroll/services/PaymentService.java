package com.wagner.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wagner.hrpayroll.entities.Payment;
import com.wagner.hrpayroll.entities.Worker;
import com.wagner.hrpayroll.feignclients.WorkerFeingClient;

@Service
public class PaymentService {


	@Autowired
	private WorkerFeingClient workerFeingClient;
	
	public Payment getPaymente(long workedId, int days) {
		
		Worker worker = workerFeingClient.findById(workedId).getBody();
		
		return new Payment(worker.getName(),worker.getDailyIncome(), days);
	}

}
