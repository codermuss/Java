package com.mustafayilmazdev.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mustafayilmazdev.hrms.business.abstracts.IsPozisyonlariService;
import com.mustafayilmazdev.hrms.dataAccess.abstracts.IsPozisyonlariDao;
import com.mustafayilmazdev.hrms.entities.concretes.IsPozisyonlari;

@Service
public class IsPozisyonlariManager implements IsPozisyonlariService {
	private IsPozisyonlariDao isPozisyonlariDao;

	@Autowired
	public IsPozisyonlariManager(IsPozisyonlariDao isPozisyonlariDao) {
		super();
		this.isPozisyonlariDao = isPozisyonlariDao;
	}

	@Override
	public List<IsPozisyonlari> getAll() {
		// TODO Auto-generated method stub
		return this.isPozisyonlariDao.findAll();
	}

}

// Verdiğin sınıfa göre bir repository classı oluşturuyor ve o instance'ı buraya veriyor
// bu instance'sı nereye vereceğini göstermek için Autowired anotasyonu kullanılır.
// javada bean proje clası demektir.
//Autowired da spring gidip arkaplanda buna karşılık gelecek IsPozisyonlariDao 
//nun instance'ı olabilecek bir sınıfı üretiyor.'
//Autowired bağımlılık oluşturur ve o projede tek bir instance'tan gidebiliriz.
