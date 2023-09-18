package com.matt.templateQ.TemplateSpringBoot2.control.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.matt.templateQ.TemplateSpringBoot2.model.*;
import com.matt.templateQ.TemplateSpringBoot2.repo.*;

import java.io.DataInputStream;
import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;
@RequestMapping("vehicles")
@RestController
public class control_vehicles_rest
{
        @Autowired
        private repo_vehicles rev;

        @RequestMapping(path="All", method= RequestMethod.GET)
        public List<vehicles> getAll()
        {
            return (List)this.rev.findAll();
        }
@PostMapping("/Save")
  @ResponseBody()
  public void create_po(@Valid vehicles v)
  {
     rev.save(v);
  }

  @DeleteMapping("/Delete")
  @Transactional
  @ResponseBody()
  public ResponseEntity<vehicles> Delete_(@RequestParam("id_vehicles")  String[] id_vehicles,  vehicles v)
  {
    rev.hapusdataAll(Arrays.asList(id_vehicles));
    return ResponseEntity.ok().build();
  }

    }


