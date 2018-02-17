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
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.4/css/bootstrap-select.min.css">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.4/js/bootstrap-select.min.js"></script>

        <!-- (Optional) Latest compiled and minified JavaScript translation files -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.4/js/i18n/defaults-*.min.js"></script>

        <div class="container">
            <br/>
            <div class="container">
                <div class="row">
                    <div class="col-md-10">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <h3 class="panel-title">Utilisateurs</h3>
                            </div>
                            <div class="panel-body">
                                <input type="text" class="form-control" id="dev-table-filter" data-action="filter" data-filters="#dev-table" placeholder="Filter Utilisateurs" />
                            </div>
                            <table class="table table-hover" id="dev-table">
                                <thead>
                                <tr>
                                    <th>Username</th>
                                    <th>Password</th>
                                    <th>Numéro</th>

                                    <th>Role</th>

                                    <th>Action</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var = "list" items = "${lists}">
                                    <tr class="first">
                                        <td>${list.username}</td>
                                        <td>${list.password}</td>
                                        <td>${list.usernumero}</td>

                                        <td>${list.ro.role}</td>


                                        <td>
                                            <div class="btn-group" role="group" aria-label="...">

                                                <a href="/deleteuserid/${list.user_id}"> <button type="button"><i class="glyphicon glyphicon-trash">
                                                </i></button></a>
                                            </div>

                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>

                            <div class="panel-body">
                                <form method="post" action="/saveeeee">
                                    <input type="hidden" name="user_id" value=""/>
                                    <b>Ajouter Utilisateur:</b><br><br>
                                    <div class="col-xs-2">
                                        <input type="text" name="username" placeholder="Username" class="form-control"/>
                                    </div>
                                    <div class="col-xs-3">

                                        <input type="text" name="password"placeholder="Password" class="form-control"/>
                                    </div>



                                    <div class="col-xs-3">

                                        <select name="user_numero" class="selectpicker show-tick">
                                            <!--

                                            <option>0001</option>
                                            <option>0002</option>
                                            <option>0003</option>
                                            <option>0004</option>
                                            <option>0005</option>
                                            <option>0006</option>
                                            <option>001</option>
                                            <option>002</option>
                                            <option>003</option>
                                            <option>004</option>
                                            <option>005</option>
                                            <option>006</option>
                                            <option>01</option>
                                            <option>02</option>
                                            <option>03</option>
                                            <option>04</option>
                                            <option>05</option>
                                            <option>06</option>
                                            <option>401</option>
                                            <option>402</option>
                                            <option>403</option>
                                            <option>404</option>
                                            <option>405</option>
                                            <option>406</option>
                                            -->
                                            <option>72100101</option>
                                            <option>72100102</option>
                                            <option>72100103</option>
                                            <option>72100104</option>
                                            <option>72100105</option>
                                            <option>72100106</option>
                                            <option>76001</option>
                                            <option>76002</option>
                                            <option>76003</option>
                                            <option>76004</option>
                                            <option>76005</option>
                                            <option>76006</option>

                                            <option>77100001</option>
                                            <option>77100002</option>
                                            <option>77100003</option>
                                            <option>77100004</option>
                                            <option>77100005</option>
                                            <option>77100006</option>
                                            <option>901</option>
                                            <option>902</option>
                                            <option>903</option>
                                            <option>904</option>
                                            <option>905</option>
                                            <option>906</option>
                                            <option>917</option>
                                            <option>918</option>
                                            <option>919</option>
                                            <option>3383</option>
                                            <option>3384</option>






                                        </select>
                                    </div>


                                    <div class="col-xs-3">

                                        <select name="rol" class="selectpicker show-tick">
                                            <option>ROLE_ADMIN</option>
                                            <option>ROLE_USER</option>
                                        </select>
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
