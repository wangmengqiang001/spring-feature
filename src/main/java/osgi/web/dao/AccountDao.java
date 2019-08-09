package osgi.web.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

import osgi.web.dao.inf.AccountInfoDaoInf;
import osgi.web.models.TbAccount;


public class AccountDao implements AccountInfoDaoInf {
	
	private HibernateTemplate hibernateTemplate;
	
	public AccountDao(SessionFactory sessionFactory) {
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	
	/* (non-Javadoc)
	 * @see osgi.web.dao.jk#addAndUpdate(osgi.web.models.AccountInfo)
	 */
	@Override
	public void addAndUpdate(TbAccount accInf) {
		this.hibernateTemplate.save(accInf);
	}
	
	/* (non-Javadoc)
	 * @see osgi.web.dao.jk#remove(osgi.web.models.AccountInfo)
	 */
	@Override
	public void remove(TbAccount accInf) {
		this.hibernateTemplate.delete(accInf);
	}
	
	/* (non-Javadoc)
	 * @see osgi.web.dao.jk#queryById(int)
	 */
	@Override
	public TbAccount queryById(int nId) {
		TbAccount aci = null;
		
		List<?> listAci = (List<?>) this.hibernateTemplate.find("from TbAccount t  where t.id=?", nId);
		if(listAci.size() == 1) {
			aci = (TbAccount) listAci.get(0);
		}		
		return aci;
		
	}

}
