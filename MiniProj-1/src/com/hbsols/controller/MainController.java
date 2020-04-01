package com.hbsols.controller;

import com.hbsols.dto.StudentDTO;
import com.hbsols.service.StudentOpService;
import com.hbsols.vo.StudentVO;

public class MainController {

	private StudentOpService service;

	public MainController(StudentOpService service) {
		System.out.println("MainController 1-Param Constructor");
		this.service = service;
	}

	public String handle(StudentVO vo) throws Exception {

		StudentDTO dto = null;
		String result = null;

		// Conver vo class object into DTO class object.
		dto = new StudentDTO();

		dto.setSno(vo.getSno());
		dto.setSname(vo.getSname());
		dto.setSaddr(vo.getSaddr());
		dto.setM1(vo.getM1());
		dto.setM2(vo.getM2());
		dto.setM3(vo.getM3());

		// Use Service
		result = service.register(dto);

		return result;
	}
}
