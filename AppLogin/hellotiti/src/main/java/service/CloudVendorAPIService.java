/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;


import enity.CloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author MSI2022
 */
@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    
    //CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId) {
            return  new CloudVendor("C1",
                    "Vendor 1",
                    "Address One",
                    "xxxx");
                   
    }
    //cloudVendor;
//    @PostMapping
//    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
//        this.cloudVendor = cloudVendor;
//        return "Cloud Vendor Created Successfully";
//    }
}
