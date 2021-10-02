package com.jk2bpn.onlinetripbookingsystem.services;
import java.util.List;
import java.util.Optional;

import com.jk2bpn.onlinetripbookingsystem.entities.Feedback;

public interface IFeedbackService {
	public Feedback addFeedback(Feedback feedback);
	public Optional<Feedback> findByFeedbackId(Long feedbackId);
	public Optional<Feedback> findByCustomerId(Long customerId);
	public List<Feedback>  viewAllFeedbacks();
}
