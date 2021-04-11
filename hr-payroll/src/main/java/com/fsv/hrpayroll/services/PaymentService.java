package com.fsv.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.fsv.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob", 200.00, days);
	}
}
