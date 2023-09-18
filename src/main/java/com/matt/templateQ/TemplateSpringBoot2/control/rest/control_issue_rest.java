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
@RequestMapping("issue")
@RestController
public class control_issue_rest
{
        @Autowired
        private repo_issue reis;

        @RequestMapping(path="All", method= RequestMethod.GET)
        public List<issue> getAll()
        {
            return (List)this.reis.findAll();
        }
@PostMapping("/Save")
  @ResponseBody()
  public void create_(@Valid issue is)
  {
     reis.save(is);
  }

  @DeleteMapping("/Delete")
  @Transactional
  @ResponseBody()
  public ResponseEntity<issue> Delete_(@RequestParam("id_issue")  String[] id_issue,  issue is)
  {
    reis.hapusdataAll(Arrays.asList(id_issue));
    return ResponseEntity.ok().build();
  }

    }


