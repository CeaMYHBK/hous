package com.ceamback.project.member.service.impl;

import com.ceamback.project.member.domain.Address;
import com.ceamback.project.member.mapper.AddressMapper;
import com.ceamback.project.member.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<Address> selectAddressList(Address address) {
        return addressMapper.selectAddressList(address);
    }

    @Override
    public Address selectAddressById(Long id) {
        return addressMapper.selectAddressById(id);
    }

    @Override
    public int addAddress(Address address) {
        return addressMapper.addAddress(address);
    }

    @Override
    public int editAddress(Address address) {
        return addressMapper.editAddress(address);
    }

    @Override
    public int deleteAddressById(Long id) {
        return addressMapper.deleteAddressById(id);
    }

    @Override
    public int deleteAddressByIds(Long[] ids) {
        return addressMapper.deleteAddressByIds(ids);
    }
}
