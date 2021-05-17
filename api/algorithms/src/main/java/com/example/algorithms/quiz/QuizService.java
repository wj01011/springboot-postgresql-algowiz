package com.example.algorithms.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class QuizService {

    private final QuizRepository quizRepository;

    @Autowired
    public QuizService(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    // Returns Quiz objects with the given quizId
    public List<Quiz> getQuiz(String quizId) {
        return quizRepository.findAllByQuizId(quizId);
    }



}
