/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.modconta.dataaccess;

//import app.modconta.entity.Ctascontables;
import app.modconta.databaase.db;
import app.modconta.entity.Venta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
//import app.modconta.database.db;
//import app.modconta.entity.TipoCambio;

/**
 *
 * @author MARCELO
 */
public class VentaRepository implements IRepository<Venta>{
    
    private final db con;
    public VentaRepository ()
    { 
      this.con = new db();
    }
	@Override
	public void Create(Venta param) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Update(Venta param) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Delete(int id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Venta Find(int code) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Venta> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

    
}
