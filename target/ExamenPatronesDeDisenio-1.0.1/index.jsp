<%-- 
    Document   : index
    Created on : 14-05-2023, 5:58:07
    Author     : Robinson concha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"/>
 <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css" rel="stylesheet">
<link rel = "stylesheet" href ="estilos.css">
<title>Login</title>
</head>
<body>
<div class="container col-lg-4">
<form action="principal.jsp" method="post">
  <div class="form-group">
      <center><img src="img/preonline.jpeg"style="border-radius:50%"margin-top="100px"></center><br>
  <p style="text-align:center"><strong> Previsiones en Linea PreOnline</strong></p>
  </div>
  <div class="form-group">
  <label>Usuario:</label>
  <input class="form-control" type="text" id="username" name="username" placeholder="Ingrese usuario">
  </div>
   <div class="form-group">
  <label>Correo Electronico:</label>
  <input class="form-control" type="email" id="email" name="email" placeholder="usuario@email.cl">
  </div><br>
  <input class="btn btn-success btn-block" type="submit" id="accion"name="accion" value="ingresar">
</form>
</div>
<script>
//function.js
</script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"></script>
</body>
</html>