/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matt.templateQ.TemplateSpringBoot2.control;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.matt.templateQ.TemplateSpringBoot2.model.*;


@Controller
public class control_issue
{


@RequestMapping(value={"/issue"})
public String issue()
{
return "issue/issue";
}

  @GetMapping({"/issue"})
  public String issue_form(Model model)
  {
    model.addAttribute("issue", new issue());
    return "issue/issue";
  }

}
