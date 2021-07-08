package simplon.com.mcq.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import simplon.com.mcq.domain.dtos.QuestionPropositionView;
import simplon.com.mcq.services.QuestionService;

@RestController
@RequestMapping("/quizz")
public class QuestionController {

    private QuestionService service;

    public QuestionController(QuestionService service) {
	this.service = service;
    }

    @GetMapping("/questions")
    public List<QuestionPropositionView> getQuestionReponses() {
	return service.getQuestionReponses();
    }

    // @PostMapping("/questions/")
    // public List<QuestionPropositionView> getQuestionReponses() {
    // return service.getQuestionReponses();
    // }

}
