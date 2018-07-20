package com.cgs.pro94tek.healthcare.dataaccess.dao.impl;

import java.util.List;

import javax.transaction.Transactional;











import org.hibernate.Query;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import com.cgs.pro94tek.healthcare.bean.SpecialOfferDetails;
import com.cgs.pro94tek.healthcare.dataaccess.dao.SpecialofferdetailsDAO;
import com.cgs.pro94tek.healthcare.dataaccess.dao.support.CustomHibernateDaoSupport;
import com.cgs.pro94tek.utils.PmsUtil;





@Repository("spricalofferDAO")
public class SpecialofferdeatelsDAOImplements  extends CustomHibernateDaoSupport implements SpecialofferdetailsDAO {

	@SuppressWarnings("unchecked")
	@Transactional
	public SpecialOfferDetails getById(String speofferid) throws DataAccessException {
		// TODO Auto-generated method stub
		
		SpecialOfferDetails spdeta = null;
		String querySpOffer  = "from Specialofferdetails where id = :speofferid";
			System.out.println("get data by Specialofferdeatils id............:"+querySpOffer);
			Query hquery=getSession().createQuery(querySpOffer);
			/*Query query = getSession().createQuery(querySpOffer);*/
			hquery.setParameter("speofferid", Long.parseLong(speofferid));
			List<SpecialOfferDetails> spdetas = hquery.list();
			if (PmsUtil.isCollectionNotEmpty(spdetas)) {
				spdeta = spdetas.get(0);
			}
			return spdeta;
	

	
	}

}

