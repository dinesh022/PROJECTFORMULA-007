<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/header.jsp" %>

<div class="container wrapper">
     <div class="container">
        <div class="page-header">
            <h1>All products</h1>
            
            <p class="lead">Check out all the products available now!</p> 
        </div>
        
        <table class="table table-striped table-hover">
             <thead>
             <tr class="bg-success">
                <th>Photo Image</th>
                <th>Product Name</th>
                <th>Category</th>
                <th>Condition</th>
                <th>Price</th>
             </tr>
             </thead>   
             <c:forEach items="${proudcts}"  var="product">
             <tr>
                 <td><img src=""  alt="image"/></td>
                 <td>${product.photoImage}</td>
                 <td>${product.proudctName}</td>
                 <td>${product.proudctCategory}</td>
                 <td>${product.proudctCondition}</td>
                 <td>${product.proudctPrice}INR</td>
                 <td><span class="glyphicon glyphicon-info-sign"></span></td>
             </tr> 
             </c:forEach>   
        </table>
        
   </div>

</div>