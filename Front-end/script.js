// script.js
$(document).ready(function() {
  // Xử lý sự kiện khi click vào nút "Lấy dữ liệu từ API"
  $("#btnGetData").click(function() {
    // Gọi API bằng phương thức GET
    $.get('http://localhost:8085/api/qlnv/nhanvien', function(response) {
      // Xử lý dữ liệu trả về thành công từ API
      // Ở đây, chúng ta giả sử API trả về một đối tượng JSON
      // và hiển thị nội dung lên div có id "dataContainer"
      
	  var jsonArray  = JSON.parse(JSON.stringify(response, null, 2));
	  
	  var table =  document.createElement("table");
	  table.setAttribute("width","50%");
	  table.setAttribute("border","1");
	  
	  var tr1 = document.createElement("tr");
	  var maso_header = document.createElement("th");
	  maso_header.textContent = "Mã số";
	  var hoten_header = document.createElement("th");
	  hoten_header.textContent = "Họ tên";
	  var diachi_header = document.createElement("th");
	  diachi_header.textContent = "Địa chỉ";
	  var dienthoai_header = document.createElement("th");
	  dienthoai_header.textContent = "Điện thoại";
	  tr1.appendChild(maso_header);
	  tr1.appendChild(hoten_header);
	  tr1.appendChild(diachi_header);
	  tr1.appendChild(dienthoai_header);
	  table.appendChild(tr1);
	  for (var i = 0; i < jsonArray.length; i++) {
			var nhanvien = jsonArray[i];
			
		    var tr = document.createElement("tr");
			var maso = document.createElement("td");
			var btn = document.createElement("button");
			btn.innerHTML = nhanvien.manv;
			btn.onclick = function(){
				getDetail(this.innerHTML);
			};
			maso.appendChild(btn);
			var hoten = document.createElement("td");
			hoten.textContent  = nhanvien.hoten;
			var diachi = document.createElement("td");
			diachi.textContent  = nhanvien.diachi;
			var dienthoai = document.createElement("td");
			dienthoai.textContent  = nhanvien.dienthoai;			  
			tr.appendChild(maso);
			tr.appendChild(hoten);
			tr.appendChild(diachi);
			tr.appendChild(dienthoai);			  
			table.appendChild(tr);
		    	 
		}
		document.getElementById("dataContainer").innerHTML = '';
		document.getElementById("dataContainer").appendChild(table);
	 
    }).fail(function(xhr, status, error) {
      // Xử lý lỗi nếu có
      $("#dataContainer").html("Đã xảy ra lỗi: " + status + " - " + error);
    });
  });
  
  function getDetail(param){
	  $.get('http://localhost:8081/api/qltc/nhanvien/get?manv=' + param, function(response) {
		  var nhanvien  = JSON.parse(JSON.stringify(response, null, 2));
		  
		 var header = document.createElement("h1");
		 header.textContent = "ID: " + nhanvien.manv;
		 var luong = document.createElement("h3");
		 luong.textContent = "Luong: "+ nhanvien.luong;
		 var bangcap = document.createElement("h3");
		 bangcap.textContent = "Bang cap: " + nhanvien.bangcap;
		 var namsinh = document.createElement("h3");
		 namsinh.textContent = "Nam sinh: " + nhanvien.namsinh;
		 var thuongtru = document.createElement("h3");
		 thuongtru.textContent = "Thuong tru: " + nhanvien.thuongtru;
		 
		 document.getElementById("detail").innerHTML='';
		 document.getElementById("detail").appendChild(header);
		 document.getElementById("detail").appendChild(luong);
		 document.getElementById("detail").appendChild(bangcap);
		 document.getElementById("detail").appendChild(namsinh);
		 document.getElementById("detail").appendChild(thuongtru);
		 
		 
		  
	  }).fail(function(xhr, status, error) {
      // Xử lý lỗi nếu có
      $("#detail").html("Đã xảy ra lỗi: " + status + " - " + error);
    });
	  
  }
  
});


  


	