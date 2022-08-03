package com.sts.merchant.lms.controller;

import com.sts.merchant.lms.entity.LoanApplication;
import com.sts.merchant.lms.request.LoanApplicationRequest;
import com.sts.merchant.lms.response.Response;
import com.sts.merchant.lms.service.LmsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api")
@Slf4j
public class LmsController {

    @Autowired
    private LmsService lmsService;

    @RequestMapping(value = "/saveApplication", method = RequestMethod.POST)
    public Response<LoanApplication> saveApplication(@RequestBody LoanApplicationRequest request) {
        //LOGS: request , save application initiated
        return lmsService.saveApplication(request);
    }

    @RequestMapping(value = "/getApplications", method = RequestMethod.GET)
    public Response<List<LoanApplication>> fetchApplicationDetails(){
        return lmsService.fetchApplicationDetails();
    }
}
