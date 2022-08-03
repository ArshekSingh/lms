package com.sts.merchant.lms.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
@Component


@Entity
@Getter
@Setter
@Table(name = "loan_application")
public class LoanApplication implements Serializable {

    @Id
    @Column(name = "org_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orgId;

    @Column(name = "application_id")
    private Long applicationId;

    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "applied_on")
    private LocalDateTime appliedOn;

    @Column(name = "applied_amount")
    private BigDecimal appliedAmount;

    @Column(name = "application_status")
    private String applicationStatus;

    @Column(name = "application_rejection_reason")
    private String applicationRejectionReason;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "loan_purpose_id")
    private BigDecimal loanPurposeId;

    @Column(name = "eligibility_amount")
    private Long eligibilityAmount;

    @Column(name = "expected_disbursement_on")
    private LocalDateTime expectedDisbursementOn;

    @Column(name = "approved_on_date")
    private LocalDateTime approvedOnDate;

    @Column(name = "processing_charge")
    private BigDecimal processingCharge;

    @Column(name = "payable_amount")
    private BigDecimal payableAmount;

    @Column(name = "ext_application_id")
    private String extApplicationId;

    @Column(name = "kyc_source")
    private String kycSource;

    @Column(name = "inserted_on")
    private LocalDateTime insertedOn;

    @Column(name = "inserted_by")
    private String insertedBy;

    @Column(name = "update_on")
    private LocalDateTime updatedOn;

    @Column(name = "updatedby")
    private String updatedBy;

    @Column(name = "first_emi_date")
    private LocalDateTime firstEmiDate;

}
