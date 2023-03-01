package com.com.LeandroCosta.appVendas.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.com.LeandroCosta.appVendas.domain.PagamentoComBoleto;

@Service
public class BoletoService {
	public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date instanteDoPedido) {
		Calendar  cal =Calendar.getInstance();
		cal.setTime(instanteDoPedido);
		cal.add(Calendar.DAY_OF_MONTH, 7);
		pagto.setDataVencimento(cal.getTime());
		// web service que gera um boleto com as datas 
	}

}
