package com.jk2bpn.onlinetripbookingsystem.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk2bpn.onlinetripbookingsystem.entities.Feedback;
import com.jk2bpn.onlinetripbookingsystem.repository.IFeedbackRepository;

@Service
public class FeedbackServiceImpl implements IFeedbackService{

	@Autowired
    IFeedbackRepository repo;
	@Override
	public Feedback addFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		System.out.println("Successfully saved");
		  return repo.save(feedback);
		
	}

	@Override
	public Optional<Feedback> findByFeedbackId(Long feedbackId) {
		// TODO Auto-generated method stub
		
		  return repo.findById(feedbackId);
		
	}

	@Override
	public Optional<Feedback> findByCustomerId(Long customerId) {
		// TODO Auto-generated method stub
		
		  return repo.findById(customerId);
	}

	@Override
	public List<Feedback> viewAllFeedbacks() {
		
		return repo.findAll();
	}

}
