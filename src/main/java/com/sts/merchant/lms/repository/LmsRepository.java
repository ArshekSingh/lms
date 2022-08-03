package com.sts.merchant.lms.repository;

import com.sts.merchant.lms.entity.LoanApplication;
import com.sts.merchant.lms.response.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LmsRepository extends JpaRepository<LoanApplication, Integer> {


}
