package edu.pitt.isd.controller.question.vo;

import java.util.List;

import edu.pitt.isd.model.dto.Answer;

public class AnswerVO {
    private List<Answer> answers;
    private String url;

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
