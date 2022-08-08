package desafio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import desafio.entidades.CasaNova;
import desafio.interfaces.ICrud;
import desafio.utilidades.Conexao;

public class DaoCasaNova implements ICrud<CasaNova>{

	@Override
	public boolean salvar(CasaNova obj) {
		String sql = "insert into CasaNova (descricao, dimensao, comodo) values(?,?,?)";
		Connection con = Conexao.conectar();
		try {
			//aplicação --->> database
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, obj.getDescricao());
			stm.setString(2, obj.getDimensao());
			stm.setString(3, obj.getComodo());
			stm.execute();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		finally {
			Conexao.fechar();
		}
		return true;
	}

	@Override
	public boolean alterar(CasaNova obj) {
		String sql = "update CasaNova set " + 
				"descricao = ?," +
				"dimensao = ?," +
				"comodo = ?" +
				"where id = ?";
		Connection con = Conexao.conectar();
		try {
			//aplicação --->> database
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, obj.getDescricao());
			stm.setString(2, obj.getDimensao());
			stm.setString(3, obj.getComodo());
			stm.setInt(4, obj.getId());
			stm.execute();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		
		finally {
			Conexao.fechar();
		}
		
		return true;
	}

	@Override
	public void excluir(int id) {
		String sql = "delete from CasaNova where id = " + id;
		Connection con = Conexao.conectar();
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.execute();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			Conexao.fechar();
		}
		
	}

	@Override
	public CasaNova consultar(int id) {
		CasaNova CasaNova = new CasaNova();
		String sql = "select * from CasaNova where id = " + id; 
		Connection con = Conexao.conectar();
		
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			if(rs.next()) {
				CasaNova.setId(rs.getInt("id"));
				CasaNova.setDescricao(rs.getString("descricao"));
				CasaNova.setDimensao(rs.getString("dimensao"));
				CasaNova.setComodo(rs.getString("comodo"));
				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			}
		finally {
			Conexao.fechar();
		}
		
		return CasaNova;
	}

	@Override
	public List<CasaNova> consultar() {
		List<CasaNova> Itens_CasaNova = new ArrayList<>();
		String sql = "select * from CasaNova";
		Connection con = Conexao.conectar();
		try {
			//aplicação <<---- database
			PreparedStatement stm = con.prepareStatement(sql);
			ResultSet rs = stm.executeQuery(); 
			while(rs.next()) {
				CasaNova CasaNova = new CasaNova();
				CasaNova.setId(rs.getInt("id"));
				CasaNova.setDescricao(rs.getString("descricao"));
				CasaNova.setDimensao(rs.getString("dimensao"));
				CasaNova.setComodo(rs.getString("comodo"));
				Itens_CasaNova.add(CasaNova);
				
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			Conexao.fechar();
		}
		return Itens_CasaNova;
	}

}