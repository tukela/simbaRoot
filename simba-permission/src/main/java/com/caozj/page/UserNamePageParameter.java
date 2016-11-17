package com.caozj.page;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import com.caozj.framework.session.page.PageParameter;
import com.caozj.util.SessionUtil;

@Component
public class UserNamePageParameter implements PageParameter {

	@Override
	public String getKey() {
		return SessionKey.userNameKey;
	}

	@Override
	public String getValue(HttpServletRequest request, HttpServletResponse response) {
		return SessionUtil.getUser(request.getSession()).getName();
	}

}