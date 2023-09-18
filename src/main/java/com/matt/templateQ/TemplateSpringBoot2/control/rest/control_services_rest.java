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
@RequestMapping("services")
@RestController
public class control_services_rest
{
        @Autowired
        private repo_services res;

        @RequestMapping(path="All", method= RequestMethod.GET)
        public List<services> getAll()
        {
            return (List)this.res.findAll();
        }
@PostMapping("/Save")
  @ResponseBody()
  public void create_(@Valid services s)
  {
     res.save(s);
  }

  @DeleteMapping("/Delete")
  @Transactional
  @ResponseBody()
  public ResponseEntity<services> Delete_(@RequestParam("id_services")  String[] id_services,  services s)
  {
    res.hapusdataAll(Arrays.asList(id_services));
    return ResponseEntity.ok().build();
  }

    }


