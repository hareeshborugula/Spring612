package com.hbsols.controller;

import com.hbsols.dto.EmployeeDTO;
import com.hbsols.service.IEmployeeService;
import com.hbsols.vo.EmployeeVO;

public class MainController {

	private IEmployeeService service;

	public MainController(IEmployeeService service) {
		System.out.println("MainController 1 -Param Constructor");
		this.service = service;
	}

	public String process(EmployeeVO vo) throws Exception {

		EmployeeDTO dto = null;
		String result = null;

		dto = new EmployeeDTO();
		
		dto.setEname(vo.getEname());
		dto.setEaddr(vo.getEaddr());
		dto.setBasicSal(vo.getBasicSal());

		result = service.registerEmployee(dto);
		return result;
	}

}
