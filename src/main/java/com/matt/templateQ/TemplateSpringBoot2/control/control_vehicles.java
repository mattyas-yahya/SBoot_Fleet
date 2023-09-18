/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.matt.templateQ.TemplateSpringBoot2.control;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.UUID;
import java.text.SimpleDateFormat;

import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.matt.templateQ.TemplateSpringBoot2.model.*;
import com.matt.templateQ.TemplateSpringBoot2.repo.repo_vehicles;

import net.datafaker.Faker;


@Controller
public class control_vehicles
{

	@Autowired
	repo_vehicles rv;
  
			        Faker f = new Faker();
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            vehicles v = new vehicles();
            
@RequestMapping(value={"/vehicles"})
public String vehicles() 
{

return "vehicles/vehicles";
}

  @GetMapping({"/vehicles"})
  public String vehicles_form(Model model)throws ParseException
  {
    
  try {
				try {
			for(int x=1; x<=200; x++)
			{
			v.setId_vehicles(UUID.randomUUID().toString());
            v.setModel(f.vehicle().model());
			v.setLicense_plat(f.vehicle().licensePlate());
v.setDriver(f.name().fullName());
v.setAssignment_date( sdf.parse("2023-11-12"));
v.setCategory(f.vehicle().engine());
v.setOrder_date(sdf.parse("2023-11-12"));
v.setChassis_number(f.number().toString());
v.setFleet_manager(f.funnyName().name());
v.setLocation(f.address().cityName());
v.setFirst_contract_date(sdf.parse("2023-11-12"));
v.setPurchase_value("30000");
v.setResidual_value("3,5");
rv.save(v);
			}
 } catch (DataIntegrityViolationException e)
                    {
                     System.out.print(e);
                 }
 } catch (ConstraintViolationException e)
                    {
                     System.out.print(e);
                 }
    model.addAttribute("vehicles", new vehicles());
    return "vehicles/vehicles";
  }

}
