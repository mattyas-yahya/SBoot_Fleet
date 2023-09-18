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
public class control_contract
{


@RequestMapping(value={"/contract"})
public String contract()
{
return "contract/contract";
}

  @GetMapping({"/contract"})
  public String contract_form(Model model)
  {
    model.addAttribute("contract", new contract());
    return "contract/contract";
  }

}
