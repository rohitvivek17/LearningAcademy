<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script> </head>

</head>
<body>
	<%@ include file="./Basic/Header.jsp" %> 
	 <h1>Welcome! Admin</h1>
    <p>You have successfully logged in.</p>
    <div class="container-fluid">
              <div class="row">
                     <div class="col-md-3">
                            <div class="col-md-12 b">                           
                                   <div class="col-md-12 b2">
                                          Admin
                                   </div>
                                          <a href="">Add Admin</a><br>
                                          <a href="">Edit Master List</a> <br>                           
                                  </div>
                           <div class="col-md-12 b">  
                           
                            <div class="col-md-12 b2">
                                   Teacher
                            </div>
                                   <a href="">Assign Teacher</a><br>
                                   <a href="">Add Teacher</a> <br> 
                                   <a href="">Edit Teacher</a> <br> 
                           </div>
                           <div class="col-md-12 b">                           
                            <div class="col-md-12 b2">
                                   Class
                            </div>
                                   <a href="">Add Class</a> <br> 
                                   <a href="">Assign Class</a><br>
                                                             
                           </div>
                           <div class="col-md-12 b">                           
                            <div class="col-md-12 b2">
                                   Student
                            </div>
                                   <a href="Student.jsp"> Add Students List</a> <br> 
                                   <a href="">Edit Students List</a><br>
                                   <a href="">View Students List</a><br>
                           </div>
                            
                         </div>
                     <div class="col-md-9"></div>
              </div>
       </div>                     
                            
       
</body>
</html>