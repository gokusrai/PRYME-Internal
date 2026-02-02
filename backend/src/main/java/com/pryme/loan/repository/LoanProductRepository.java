package com.pryme.loan.repository;

import com.pryme.loan.entity.LoanProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface LoanProductRepository extends JpaRepository<LoanProduct, Long> {

    // Find products where:
    // 1. Type matches (e.g., Personal Loan)
    // 2. Product's min salary is <= User's income
    // 3. Product's min CIBIL is <= User's CIBIL
    List<LoanProduct> findByTypeAndMinSalaryLessThanEqualAndMinCibilLessThanEqual(
            String type,
            BigDecimal monthlyIncome,
            int cibilScore
    );
}