package company.service;

import company.domain.RentCompany;

public class RentCompanyServiceImpl implements RentCompanyService {
    @Override
    public RentCompany createNewCompany(String name, String website,

                                        String address, String owner,

                                        String logo) {

        RentCompany rentCompany =

                new RentCompany(name, website, address, owner, logo);

        return rentCompany;

    }

    @Override
    public RentCompany addDepartmentToCompany() {
        return null;
    }

    @Override
    public RentCompany removeDepartmentFromCompany() {

        return null;
    }
}
