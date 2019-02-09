package company.service;

import company.domain.RentCompany;

public interface RentCompanyService {

   RentCompany createNewCompany(String name, String website,

                                String address, String owner,

                                String logo);
   RentCompany addDepartmentToCompany();
   RentCompany removeDepartmentFromCompany();

}
