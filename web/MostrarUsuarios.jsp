<%-- 
    Document   : MostrarUsuarios
    Created on : 13/11/2023, 02:20:37 PM
    Author     : Trabajo
--%>

<%@page import="java.util.List"%>
<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
       
        <%
        List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
        int cont = 1;
            for(Usuario usu : listaUsuarios){
                
           
        
       %>
       <p><b>Usuario N°<%=cont%> </b></p>
       <p>DPI : <%=usu.getDpi()%> </p>
         <p>Nombre : <%=usu.getNombre()%> </p>
           <p>Apellido : <%=usu.getApellido()%> </p>
             <p>Telefono : <%=usu.getTelefono()%> </p>
             <p>---------------------------------------</p>
             <% cont = cont +1;%>
        <%}%>
    </body>
</html>
