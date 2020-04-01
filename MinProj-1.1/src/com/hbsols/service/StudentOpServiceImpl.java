package com.hbsols.service;

import com.hbsols.bo.StudentBO;
import com.hbsols.dao.IStudentDao;
import com.hbsols.dto.StudentDTO;

public class StudentOpServiceImpl implements IStudentOpService {

	private IStudentDao dao;

	public StudentOpServiceImpl(IStudentDao dao) {
		System.out.println("StudentOpServiceImpl 1-Param Constructor");
		this.dao = dao;
	}

	@Override
	public String register(StudentDTO dto) throws Exception {

		// write b.Logic by collecting inputs from dto
		int sno, m1, m2, m3, count= 0, total = 0;
		float avg = 0.0f;
		String sname = null, addr = null, result = null;
		StudentBO bo = null;

		sno = dto.getSno();
		sname = dto.getSname();
		addr = dto.getAddr();

		total = dto.getM1() + dto.getM2() + dto.getM3();
		avg = total / 3;

		// Prepare BO class having sno,name, total...

		bo = new StudentBO();
		
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setAddr(dto.getAddr());
		bo.setTot(total);
		bo.setAvg(avg);
		bo.setResult(result);
		
		// Use DAO
		count = dao.insert(bo);
		
		if(count == 0)
			return "Student Registration is Failed";
		else
			return "Student Registration is  Success";
	}

}
