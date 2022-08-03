package com.sts.merchant.lms.service;

import com.sts.merchant.lms.entity.LoanApplication;
import com.sts.merchant.lms.request.LoanApplicationRequest;
import com.sts.merchant.lms.response.Response;

import java.util.List;

public interface LmsService {
    Response<LoanApplication> saveApplication(LoanApplicationRequest request);

    Response<List<LoanApplication>> fetchApplicationDetails();

}
