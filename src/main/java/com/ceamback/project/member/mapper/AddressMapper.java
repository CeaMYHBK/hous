package com.ceamback.project.member.mapper;

import com.ceamback.project.member.domain.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressMapper {

    public List<Address> selectAddressList(Address address);

    public Address selectAddressById(@Param("id") Long id);

    public int addAddress(Address address);

    public int editAddress(Address address);

    public int deleteAddressById(@Param("id") Long id);

    public int deleteAddressByIds(Long[] ids);
}
