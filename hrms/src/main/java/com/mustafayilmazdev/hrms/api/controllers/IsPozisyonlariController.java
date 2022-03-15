package com.mustafayilmazdev.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mustafayilmazdev.hrms.business.abstracts.IsPozisyonlariService;
import com.mustafayilmazdev.hrms.entities.concretes.IsPozisyonlari;

@RestController
@RequestMapping("/api/ispozisyonlari")
public class IsPozisyonlariController {
	private IsPozisyonlariService isPozisyonlariService;

	@Autowired
	public IsPozisyonlariController(IsPozisyonlariService isPozisyonlariService) {
		super();
		this.isPozisyonlariService = isPozisyonlariService;
	}

	@GetMapping("/getall")
	public List<IsPozisyonlari> getAll() {
		return this.isPozisyonlariService.getAll();
	}
}

//Controller gelen istekleri yönlendirir. Ne yapılacağına karar verir. 
// Dış dünyanın sistemimizle iletişim kurduğu yerdir.
// RestController sen bir controllersın demek
// Her katmanda iş yapan sınıflara anatosyonlar vererek ne iş yapacağını söyledik
// RequestMapping Birden fazla controller olabilir
// Ürün yönetimi için bir cont. Kategori yönetimi için bir cont. gibi
// Bunu RequestMapping anotasyonu ile yapıyoruz.
// Örneğin burada domain/api/ispozisyonlari adresi üzerinden bir istek gelirse 
// Onu karşılayacak controller budur diyoruz.
// Veri istediğimiz Requestlerde GetMapping anotasyonu kullanıyoruz
// GetMapping de domain/api/ispozisyonlari/getall diye bir istekte bulunursam
// Burası çalışacak

// Business katmanıyla iletişim kuracak
// Autowired bana IsPozisyonlariService lazım diyor gidip projeyi tarıyor Kim bunu implement etti? IsPozisyonlariManager
// Arkaplanda IsPozisyonlariManager i=new IsPozisyonlariManager(IsPozisyonlariDao isPozisyonlariDao);
// yapıyor
// Kısaca newlenmiş i yi buraya yerleştiriyor.
// IoC yapılandırmayla kullanılıyor
