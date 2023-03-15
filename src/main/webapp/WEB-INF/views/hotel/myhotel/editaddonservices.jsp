<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%@ taglib prefix="mt" tagdir="/WEB-INF/tags" %>
<mt:hotelTemplate>
	<jsp:attribute name="content">
	
 <!-- Container-fluid starts-->
        <div class="container-fluid">
          <div class="row">

            <div class="col-12">
              <div class="row">
                <div class="col-sm-12">
                  <div class="card">
                    <div class="card-header">
                      <h5>Edit New Service</h5>
                    </div>
                    <div class="card-body">
                      <form class="theme-form mega-form" action="${pageContext.request.contextPath }/hotel/addonservices/createAddonService" method="POST">

                        <div class="mb-3">
                          <label class="form-label-title ">Service Name</label>
                          <input class="form-control" type="text" placeholder="Service Name" name="addonservicename" id="addonservicename" value="${addonservice.addonservicename }">
                          <span id="showservicenameerror"></span>                          
                        </div>
                        <div class="mb-3">
                          <label class="form-label-title ">Service Type</label>
                         <select class="form-control" name="servicetype">
                         <c:if test="${addonservice.servicetype == 'Extra Bed'}">
                         <option selected value="Extra Bed">Extra Bed</option>
							<option  value="Other Service">Other Service</option>
							<option  value="Late Check-out">Late Check-out</option>
                         </c:if>
						<c:if test="${addonservice.servicetype == 'Other Service'}">
                         <option  value="Extra Bed">Extra Bed</option>
							<option  selected value="Other Service">Other Service</option>
							<option  value="Late Check-out">Late Check-out</option>
                         </c:if>
                         
                         <c:if test="${addonservice.servicetype == 'Late Check-out'}">
                         <option  value="Extra Bed">Extra Bed</option>
							<option  value="Other Service">Other Service</option>
							<option  selected value="Late Check-out">Late Check-out</option>
                         </c:if>	
						</select>
                        </div>
                        <div class="mb-3">
                         <input type="hidden"  name="hotelid" value="${hotelid }">
                           <input type="hidden"  name="addonServiceId" value="${addonservice.addonserviceid }">
                          <label class="form-label-title ">Cost Price</label>
                          <input class="form-control" type="text" placeholder="CostPrice" name="netpriceprice" id="netprice" value="${addonservice.netprice }">
                           <span id="shownetpriceerror"></span>
                        </div>  
                        <div class="mb-3">
                          <label class="form-label-title ">Price</label>
                          <input class="form-control" type="text" placeholder="Price" name="price" id="price" value="${addonservice.price }">
                           <span id="showpriceerror"></span>
                        </div>  
                        <div class="card-footer text-end" id="showbuttonaddlatecheckout">
                      <button class="btn btn-primary me-3">Submit</button>
                    </div>                      
                      </form>
                    </div>
                    
                  </div>
                </div>

              </div>
            </div>
          </div>
        </div>
       <script>

       </script>

		</jsp:attribute>
</mt:hotelTemplate>