package com.cd.learning.importconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.cd.learning.config.EmployeeConfiguration;
import com.cd.learning.config.StudentConfiguration;
 

@Configuration
@Import({StudentConfiguration.class,EmployeeConfiguration.class})
public class ImportConfig {

}
