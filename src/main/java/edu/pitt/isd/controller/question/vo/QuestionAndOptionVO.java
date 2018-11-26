package edu.pitt.isd.controller.question.vo;

import edu.pitt.isd.model.dto.Question;

public class QuestionAndOptionVO extends Question {
    private String option;
    private int optionNumber;

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public int getOptionNumber() {
        return optionNumber;
    }

    public void setOptionNumber(int optionNumber) {
        this.optionNumber = optionNumber;
    }
}
