package com.ErrorNotes.Notes;

import com.ErrorNotes.Notes.Repositories.EtatRepository;
import com.ErrorNotes.Notes.Services.EtatService;
import com.ErrorNotes.Notes.Services.EtatServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

@SpringBootApplication
public class NotesApplication implements CommandLineRunner {

	@Autowired
	EtatRepository etatRepository;
	public static void main(String[] args) {
		SpringApplication.run(NotesApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		if (etatRepository.findAll().size() == 0)
		etatRepository.insererEtat();
		else return;
	}
}
