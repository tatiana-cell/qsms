package simplon.com.mcq.services;

import java.util.List;

import simplon.com.mcq.domain.dtos.QuestionPropositionView;

public interface QuestionService {

    List<QuestionPropositionView> getQuestionReponses();

}
