package com.gep.Foro_Challenge.subject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRespository extends JpaRepository<SubjectModel, Long> {
}