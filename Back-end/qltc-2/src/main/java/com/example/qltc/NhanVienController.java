package com.example.qltc;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("/api/qltc")
public class NhanVienController {

	@Autowired
	private QLTC_NhanVienRepo nhanvienRepo;

	@GetMapping("/nhanvien/get")
	public @ResponseBody Optional<NhanVien> layKetQua(@RequestParam("manv") long manv){
		Optional<NhanVien> result  = nhanvienRepo.findById(manv);
		return result;
	}




}
