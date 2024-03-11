<%-- 
    Document   : ListadoUsuarios
    Created on : 14-05-2023, 6:00:04
    Author     : Robinson Concha
--%>
<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="com.iplacex.categorias.Categoria"%>
<%@page import="com.iplacex.dao.LoginDao"%>
<%@page import="com.iplacex.strategy.Usuario"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

    <head>
    <title>Crud Usuarios</title>
    <!-- Bootstrap -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css" rel="stylesheet">
    <link rel="stylesheet" href="estiloTabla.css">
    </head> 
   <style>
    body{
        margin: auto;
        padding: auto;
        background-color: gainsboro;}
    

    table,th,td{
            border:2px solid black;
            margin-top: 0px;
         }
    </style>
    <body>
    <center>
        <div class="center">
           <h1>Previsiones en Linea PreOnline</h1>
           
           <input type="submit" class="form-control" value="Actualizar" href="principal.jsp">
           <input type="text" class="form-control" name="txtBuscar" placeholder="Buscar...">
           <input type="submit" class="form-control" value="Buscar Usuario"><br><br>
          
           <table width="900px" height="400px">
               <tr></tr><br>
               <td colspan="12" align="center" style="background-color: greenyellow">Listado Usuarios PreOnline</td> 
           <tr></tr>
           <td colspan="12" align="center"style="background-color:gold">Usuarios Registrados(Solo Demostración, Alumno: Robinson Concha, ramo: Patrones de Diseño, Año:3er Año)</td>
                    <tr>
                        <td style="background-color:yellowgreen">Id </td>
                        <td style="background-color:yellowgreen">Nombre </td>
                        <td style="background-color:yellowgreen">Apellido </td>
                        <td style="background-color:yellowgreen">Edad </td>
                        <td style="background-color:yellowgreen">Contribucion </td>
                        <td style="background-color:yellowgreen">Pension </td>
                        <td style="background-color:yellowgreen">AFP </td>
                        <td style="background-color:yellowgreen">Categoria </td>
                        <td style="background-color:yellowgreen"> Modificar</td>
                        <td style="background-color: red"> Eliminar</a></td>
                    </tr> 
                    <tr>
                        <td>00001</td>
                        <td>Robinson</td>
                        <td>Concha</td>
                        <td>40</td>
                        <td>50.000</td>
                        <td>500.000</td>
                        <td>Habitat</td>
                        <td>Afiliado</td>
                        <td><a href="#">Modificar</a></td>
                        <td><a href="#">Eliminar</a></td>
                    </tr>   
                     <tr>
                        <td>00002</td>
                        <td>Robinson</td>
                        <td>Concha</td>
                        <td>40</td>
                        <td>50.000</td>
                        <td>500.000</td>
                        <td>Habitat</td>
                        <td>Afiliado</td>
                        <td><a href="#">Modificar</a></td>
                        <td><a href="#">Eliminar</a></td>
                    </tr>   
                     <tr>
                        <td>00003</td>
                        <td>Robinson</td>
                        <td>Concha</td>
                        <td>40</td>
                        <td>50.000</td>
                        <td>500.000</td>
                        <td>Habitat</td>
                        <td>Afiliado</td>
                        <td><a href="#">Modificar</a></td>
                        <td><a href="#">Eliminar</a></td>
                    </tr>   
                     <tr>
                        <td>00004</td>
                        <td>Robinson</td>
                        <td>Concha</td>
                        <td>40</td>
                        <td>50.000</td>
                        <td>500.000</td>
                        <td>Habitat</td>
                        <td>Afiliado</td>
                        <td><a href="#">Modificar</a></td>
                        <td><a href="#">Eliminar</a></td>
                    </tr> 
                    <tr>
                        <td>00005</td>
                        <td>Robinson</td>
                        <td>Concha</td>
                        <td>40</td>
                        <td>50.000</td>
                        <td>500.000</td>
                        <td>Habitat</td>
                        <td>Afiliado</td>
                        <td><a href="#">Modificar</a></td>
                        <td><a href="#">Eliminar</a></td>
                    </tr>   
                     <tr>
                        <td>00006</td>
                        <td>Robinson</td>
                        <td>Concha</td>
                        <td>40</td>
                        <td>50.000</td>
                        <td>500.000</td>
                        <td>Habitat</td>
                        <td>Pensionado</td>
                        <td><a href="#">Modificar</a></td>
                        <td><a href="#">Eliminar</a></td>
                    </tr>   
                     <tr>
                        <td>00007</td>
                        <td>Robinson</td>
                        <td>Concha</td>
                        <td>40</td>
                        <td>50.000</td>
                        <td>500.000</td>
                        <td>Habitat</td>
                        <td>Excluido</td>
                        <td><a href="#">Modificar</a></td>
                        <td><a href="#">Eliminar</a></td>
                    </tr>   
                     <tr>
                        <td>00008</td>
                        <td>Robinson</td>
                        <td>Concha</td>
                        <td>40</td>
                        <td>50.000</td>
                        <td>500.000</td>
                        <td>Habitat</td>
                        <td>Afiliado</td>
                        <td><a href="#">Modificar</a></td>
                        <td><a href="#">Eliminar</a></td>
                    </tr> 
                    <tr>
                        <td>00009</td>
                        <td>Robinson</td>
                        <td>Concha</td>
                        <td>40</td>
                        <td>50.000</td>
                        <td>500.000</td>
                        <td>Habitat</td>
                        <td>Afiliado</td>
                        <td><a href="#">Modificar</a></td>
                        <td><a href="#">Eliminar</a></td>
                    </tr> 
                    <tr>
                        <td>000010</td>
                        <td>Robinson</td>
                        <td>Concha</td>
                        <td>40</td>
                        <td>50.000</td>
                        <td>500.000</td>
                        <td>Habitat</td>
                        <td>Afiliado</td>
                        <td><a href="#">Modificar</a></td>
                        <td><a href="#">Eliminar</a></td>
                    </tr> 
                    <td colspan="12" align="center" style="background-color: yellow">INGENIERIA INFORMÁTICA - IPLACEX TECNOLOGICO NACIONAL - 2023</td>
                    <tr></tr>
                    <td colspan="12" align="center" style="background-color: yellow">Nombre Docente: PABLO ANDRÉS LEMUS</td>
           </table><br>
           <li><a type="btn btn-btn succes" href="principal.jsp">Volver al Menú Principal</a></li>
        </center>
     </div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"></script>
</body>
</html>
