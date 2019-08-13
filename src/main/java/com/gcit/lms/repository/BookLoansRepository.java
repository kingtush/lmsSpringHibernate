package com.gcit.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gcit.lms.entity.Author;
import com.gcit.lms.entity.BookLoans;

@Repository
public interface BookLoansRepository extends JpaRepository<BookLoans, Integer>{

}
