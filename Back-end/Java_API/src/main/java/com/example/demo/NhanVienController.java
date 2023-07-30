package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/qlnv")
public class NhanVienController {

	@Autowired
	private NhanVienRepository nhanvienRepo;
	
	@GetMapping("/nhanvien")
	public @ResponseBody Iterable<NhanVien> layKetQua(){
		Iterable<NhanVien> result  = nhanvienRepo.findAll();
		return result;
	}

	@GetMapping("/nhanvien/{id}")
	public @ResponseBody NhanVien layKetQuaTheoId(@PathVariable Long id){
		NhanVien result  = nhanvienRepo.findById(id).get();
		return result;
	}
	
	
}
