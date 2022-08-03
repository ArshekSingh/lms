package com.sts.merchant.lms.service;

import com.sts.merchant.lms.entity.LoanApplication;
import com.sts.merchant.lms.repository.LmsRepository;
import com.sts.merchant.lms.request.LoanApplicationRequest;
import com.sts.merchant.lms.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class LmsServiceImpl implements LmsService {

    @Autowired
    private LmsRepository lmsRepository;

    @Override
    public Response<LoanApplication> saveApplication(LoanApplicationRequest request) {
        log.info("Application received to be saved {}", request.getName() + " client ID: " + request.getClientId());
        Response<LoanApplication> response = new Response<>();
        LoanApplication loanApplication = new LoanApplication();
        loanApplication.setApplicationId(1L);
        loanApplication.setApplicationStatus("S");
        lmsRepository.save(loanApplication);
        response.setCode(HttpStatus.OK.value());
        response.setMessage("Data save successfully");
        response.setData(loanApplication);
        return response;
    }

    public Response<List<LoanApplication>> fetchApplicationDetails() {

        Response<List<LoanApplication>> response = new Response<>();
        try {
            List<LoanApplication> applications = lmsRepository.findAll();
            if (applications.isEmpty()) {
                log.info("DB is empty");
                response.setCode(HttpStatus.OK.value());
                response.setStatus(HttpStatus.OK);
                response.setData(null);
                response.setTotalCount((long) applications.size());
                response.setMessage("No applications found!");
            } else {
                response.setCode(HttpStatus.OK.value());
                response.setStatus(HttpStatus.OK);
                response.setData(applications);
                response.setTotalCount((long) applications.size());
                response.setMessage("Transaction Successful!");
            }
        } catch (Exception exception) {
            response.setCode(HttpStatus.BAD_REQUEST.value());
            response.setStatus(HttpStatus.BAD_REQUEST);
            response.setData(null);
            response.setTotalCount(0L);
            response.setMessage("Something went wrong!");
        }
        return response;
    }
}
