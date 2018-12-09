package edu.pitt.isd.controller.evaluation;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.pitt.isd.framework.rest.RestfulResponse;
import edu.pitt.isd.model.dto.CustomUserDetails;
import edu.pitt.isd.service.EvaluationService;

@RestController
@RequestMapping(value = "evaluation")
public class EvaluationController {
    @Autowired
    EvaluationService evaluationService;

    @GetMapping("my/{id}")
    public RestfulResponse userEvaluationList(@PathVariable Integer id, HttpServletResponse response) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        CustomUserDetails users = (CustomUserDetails) authentication.getPrincipal();
        if (users.getId() == id) {
//            List<Evaluation> list = evaluationService.selectByUserId(id);
            return new RestfulResponse(1, "success", users);
        } else {
            response.setStatus(403);
            return new RestfulResponse(0, "access denied", null);
        }

    }

}
