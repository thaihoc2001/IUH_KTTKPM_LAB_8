package com.example.Lab08_CloudConfig_Client.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class AppControlelr {
	@Value("${text.copyrght: Default Copyright}")
	private String copyrigh;
	
	@Value("${spring.datasource.driver-class-name}")
    private String driverClassName;
	
	@Value("${spring.datasource.url}")
    private String url;
	
	@Value("${spring.datasource.username}")
    private String userName;

	@Value("${spring.datasource.password}")
    private String password;
	
	@Autowired
    private DataSource dataSource;
	
	@RequestMapping("/showCloudConfigClient")
	@ResponseBody
	public String showCloudCOnfigClient() {
		String cccInfo = "CopyRight:" + copyrigh
			+ "<br/>spring.datasource.driver-class-name=" +driverClassName
			+ "<br/>spring.datasource.url=" + url 
			+ "<br/>spring.datasource.username=" +userName
			+ "<br/>spring.datasource.password=" +password;
		return cccInfo;
	}
	@RequestMapping("/pingDataSource")
    @ResponseBody
    public String pingDataSource() {
        try {
            return this.dataSource.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }
}
