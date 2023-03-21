/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author patin
 */
public class ModuloConexao {

    //método responsavel por estabelecer a conexão com o banco
    public static Connection conector() {
        Connection conexao = null;

        //a linha abaixo chama o driver
        String driver = "com.mysql.cj.jdbc.Driver";


        //armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox?characterEncoding=utf-8";
        String user = "root";
        String password = "";
        
        //Estavelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //esclarecer erro
            //System.out.println(e);
            return null;
        }
    }
}
