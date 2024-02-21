package com.team9.manosarthi_backend.Controllers;

import com.team9.manosarthi_backend.Entities.Doctor;
import com.team9.manosarthi_backend.Entities.User;
import com.team9.manosarthi_backend.Services.AdminService;
import com.team9.manosarthi_backend.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import com.team9.manosarthi_backend.Services.AdminService;

import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "*")
public class AdminController {
    @Autowired
    private UserService userService;

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping("/index")
    public String dashboard()
    {
        System.out.println("step1");
        return "admin_dashboard";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return "user_success";
    }


    //Add doctor
    private AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/doctor")
    public Doctor addDoctor(@RequestBody Doctor doctor){
        System.out.println("doctor detauils"+doctor.toString());
        Doctor doc =  adminService.adddoctor(doctor);
        return doc;
    }
//    public String addDoctor(@RequestBody Doctor doctor){
//        String userId =  adminService.adddoctor(doctor);
//        return " Doctor userId :  " + userId;
//    }

    //If want to view all doctors
//    @GetMapping("/viewdoctor")
//    public List<Doctor> viewDoctor(){
//
//        System.out.println(adminService.viewDocrtor());
//        return adminService.viewDocrtor();
//    }


}
