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
    <link rel="stylesheet" href="static/css/table.css" />

    <!-- FOR DEMO PURPOSES ONLY. You should remove this in your project -->
    <link rel="stylesheet" href="static/css/demo.css">
    <!-- GOOGLE FONTS -->
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">
    <!-- ICONS -->
    <link rel="apple-touch-icon" sizes="76x76" href="static/img/apple-icon.png">
    <link rel="icon" type="image/png" sizes="96x96" href="static/img/favicon.png">



    <style>
        body { background-color:#f7f7f7; font-family:'Open Sans';}
        .scroll{
            overflow:scroll;
            max-width:100%;
            position:relative;
        }


    </style>
    <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>

    <script  src="static/js/colResizable-1.6.js"></script>
    <script type="text/javascript">
        $(function(){


            $("#normal").colResizable({
                liveDrag:true,
                gripInnerHtml:"<div class='grip'></div>",
                draggingClass:"dragging",
                resizeMode:'fit'
            });

            $("#flex").colResizable({
                liveDrag:true,
                gripInnerHtml:"<div class='grip'></div>",
                draggingClass:"dragging",
                resizeMode:'flex'
            });


            $("#overflow").colResizable({
                liveDrag:true,
                gripInnerHtml:"<div class='grip'></div>",
                draggingClass:"dragging",
                resizeMode:'overflow'
            });


            $("#disabled").colResizable({
                liveDrag:true,
                gripInnerHtml:"<div class='grip'></div>",
                draggingClass:"dragging",
                resizeMode:'overflow',
                disabledColumns: [2]
            });


        });
    </script>

</head>
<body>
<!-- WRAPPER -->
<div id="wrapper">
    <!-- NAVBAR -->
    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="brand">
            <a href="/"><img src="static/img/logg.png" alt="Klorofil Logo" class="img-responsive logo"></a>
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
    <!-- END NAVBAR -->
    <!-- LEFT SIDEBAR -->
    <div id="sidebar-nav" class="sidebar">
        <div class="sidebar-scroll">
            <nav>
                <ul class="nav">
                    <li><a href="index.html" class="active"><i class="lnr lnr-home"></i> <span>Dashboard</span></a></li>

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
                                <li><a href="/recherche" class="">Journée d'hier</a></li>
                                <li><a href="#" class="">Mois en cours</a></li>
                                <li><a href="#" class="">Mois précédent</a></li>
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
                                <li><a href="#" class="">Numéros</a></li>
                                <li><a href="#" class="">Utilisateurs</a></li>
                                <li><a href="#" class="">SDAs</a></li>
                                <li><a href="#" class="">Règles Tarifiaires</a></li>

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
            <div class="panel-body">
                <br/>
                <br/>
                <!-- TEST -->
                <div class="center" >
                    <h1>jQuery colResizable Basic Demos</h1>
                    <div class="jquery-script-ads" style="margin:30px auto"><script type="text/javascript"><!--
                    google_ad_client = "ca-pub-2783044520727903";
                    /* jQuery_demo */
                    google_ad_slot = "2780937993";
                    google_ad_width = 728;
                    google_ad_height = 90;
                    //-->
                    </script>
                        <script type="text/javascript"
                                src="http://pagead2.googlesyndication.com/pagead/show_ads.js">
                        </script></div>

                    <p><strong>resizeMode: 'overflow'</strong> columns are sized independently. Table width can exceed its container </p>
                    <div class="scroll">
                        <table id="overflow" width="100%" border="0" cellpadding="0" cellspacing="0">
                            <tr>

                                <td>Date</td>
                                <td>Origine</td>
                                <td>Destination</td>
                                <td>Centre acquéreur</td>
                                <td>Contrat</td>

                                <td>Version</td>
                                <td>Opération</td>
                                <td>Durée</td>
                                <td>Modulation</td>
                                <td>Vitesse</td>
                                <td>Msg reçu</td>
                                <td>Msg émis</td>
                                <td>Octets reçu</td>
                                <td>Octets émis</td>
                                <td>Status 1</td>
                                <td>Status 2</td>



                            </tr>
                            <c:forEach var = "list" items = "${lists}">
                                <tr>
                                    <td>${list.ope_date}</td>
                                    <td>${list.ope_serveur}</td>
                                    <td>${list.opeSda}</td>
                                    <td>${list.ope_adresse}</td>
                                    <td>${list.ope_contrat}</td>
                                    <td>${list.ope_version}</td>
                                    <td>${list.ope_operation}</td>
                                    <td>dddd</td>
                                    <td>${list.ope_modulation}</td>
                                    <td>${list.ope_vitesse}</td>
                                    <td>${list.ope_msgsrx}</td>
                                    <td>${list.ope_msgstx}</td>
                                    <td>${list.ope_octetsrx}</td>
                                    <td>${list.ope_octetstx}</td>
                                    <td>${list.ope_stat_date}</td>
                                    <td>${list.ope_stat_heure}</td>

                                </tr>
                            </c:forEach>
                        </table>

                    </div>


                </div>


                <!-- TEST -->

            </div>
        </div>
        <!-- END MAIN CONTENT -->
    </div>
    <!-- END MAIN -->
    <div class="clearfix"></div>
    <footer>
        <div class="container-fluid">
            <p class="copyright">&copy; 2017 All Rights Reserved.</p>
        </div>
    </footer>
</div>
<!-- END WRAPPER -->
<!-- Javascript -->
<script src="static/vendor/bootstrap/js/bootstrap.min.js"></script>
<script src="static/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<script src="static/vendor/jquery.easy-pie-chart/jquery.easypiechart.min.js"></script>
<script src="static/vendor/chartist/js/chartist.min.js"></script>
<script src="static/scripts/klorofil-common.js"></script>
<script type="text/javascript" src="static/jquery/jquery.tablescroll.js"></script>

<script type="text/javascript">

    var _gaq = _gaq || [];
    _gaq.push(['_setAccount', 'UA-36251023-1']);
    _gaq.push(['_setDomainName', 'jqueryscript.net']);
    _gaq.push(['_trackPageview']);

    (function() {
        var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
        ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
        var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
    })();

</script>
</body>
</html>
