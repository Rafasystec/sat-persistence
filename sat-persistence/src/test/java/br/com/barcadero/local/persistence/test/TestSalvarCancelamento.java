package br.com.barcadero.local.persistence.test;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.barcadero.local.persistence.JPAPersistece;
import br.com.barcadero.local.persistence.dao.DaoCFeCancelamento;
import br.com.barcadero.local.persistence.model.CFeCancelamento;

public class TestSalvarCancelamento {

	@BeforeClass
	public static void init() {
		JPAPersistece.initPersistencia();
	}
	@Test
	public void deveSalvarOCancelamentoNoBancoLocal() {
		CFeCancelamento cFeCancelamento = new CFeCancelamento();
		cFeCancelamento.setArquivoBase64("arquivo em base 64");
		cFeCancelamento.setAssinaturaQrcode("assinatura qrcode");
		cFeCancelamento.setChaveConsulta("123456789987456123");
		cFeCancelamento.setCpfCnpjValue("isidjsndfonsiodnsohaoinipoaasjdpojaspojafpiajpojapsojfpoajf");
		cFeCancelamento.setCodCCCC("000");
		cFeCancelamento.setCodErroSAT("06000");
		cFeCancelamento.setCodSEFAZ("");
		cFeCancelamento.setMensagemSAT("EMITIDO COM SUCESSO MAIS CONTEUDO DAS NOTAS");
		cFeCancelamento.setNumeroSessao(""+new Random().nextInt(9999999));
		cFeCancelamento.setTimeStamp("21522156654654121");
		cFeCancelamento.setValorTotalCFe("10.00");
		DaoCFeCancelamento daoCFeCancelamento = new DaoCFeCancelamento();
		try {
			daoCFeCancelamento.insert(cFeCancelamento);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
