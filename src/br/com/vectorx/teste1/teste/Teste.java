package br.com.vectorx.teste1.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.Days;

import br.com.vectorx.teste1.dao.ITbanoDao;
import br.com.vectorx.teste1.dao.impl.TbanoDaoImpl;
import br.com.vectorx.teste1.entidade.Tbano;
import br.com.vectorx.teste1.entidade.Tbdata;
import br.com.vectorx.teste1.entidade.Tbtipo;
import br.com.vectorx.teste1.util.JpaUtil;

public class Teste {
 public static void main(String[] args) {
	 
//	EntityManager manager = new JpaUtil().getEntityManager();
	
//	Query query = manager.createQuery("select tb from Tbdata tb");
//	
//	List<Tbdata> datas = query.getResultList();
//	for (Tbdata data : datas) {
//        System.out.println("Ano ..: " + data.getTbano().getAno());
//        System.out.println("Tipo ..: " + data.getTbtipo().getDescricao());
//        System.out.println("Data ..: " + data.getDatafim().getTime());
//    }
//	manager.getTransaction().begin();
//	manager.persist(tbano);
//	manager.getTransaction().commit();
	
//	Tbdata tbdata = new Tbdata();
//	tbdata.setDescricao("Feriado de Teste");
//	tbdata.setTbano(manager.find(Tbano.class, 1));
//	tbdata.setTbtipo(manager.find(Tbtipo.class,1));
//	tbdata.setDatafim(DateTime.now().toCalendar(Locale.getDefault()));
//	tbdata.setDatainicio(DateTime.now().toCalendar(Locale.getDefault()));
//
//	manager.getTransaction().begin();
//	manager.persist(tbdata);
//	manager.getTransaction().commit();
	
//	manager.close();
	
	Calendar calendar= Calendar.getInstance();
	DateTime dateTime = new DateTime(calendar);
	System.out.println(dateTime.toString("yyyy-MM-dd'T'HH24:mm:ss"));
	
//	ITbanoDao dao = new TbanoDaoImpl();
//	Tbano tbano = dao.buscaPorAno(2015);
//	
//	System.out.println(tbano.getId());
	
	DateTime djt1 = new DateTime(1320262729068L);
	System.out.println(djt1);
	 
	DateTime djt2 = new DateTime(1320362729068L);
	System.out.println(djt2);
	 
	
	System.out.println(djt2.isAfter(djt1));
	

}
}
