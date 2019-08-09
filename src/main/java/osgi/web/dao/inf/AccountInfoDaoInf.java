package osgi.web.dao.inf;

import osgi.web.models.AccountInfo;
import osgi.web.models.TbAccount;

public interface AccountInfoDaoInf {

	void addAndUpdate(TbAccount accInf);

	void remove(TbAccount accInf);

	TbAccount queryById(int nId);

}