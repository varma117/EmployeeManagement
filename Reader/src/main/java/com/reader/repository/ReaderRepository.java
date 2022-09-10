package com.reader.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reader.model.Reader;

@Repository
public interface ReaderRepository extends JpaRepository<Reader, String> {
	
	
	
}
