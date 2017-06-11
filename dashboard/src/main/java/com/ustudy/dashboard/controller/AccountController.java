package com.ustudy.dashboard.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ustudy.dashboard.model.Account;
import com.ustudy.dashboard.services.AccountService;

@RestController
@RequestMapping(value = "/users")
public class AccountController {

	private static final Logger logger = LogManager.getLogger(AccountController.class);
	
	@Autowired
	private AccountService ac;
	
	@RequiresAuthentication
	@RequiresRoles(value={"user"})
	@RequiresPermissions("dashboard:view")
	@RequestMapping(value = "/list/", method = RequestMethod.GET)
	@Transactional
	public List<Account> list() {

		logger.debug("endpoint /list is visited");
				
		return ac.query();
		
	}

}
