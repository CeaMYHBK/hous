package com.ceamback.project.member.service;

import com.ceamback.project.member.domain.Address;

import java.util.List;

public interface AddressService {

    public List<Address> selectAddressList(Address address);

    public Address selectAddressById(Long id);

    public int addAddress(Address address);

    public int editAddress(Address address);

    public int deleteAddressById(Long id);

    public int deleteAddressByIds(Long[] ids);
}
