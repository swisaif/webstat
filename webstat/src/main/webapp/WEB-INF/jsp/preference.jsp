<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

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
    <script type="text/javascript">
        function CheckColors(val){
            var element=document.getElementById('perso');
            if(val=='Personnalisée')
                element.style.display='block';
            else
                element.style.display='none';
        }

    </script>
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
                     <%Boolean test2;
                    test2=request.isUserInRole("ADMIN");
                    if(test2){
                    
                    %>
                        <a href="#subPages" data-toggle="collapse" data-target="#subPages6" class="collapsed"><i class="lnr lnr-chart-bars"></i> <span>Statistique</span> <i class="icon-submenu lnr lnr-chevron-left"></i></a>
                        <div id="subPages6" class="collapse ">
                            <ul class="nav">
                             <li><a href="/3383" class="">Utilisation de TPE</a></li>
                                <li><a href="/serveur" class="">Le nbr utilisation par region</a></li>

                            </ul>
                        </div>
                    </li>
<%} %>

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
                                <li><a href="#" class="">Préférences</a></li>
                            </ul>
                        </div>
                    </li>






                    <%Boolean test;
                    test=request.isUserInRole("ADMIN");
                    if(test){
                    
                    %> 


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

                     <%} %>

















                    <!--

                    <li><a href="notifications.html" class=""><i class="lnr lnr-user"></i> <span>Administration</span></a></li>-->
                    <li>
                        <a href="#" data-toggle="collapse" data-target="#subPages3" class="collapsed"><i class="lnr lnr-magic-wand"></i> <span>Qualité de services</span> <i class="icon-submenu lnr lnr-chevron-left"></i></a>
                        <div id="subPages3" class="collapse ">
                            <ul class="nav">
                                <li><a href="/preference" class="">Performances</a></li>
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
        <!-- MAIN CONTENT -->
        <div class="main-content">
            <div class="container-fluid">
                <!-- OVERVIEW -->
                <div class="panel panel-headline">
                    <div class="panel-body">
                        <!-- Example single danger button -->
                        <!-- Latest compiled and minified CSS -->
                        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.4/css/bootstrap-select.min.css">

                        <!-- Latest compiled and minified JavaScript -->
                        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.4/js/bootstrap-select.min.js"></script>

                        <!-- (Optional) Latest compiled and minified JavaScript translation files -->
                        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.4/js/i18n/defaults-*.min.js"></script>
                        


<div class="form-check">
                          <a href="/recherche" class=""><button type="submit" class="btn btn-success btn-block" >Recherche detaillé</button>
</a>
                        </div>

<form:form action="/wiw" method="post">

                        
                             <center>  <hr><strong> <h3>Minimiser les champs  :</h3></strong> <hr> </center>                         



    
    


   


                        

<center>
                        <table id="thetable2" cellspacing="0">


                        <div class="form-check form-check-inline">
                            <tr> <td><label class="form-check-label">
                                <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="date" name="c"> Date
                            </label></td>
                            <td><label class="form-check-label">
                                <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Contrat" name="c5"> Contrat
                            </label></td>
                           <td> <label class="form-check-label">
                                <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Modulation" name="c9"> Modulation
                            </label></td>
                            <td><label class="form-check-label">
                                <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="Msg émis" name="c12"> Msg émis
                            </label></td>
                             </tr>
                        </div>
                        <div class="form-check form-check-inline">
                          <tr> <td> <label class="form-check-label">
                                <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="origine" name="c2"> Origine
                            </label></td>
                           <td> <label class="form-check-label">
                                <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Version" name="c6"> Version
                            </label></td>
                           <td> <label class="form-check-label">
                                <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Vitesse" name="c10"> Vitesse
                            </label></td>
                            <td><label class="form-check-label">
                                <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="Octets reçu" name="c13"> Octets reçu
                            </label></td></tr>
                        </div>
                        <div class="form-check form-check-inline">
                             <tr> <td><label class="form-check-label">
                                <input class="form-check-input" type="checkbox" id="inlineCheckbox3" value="destination" name="c3"> Destination
                            </label></td>
                           <td> <label class="form-check-label">
                                <input class="form-check-input" type="checkbox" id="inlineCheckbox3" value="Opération" name="c7"> Opération
                            </label></td>
                            <td> <label class="form-check-label">
                                <input class="form-check-input" type="checkbox" id="inlineCheckbox3" value="Msg reçu" name="c11"> Msg reçu
                            </label></td>
                           <td> <label class="form-check-label">
                                <input class="form-check-input" type="checkbox" id="inlineCheckbox3" value="Octets émis" name="c14"> Octets émis
                            </label></td></tr>
                        </div>
 <div class="form-check form-check-inline">
                            <tr> <td> <label class="form-check-label">
                                <input class="form-check-input" type="checkbox" id="inlineCheckbox3" value="Centre acquéreur" name="c4"> Centre acquéreur	
                            </label></td>
                                                        <td> <label class="form-check-label">
                                <input class="form-check-input" type="checkbox" id="inlineCheckbox3" value="Durée" name="c8"> Durée
                            </label></td>
                                            <td> <label class="form-check-label">
                                <input class="form-check-input" type="checkbox" id="inlineCheckbox3" value="Status 1" name="c15"> Status 1
                            </label></td>
                            <td><label class="form-check-label">
                                <input class="form-check-input" type="checkbox" id="inlineCheckbox3" value="Status 2" name="c16"> Status 2
                            </label></td></tr></table>
                            </center>
                        </div>
                        <br>
                        
                    <button type="submit" class="btn btn-primary btn-block">Exécuter la requête</button>
</form:form>


                        <script type="text/javascript" src="static/jquery/jquery-1.8.3.min.js" charset="UTF-8"></script>
                        <script type="text/javascript" src="static/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
                        <script type="text/javascript" src="static/js/jsbootstrap-datetimepicker.fr.js" charset="UTF-8"></script>
                        <script type="text/javascript">
                            $('.form_datetime').datetimepicker({
                                //language:  'fr',
                                weekStart: 1,
                                todayBtn:  1,
                                autoclose: 1,
                                todayHighlight: 1,
                                startView: 2,
                                forceParse: 0,
                                showMeridian: 1
                            });
                            $('.form_date').datetimepicker({
                                language:  'fr',
                                weekStart: 1,
                                todayBtn:  1,
                                autoclose: 1,
                                todayHighlight: 1,
                                startView: 2,
                                minView: 2,
                                forceParse: 0
                            });
                            $('.form_time').datetimepicker({
                                language:  'fr',
                                weekStart: 1,
                                todayBtn:  1,
                                autoclose: 1,
                                todayHighlight: 1,
                                startView: 1,
                                minView: 0,
                                maxView: 1,
                                forceParse: 0
                            });
                        </script>

















































                        <!-- datepicker-->



                    </div>
                </div>

























































                <!-- END MAIN -->
    <div class="clearfix"></div>
    <footer>
        <div class="container-fluid">
            <p class="copyright">&copy; 2018 All Rights Reserved.</p>
        </div>
    </footer>
</div>
<!-- END WRAPPER -->
<!-- Javascript -->
<script src="static/vendor/jquery/jquery.min.js"></script>
<script src="static/vendor/bootstrap/js/bootstrap.min.js"></script>
<script src="static/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<script src="static/vendor/jquery.easy-pie-chart/jquery.easypiechart.min.js"></script>
<script src="static/vendor/chartist/js/chartist.min.js"></script>
<script src="static/scripts/klorofil-common.js"></script>

</body>
</html>
