package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bean.Paytm;
import com.dao.PaytmDao;

@Service
public class PaytmService {

	@Autowired
	PaytmDao paytmDao;
	
	@Autowired
	RestTemplate restTemplate;			// this api help us to call other service rest api.
	
	public String getAccountNumber(int pid) {
		Optional<Paytm> op = paytmDao.findById(pid);
		if(op.isPresent()) {
			Paytm pp	=	op.get();
			if(pp.getAccno()==null) {
					return "Account not exist with this paytm id";
			}else {
				int accno = pp.getAccno();
				// http://localhost:8383/account/findBalance/101
			String result = restTemplate.getForObject("http://ACCOUNT-SERVICE:8383/account/findBalance/"+accno, String.class);
			return result;
			}
		}else {
			return "Paytm id is wrong";
		}
	}
}
