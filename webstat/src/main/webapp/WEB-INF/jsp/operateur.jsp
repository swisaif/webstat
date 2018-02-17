<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Paynet</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- VENDOR CSS -->
    <link rel="stylesheet" href="static/vendor/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="static/vendor/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="static/vendor/linearicons/style.css">
    <link rel="stylesheet" href="static/vendor/chartist/css/chartist-custom.css">

    <!-- MAIN CSS -->
    <link rel="stylesheet" href="static/css/main.css">
    <!-- FOR DEMO PURPOSES ONLY. You should remove this in your project -->
    <link rel="stylesheet" href="static/css/demo.css">
    <link rel="stylesheet" href="static/css/style1.css">

    <!-- GOOGLE FONTS -->
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">
    <!-- ICONS -->
    <link rel="apple-touch-icon" sizes="76x76" href="static/img/apple-icon.png">
    <link rel="icon" type="image/png" sizes="96x96" href="static/img/favicon.png">
    <script>
        function myFunction() {
            alert("Under Construction");
        }
    </script>

    <link rel="stylesheet" type="text/css" href="static/css/jquery.tablescroll.css"/>


    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
<!-- WRAPPER -->
<div id="wrapper">
    <!-- NAVBAR -->
    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="brand">
            <a href="/home"><img src="static/img/logg.png" alt="Klorofil Logo" class="img-responsive logo"></a>
        </div>
        <div class="container-fluid">
            <div class="navbar-btn">
                <button type="button" class="btn-toggle-fullwidth"><i class="lnr lnr-arrow-left-circle"></i></button>
            </div>
            <div id="navbar-menu">
                <ul class="nav navbar-nav navbar-right">

                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="lnr lnr-question-circle"></i> <span>A propos</span> <i class="icon-submenu lnr lnr-chevron-down"></i></a>
                        <ul class="dropdown-menu">
                            <li><a href="#" onclick="myFunction()">Paynet</a></li>
                            <li><a href="#" onclick="myFunction()">Monétique</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src="static/img/user.png" class="img-circle" alt="Avatar"> <span>${name}</span> <i class="icon-submenu lnr lnr-chevron-down"></i></a>
                        <ul class="dropdown-menu">
                            <li><a href="#"><i class="lnr lnr-cog"></i> <span>Paramètres</span></a></li>
                            <li><a href="/logout"><i class="lnr lnr-exit"></i> <span>Déconnexion</span></a></li>
                        </ul>
                    </li>
                    <!-- <li>
                        <a class="update-pro" href="https://www.themeineed.com/downloads/klorofil-pro-bootstrap-admin-dashboard-template/?utm_source=klorofil&utm_medium=template&utm_campaign=KlorofilPro" title="Upgrade to Pro" target="_blank"><i class="fa fa-rocket"></i> <span>UPGRADE TO PRO</span></a>
                    </li> -->
                </ul>
            </div>
        </div>
    </nav>
    <br/>
    <br/>

    <!-- END NAVBAR -->
    <!-- LEFT SIDEBAR -->
    <div id="sidebar-nav" class="sidebar">
        <div class="sidebar-scroll">
            <nav>
                <ul class="nav">

                    <li>
                    
                        <a href="#subPages" data-toggle="collapse" data-target="#subPages6" class="collapsed"><i class="lnr lnr-chart-bars"></i> <span>Statistique</span> <i class="icon-submenu lnr lnr-chevron-left"></i></a>
                        <div id="subPages6" class="collapse ">
                            <ul class="nav">
                               <li><a href="/3383" class="">Utilisation de TPE</a></li>
                                <li><a href="/serveur" class="">Le nbr utilisation par region</a></li>

                            </ul>
                        </div>
                    </li>


                    <li>
                        <a href="#subPages" data-toggle="collapse" data-target="#subPages4"class="collapsed"><i class="lnr lnr-list"></i> <span>Général</span> <i class="icon-submenu lnr lnr-chevron-left"></i></a>
                        <div id="subPages4" class="collapse ">
                            <ul class="nav">
                                <li><a href="/hier" class="">Journée d'hier</a></li>
                                <li><a href="/moisencours" class="">Mois en cours</a></li>
                                <li><a href="/moisprecedent" class="">Mois précédent</a></li>
                            </ul>
                        </div>
                    </li>

                    <li>
                        <a href="#subPages" data-toggle="collapse" data-target="#subPages5" class="collapsed"><i class="lnr lnr-cog"></i> <span>Fonctions Avancées</span> <i class="icon-submenu lnr lnr-chevron-left"></i></a>
                        <div id="subPages5" class="collapse ">
                            <ul class="nav">
                                <li><a href="/recherche" class="">Recherche multi-critères</a></li>
                                <li><a href="#" class="">Détails des dernières opérations</a></li>
                                <li><a href="/preference" class="">Préférences</a></li>
                            </ul>
                        </div>
                    </li>






                    <li>
                        <a href="#subPages" data-toggle="collapse" data-target="#subPages2" class="collapsed"><i class="lnr lnr-user"></i> <span>Administration</span> <i class="icon-submenu lnr lnr-chevron-left"></i></a>
                        <div id="subPages2" class="collapse ">
                            <ul class="nav">
                                <li><a href="/oper" class="">Opérateurs</a></li>
                                <li><a href="/utilisateurs" class="">Utilisateurs</a></li>
                                <li><a href="/sda" class="">SDAs</a></li>

                            </ul>
                        </div>
                    </li>

















                    <!--

                    <li><a href="notifications.html" class=""><i class="lnr lnr-user"></i> <span>Administration</span></a></li>-->
                    <li>
                        <a href="#" data-toggle="collapse" data-target="#subPages3" class="collapsed"><i class="lnr lnr-magic-wand"></i> <span>Qualité de services</span> <i class="icon-submenu lnr lnr-chevron-left"></i></a>
                        <div id="subPages3" class="collapse ">
                            <ul class="nav">
                                <li><a href="#" class="">Performances</a></li>
                                <li><a href="#" class="">Incidents par terminal</a></li>
                            </ul>
                        </div>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
    <!-- END LEFT SIDEBAR -->
    <!-- MAIN -->
    <div class="main">

        <div class="container">
            <br/>
            <div class="container">
                <div class="row">
                    <div class="col-md-10">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <h3 class="panel-title">Opérateurs</h3>
                            </div>
                            <div class="panel-body">
                                <input type="text" class="form-control" id="dev-table-filter" data-action="filter" data-filters="#dev-table" placeholder="Filter Opérateurs" />
                            </div>
                            <table class="table table-hover" id="dev-table">
                                <thead>
                                <tr>
                                    <th>Opérateur</th>
                                    <th>Action</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var = "list" items = "${lists}">
                                    <tr>
                                        <td>${list.oper_name}</td>
                                        <td>
                                            <div class="btn-group" role="group" aria-label="...">

                                                <a href="/delete/${list.oper_id}"> <button type="button"><i class="glyphicon glyphicon-trash">
                                                </i></button></a>
                                                <a href="/edit/${list.oper_id}"><button type="button"><i class="glyphicon glyphicon-pencil">
                                                </i></button></a>

                                            </div>

                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>

                            <div class="panel-body">
                                <form method="post" action="/save">
                                    <input type="hidden" name="oper_id" value=""/>
                                    <b>Ajouter Opérateur:</b><br><br>
                                    <div class="col-xs-3">

                                        <input type="text" name="oper_name" placeholder="Opérateur" class="form-control"/>

                                    </div>


                                    <br/>
                                    <br/>
                                    <div class="col-xs-2">

                                    <button type="submit" class="btn btn-secondary">Ajouter</button>
                                    </div>
                                </form>
                            </div>









                        </div>
                    </div>
                </div>



            </div>

            <!-- END MAIN CONTENT -->
        </div>
        <!-- END MAIN -->
        <div class="clearfix"></div>
    </div>
    <!-- END WRAPPER -->
    <!-- Javascript -->
    <script src="static/js/javas.js"></script>

    <script src="static/vendor/jquery/jquery.min.js"></script>
    <script src="static/vendor/bootstrap/js/bootstrap.min.js"></script>
    <script src="static/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
    <script src="static/vendor/jquery.easy-pie-chart/jquery.easypiechart.min.js"></script>
    <script src="static/vendor/chartist/js/chartist.min.js"></script>
    <script src="static/scripts/klorofil-common.js"></script>

</body>
</html>
