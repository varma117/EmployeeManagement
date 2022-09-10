package com.reader.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.model.Book;
import com.reader.repository.ReaderRepository;

@Service
public class ReaderServiceImpl implements IReaderService{

	@Autowired
	ReaderRepository readerRepo;
		

}