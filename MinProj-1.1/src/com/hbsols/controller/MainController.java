package com.hbsols.controller;

import com.hbsols.dto.StudentDTO;
import com.hbsols.service.IStudentOpService;
import com.hbsols.vo.StudentVO;

public class MainController {

	private IStudentOpService service;

	public MainController(IStudentOpService service) {
		System.out.println("MainController -1 Param Constructor");
		this.service = service;
	}

	public String doProcess(StudentVO vo) throws Exception {
		StudentDTO dto = null;
		String result = null;

		// Convert VO obj into DTO obj

		dto = new StudentDTO();

		dto.setSno(vo.getSno());
		dto.setSname(vo.getSname());
		dto.setAddr(vo.getAddr());
		dto.setM1(vo.getM1());
		dto.setM2(vo.getM2());
		dto.setM3(vo.getM3());

		// Use service
		result = service.register(dto);
		return result;
	}

}
