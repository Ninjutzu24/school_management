package edu.cdloga.school_management.service;

import edu.cdloga.school_management.model.Grade;
import edu.cdloga.school_management.repository.GradeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GradeService {

    private final GradeRepository gradeRepository;

    public Grade saveGrade(Grade grade) {
        return gradeRepository.save(grade);
    }
}
