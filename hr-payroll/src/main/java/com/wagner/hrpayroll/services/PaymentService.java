package com.wagner.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.wagner.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPaymente(long workedId, int days) {
		return new Payment("Bob", 200.0, days);
	}

}
