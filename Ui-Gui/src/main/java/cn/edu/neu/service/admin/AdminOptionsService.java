package cn.edu.neu.service.admin;


import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpSession;

import cn.edu.neu.vo.backJSON;

public interface AdminOptionsService {
	
	public backJSON findAdmin(String adminId,String adminPassword, HttpSession session) throws NoSuchAlgorithmException, UnsupportedEncodingException;
	
	
	
}
