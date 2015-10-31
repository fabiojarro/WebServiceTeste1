package br.com.vectorx.teste1.ws;

import javax.jws.WebService;

import org.joda.time.DateTime;

import br.com.vectorx.teste1.regras.Calendario;
import br.com.vectorx.teste1.util.DataUtil;

@WebService(endpointInterface="br.com.vectorx.teste1.ws.CalendarWS",serviceName="CalendarWS")
public class CalendarWS {
	
	public boolean isDataNaoUtil(String data){		
		return Calendario.isDataValida(DataUtil.formataDataISOtoDateTime(data));
	}

	public DateTime getDataNaoUtil(){
		return Calendario.getProximaDataNaoUtil(DataUtil.formataDataISOtoDateTime("2015-10-31T0024:00:00"));
	}
	
	public static void main(String[] args) {
		String data = "2015-11-04T1324:00:01";
		
		System.out.println(new CalendarWS().getDataNaoUtil().toString());
		
		System.out.println(new CalendarWS().isDataNaoUtil(data));
	}
	
}
