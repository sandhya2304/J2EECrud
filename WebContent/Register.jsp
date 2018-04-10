<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<div class="container" align="center">

 <h1>Registration of an Employee!!!</h1>
  
  <form action="Registration" method="post">
    
     <pre>
        Id:       <input type="text" name="id" /> 
        
        Name:     <input type="text" name="name" /> 
        
        Address:  <input type="text" name="address" /> 
        
        Country: <select name="country">
                     <option>India</option>
                     <option>Nepal</option>
                     <option>Japan</option>
                      
                 </select>
     
     <input type="submit" value="submit" />  <input type="reset" value="reset" />
     </pre>
  

  </form>
    
</div>


</body>
</html>