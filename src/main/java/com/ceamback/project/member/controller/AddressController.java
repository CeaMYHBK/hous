package com.ceamback.project.member.controller;

import com.ceamback.framework.web.controller.BaseController;
import com.ceamback.framework.web.domain.AjaxResult;
import com.ceamback.framework.web.page.TableDataInfo;
import com.ceamback.project.member.domain.Address;
import com.ceamback.project.member.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member/address")
public class AddressController extends BaseController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/list")
    public TableDataInfo list(Address address){
        startPage();
        List<Address> list=addressService.selectAddressList(address);
        return getDataTable(list);
    }

    @GetMapping("/{addressId}")
    public AjaxResult selectAddressById(@PathVariable Long addressId){
        return AjaxResult.success(addressService.selectAddressById(addressId));
    }

    @PostMapping
    public AjaxResult add(@Validated @RequestBody Address address){
        return toAjax(addressService.addAddress(address));
    }

    @PutMapping
    public AjaxResult edit(@Validated @RequestBody Address address){
        return toAjax(addressService.editAddress(address));
    }

    @DeleteMapping("/{addressIds}")
    public AjaxResult delete(@PathVariable Long[] addressIds){
        return toAjax(addressService.deleteAddressByIds(addressIds));
    }

}
