package com.example.RestDemo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestDemo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    CloudVendor oCloudVendor;
    
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return oCloudVendor;
        /* new CloudVendor("C1","Vendor 1","Address One","xxxxx"); */
    }

    @PostMapping
    public String creatCloudVendor(@RequestBody CloudVendor oCloudVendor){
        this.oCloudVendor = oCloudVendor;
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor oCloudVendor){
        this.oCloudVendor = oCloudVendor;
        return "Cloud Vendor Updated Successfully"; 
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendor(String vendorId){
        this.oCloudVendor = null;
        return "Cloud Vendor Deleted Successfully";
    }

}

