/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAOInterface;

import Beans.ContractBean;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public interface ContractDAOInterface {
    
    public void addContract(ContractBean contract);
    
    public ArrayList<ContractBean> getAllContracts();
    public ArrayList<ContractBean> getAllContractsByTenantID(int tenantid);
    public ArrayList<ContractBean> getAllContractsByDate(Date from, Date to);
    
    public ArrayList<ContractBean> getLeavingContracts();
}
