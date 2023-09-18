package com.matt.templateQ.TemplateSpringBoot2.repo;

import java.util.List;
import com.matt.templateQ.TemplateSpringBoot2.model.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface repo_issue extends JpaRepository<issue,String>
 {
   String Q3="delete from issue  where id_issue in ?1";
  @Modifying
  @Query(value =Q3 ,nativeQuery = true)
  int hapusdataAll(List<String> id_issue);
}
