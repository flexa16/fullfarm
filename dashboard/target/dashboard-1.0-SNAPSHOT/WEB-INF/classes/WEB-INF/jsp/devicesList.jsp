<%--
  Created by IntelliJ IDEA.
  User: flexa
  Date: 23.09.2019
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="header.jsp"/>
<div class="row">
    <div class="col-3">
        <div class="nav flex-column nav-pills" id="v-pills-tab" role="tablist" aria-orientation="vertical">
            <a class="nav-link active" id="dispenser" data-toggle="pill" href="#v-pills-dispenser" role="tab"
               aria-controls="v-pills-dispenser" aria-selected="true">Dispensers</a>
            <a class="nav-link" id="filter" data-toggle="pill" href="#v-pills-filter" role="tab"
               aria-controls="v-pills-filter" aria-selected="false">Filters</a>
            <a class="nav-link" id="flower-sensor" data-toggle="pill" href="#v-pills-flower-sensor" role="tab"
               aria-controls="v-pills-flower-sensor" aria-selected="false">Flower sensors</a>
            <a class="nav-link" id="heater" data-toggle="pill" href="#v-pills-heater" role="tab"
               aria-controls="v-pills-heater" aria-selected="false">Heaters</a>
            <a class="nav-link" id="lamp" data-toggle="pill" href="#v-pills-lamp" role="tab"
               aria-controls="v-pills-lamp" aria-selected="false">Lamps</a>
            <a class="nav-link" id="pump" data-toggle="pill" href="#v-pills-pump" role="tab"
               aria-controls="v-pills-pump" aria-selected="false">Pumps</a>
        </div>
    </div>
    <div class="col-9">

        <div class="tab-content" id="v-pills-tabContent">
            <div class="tab-pane fade show active" id="v-pills-dispenser" role="tabpanel"
                 aria-labelledby="v-pills-home-tab">

                <c:forEach var="dispenser" items="${dispenser}">

                <c:out value="${dispenser}"/><p>

                </c:forEach>
            </div>
            <div class="tab-pane fade" id="v-pills-filter" role="tabpanel" aria-labelledby="v-pills-profile-tab">
                <c:forEach var="filter" items="${filter}">
                <c:out value="${filter}"/><p>
                </c:forEach>
            </div>
            <div class="tab-pane fade" id="v-pills-flower-sensor" role="tabpanel"
                 aria-labelledby="v-pills-messages-tab">
                <c:forEach var="flowerSensor" items="${flowerSensor}">
                <c:out value="${flowerSensor}"/><p>
                </c:forEach>
            </div>
            <div class="tab-pane fade" id="v-pills-heater" role="tabpanel" aria-labelledby="v-pills-settings-tab">
                <c:forEach var="heater" items="${heater}">
                <c:out value="${heater}"/><p>
                </c:forEach>
            </div>
            <div class="tab-pane fade" id="v-pills-lamp" role="tabpanel" aria-labelledby="v-pills-settings-tab">
                <c:forEach var="lamp" items="${lamp}">
                    <button class="btn btn-primary" type="button" data-toggle="collapse"
                            data-target="#<c:out value = "${lamp.getName()}"/>" aria-expanded="false"
                            aria-controls="<c:out value = "${lamp.getName()}"/>">
                        <c:out value="${lamp}"/><p>
                    </button>
                    </p>
                    <div class="collapse" id="<c:out value = "${lamp.getName()}"/>">
                        <div class="card card-body">
                            <c:forEach var="lampSensor" items="${lampSensor}">
                            <c:out value="${lampSensor}"/><p>
                            </c:forEach>
                        </div>
                    </div>


                </c:forEach>
            </div>
            <div class="tab-pane fade" id="v-pills-pump" role="tabpanel" aria-labelledby="v-pills-settings-tab">
                <c:forEach var="pump" items="${pump}">
                <c:out value="${pump}"/><p>
                </c:forEach>
            </div>
        </div>

    </div>
</div>

<jsp:include page="footer.jsp"/>
