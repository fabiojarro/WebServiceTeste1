package br.com.vectorx.teste1.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

import org.joda.time.DateTime;

import br.com.vectorx.teste1.regras.Calendario;
import br.com.vectorx.teste1.util.DataUtil;
import br.com.vectorx.teste1.ws.fault.DataException;

@WebService
public class CalendarWS {
	@WebMethod(operationName="VerificaDataNaoUtil")
	@WebResult(name="DataNaoUtil")
	public boolean isDataNaoUtil(@XmlElement(required=true) @WebParam(name="Data") String data) throws DataException{
		DateTime dateTime;
		try{
			dateTime = DataUtil.formataDataISOtoDateTime(data);
		}catch(Exception e){
			throw new DataException("A Conversão da Data Fallhou");
		}
		return Calendario.isDataValida(dateTime);
	}
	@WebMethod(operationName="RetornaProximaDataNaoUtil")
	@WebResult(name="ProximaDataUtil")
	public String getDataNaoUtil(){
		
		DateTime datetime = Calendario.getProximaDataNaoUtil(DateTime.now());
		return datetime.toString(DataUtil.FORMATO_ISO8601); 
		
	}	
}
