package com.example.demo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.Bank;
import com.example.demo.Service.ApiService;
@RestController
public class ApiController {
	
	@Autowired //extends another class
	ApiService stuService;
	@PostMapping("/addDetails")
	public Bank addInfo(@RequestBody Bank st)
	{
		return stuService.saveDetails(st);
		}@GetMapping("/showDetails")
		public List<Bank>fetchDetails(){
			return stuService.getDetails();
			}
		@PutMapping("/UpdateDetails")
		public Bank UpdateInfo(@RequestBody Bank st1){
			return stuService.UpdateDetails(st1);
			}
		
		@DeleteMapping("/Delete/{name}")
		public String deleteInfo (@PathVariable("id")int id) {
			stuService.deleteDetails(id);
			return "Deleted details";
			}
		}
