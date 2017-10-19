<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<html>
<div class="row">

  <div class="header">
    <ul class="breadcrumb">
      <li>TOP<span class="divider">&gt;</span></li>
      <li>STOCK<span class="divider">&gt;</span></li>
      <li>UPDATE<span class="divider">&gt;</span></li>
      <li>UPDATE CONFIRM</li>
    </ul>
  </div>

  <div class="row">

    <div class="span2"></div>
    
    <div class="span8">
      <div class="text-center">
        <h4>please, check update information...</h4>
      </div>
      
      <form id="stockUpdateForm" class="text-center" action="/aris/stock/update" method="post">
        <table class="table table-condensed update-confirm">
          <tr>
            <td><label for="dvdEanCode" class="text-right">DVD EAN CODE　:　</label></td>
            <td>4988142580726</td>
          </tr>
          <tr>
            <td><label class="text-right" for="dvdTitle">DVD TITLE　:　</label></td>
            <td>Die Hard 4.0</td>
          </tr>
          <tr>
            <td><label class="text-right" for="warehouseId">WAREHOUSE ID　:　</label></td>
            <td>TKY001</td>
          </tr>
          <tr>
            <td><label class="text-right" for="warehouseName">WAREHOUSE NAME　:　</label></td>
            <td>Shibuya 1st warehouse</td>
          </tr>
          <tr>
            <td><label for="warehouseAddress" class="text-right">WAREHOUSE ADDRESS　:　</label></td>
            <td>Udagawatyou 123-444-567, Shibuyaku, Tokyo</td>
          </tr>
          <tr>
            <td><label for="warehouseTel" class="text-right">WAREHOUSE TEL　:　</label></td>
            <td>03-1234-5678</td>
          </tr>
          <tr>
            <td><label for="quantity" class="text-right">QUANTITY　:　</label></td>
            <td>1000</td>
          </tr>
        </table>
        
        <a href="../stock/updateInput.html" class="btn"><i class="icon-arrow-left icon"></i>&nbsp; Return</a>
        <a href="../stock/updateComplete.html" class="btn btn-danger"><i class="icon-ok-sign icon-white icon"></i>&nbsp; Update</a>
      </form>
    
    </div>
    
    <div class="span2"></div>
  </div>  
</div>
</html>