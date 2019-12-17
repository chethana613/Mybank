package com.bank.mybank.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.mybank.entity.CustomerAccount;
import com.bank.mybank.entity.CustomerFavouriteAccount;

@Repository
public interface CustomerFavouriteAccountRepository extends JpaRepository<CustomerFavouriteAccount, Long> {

	List<CustomerFavouriteAccount> findAllByCustomerAccountNumber(CustomerAccount customerAccount);

	Optional<CustomerFavouriteAccount> findByCustomerAccountNumberAndBeneficiaryAccountNumber(
			CustomerAccount customerAccount, CustomerAccount customerAccount2);





}
