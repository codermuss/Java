package com.mustafayilmazdev.hrms_v1.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafayilmazdev.hrms_v1.business.abstracts.IsPozisyonuService;
import com.mustafayilmazdev.hrms_v1.dataAccess.abstracts.IsPozisyonuDao;
import com.mustafayilmazdev.hrms_v1.entities.concretes.IsPozisyonu;

@Service
public class IsPozisyonuManager implements IsPozisyonuService {

	IsPozisyonuDao isPozisyonuDao;

	@Autowired
	public IsPozisyonuManager(IsPozisyonuDao isPozisyonuDao) {
		super();
		this.isPozisyonuDao = isPozisyonuDao;
	}

	@Override
	public List<IsPozisyonu> getAll() {
		// TODO Auto-generated method stub
		return this.isPozisyonuDao.findAll();
	}

}
