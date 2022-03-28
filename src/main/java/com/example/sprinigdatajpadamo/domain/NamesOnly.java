package com.example.sprinigdatajpadamo.domain;

import org.springframework.beans.factory.annotation.Value;

public interface NamesOnly {
    String getFirstname();

    String getLastname();

    @Value("#{target.firstname + ' ' + target.lastname}")
    String getFullName();

    @Value("#{@myBean.getEvoName(target)}")
    String getEvoName();

    AddressSummary getAddress();

    interface AddressSummary {
        String getCity();
    }
}
