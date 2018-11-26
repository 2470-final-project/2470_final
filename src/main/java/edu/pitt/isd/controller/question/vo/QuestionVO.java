package edu.pitt.isd.controller.question.vo;

import java.util.List;

import edu.pitt.isd.model.dto.Question;
import edu.pitt.isd.model.dto.QuestionOption;

public class QuestionVO extends Question {
    private List<QuestionOption> options;

    public List<QuestionOption> getOptions() {
        return options;
    }

    public void setOptions(List<QuestionOption> options) {
        this.options = options;
    }
}
