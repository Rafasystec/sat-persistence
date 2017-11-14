package br.com.barcadero.local.persistence;

import java.sql.SQLException;

import org.h2.tools.Console;

public class H2EngineConsole {
	
	public static void main(String[] args) {
		try {
			Console.main(null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
