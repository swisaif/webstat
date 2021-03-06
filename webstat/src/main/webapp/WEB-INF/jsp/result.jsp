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
      <link rel="stylesheet" href="static/vendor/chartist/css/chartist-custom.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css">
    
    <link rel="stylesheet" href="static/vendor/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="static/vendor/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="static/vendor/linearicons/style.css">
  
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
        <link rel="stylesheet" type="text/css" href="static/css/jquery.tablescroll.css"/>
        <link rel="stylesheet" type="text/css" href="static/css/jquery.tablescroll.css"/>
    
    
    <style>


        td {
            text-align: center;
            padding: 8px;
            font-weight: lighter;
        }


        th {
            background-color: #0A7BAB;
            color: white;
            text-align: center;
            padding: 8px;


        }
    </style>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>


</head>
<body>
<!-- WRAPPER -->
<div id="wrapper">
    <!-- NAVBAR -->
    <    <nav class="navbar navbar-default navbar-fixed-top">
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
                            <li><a href="http://www.monetiquetunisie.com/">Monétique</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src="static/img/user.png" class="img-circle" alt="Avatar"> <span>${name}</span> <i class="icon-submenu lnr lnr-chevron-down"></i></a>
                        <ul class="dropdown-menu">
                            <li><a href="#" onclick="myFunction()"><i class="lnr lnr-cog"></i> <span>Paramètres</span></a></li>
                            <li><a href="/logout"><i class="lnr lnr-exit"></i> <span>Déconnexion</span></a></li>
                        </ul>
                    </li>
                    <!-- <li>
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
                                <li><a href="/preference" class="">Préférences</a></li>
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
                <!-- TEST -->
               

               

                <div class="tablescroll">
                    <div id="table_wrapper">
                    
                    
   <table   class="display nowrap" cellspacing="0" width="100%" id="exemple">

<%    String etatCheckBox =""+request.getParameter( "c" )  ; 
String etatCheckBox2 =""+request.getParameter( "c2" )  ; 
String etatCheckBox3 =""+request.getParameter( "c3" )  ; 
String etatCheckBox4 =""+request.getParameter( "c4" )  ; 
String etatCheckBox5 =""+request.getParameter( "c5" )  ; 
String etatCheckBox6 =""+request.getParameter( "c6" )  ; 
String etatCheckBox7 =""+request.getParameter( "c7" )  ; 
String etatCheckBox8 =""+request.getParameter( "c8" )  ; 
String etatCheckBox9 =""+request.getParameter( "c9" )  ; 
String etatCheckBox10 =""+request.getParameter( "c10" )  ; 
String etatCheckBox11 =""+request.getParameter( "c11" )  ; 
String etatCheckBox12 =""+request.getParameter( "c12" )  ; 
String etatCheckBox13 =""+request.getParameter( "c13" )  ; 
String etatCheckBox14 =""+request.getParameter( "c14" )  ; 
String etatCheckBox15 =""+request.getParameter( "c15" )  ; 
String etatCheckBox16 =""+request.getParameter( "c16" )  ; 
%>
<thead>

 

                                    
                                 <% if(!etatCheckBox.equals("date")){%> <th>Date</th><%} %>
                              <%  if(!etatCheckBox2.equals("origine")){%> <th>Origine</th> <%} %>
                                <%  if(!etatCheckBox3.equals("destination")){ %>  <th>Destination</th> <%} %>
                                <%  if(!etatCheckBox4.equals("Centre acquéreur")){ %> <th>Centre acquéreur</th><%} %>
                              <%  if(!etatCheckBox5.equals("Contrat")){ %>   <th>Contrat</th><%} %>

                                <%  if(!etatCheckBox6.equals("Version")){%> <th>Version</th><%} %>
                             <%  if(!etatCheckBox7.equals("Opération")){%>     <th>Opération</th><%} %>
                             <%  if(!etatCheckBox8.equals("Durée")){%>    <th>Durée</th><%} %>
                              <%  if(!etatCheckBox9.equals("Modulation")){%>     <th>Modulation</th><%} %>
                               <%  if(!etatCheckBox10.equals("Vitesse")){%> <th>Vitesse</th><%} %>
                                <%  if(!etatCheckBox11.equals("Msg reçu")){%>  <th>Msg reçu</th><%} %>
                               <%  if(!etatCheckBox12.equals("Msg émis")){%> <th>Msg émis</th><%} %>
                                <%  if(!etatCheckBox13.equals("Octets reçu")){%> <th>Octets reçu</th><%} %>
                                <%  if(!etatCheckBox14.equals("Octets émis")){%> <th>Octets émis</th><%} %>
                                 <%  if(!etatCheckBox15.equals("Status 1")){%><th>Status 1</th><%} %>
                                <%  if(!etatCheckBox16.equals("Status 2")){%> <th>Status 2</th><%} %>



                                          </thead>  
                                  
                                                    
                            
                            <tbody>
                            
                            
                            <c:forEach var = "list" items = "${lists}">
                                <tr>
                                <%
                                if(!etatCheckBox.equals("date")){%>
                                    <td>${list.opeDate}</td><%} %>
                                                                   <%
                                if(!etatCheckBox2.equals("origine")){%> <td>${list.opeServeur}&nbsp;</td><%} %>
                                                                
                                 <% if(!etatCheckBox3.equals("destination")){%>  <td>${list.opeSda}&nbsp;</td><%} %>
                                    <% if(!etatCheckBox4.equals("Centre acquéreur")){%> <td>${list.ope_adresse}</td><%} %>
                                   <%  if(!etatCheckBox5.equals("Contrat")){%>    <td>${list.opeContrat}</td><%} %>
                                  <%  if(!etatCheckBox6.equals("Version")){%>    <td>${list.ope_version}</td><%} %>
                                   <%  if(!etatCheckBox7.equals("Opération")){%>    <td>${list.opeOperation}</td><%} %>
                                 <%  if(!etatCheckBox8.equals("Durée")){%>   <td>${list.opeDuree}</td><%} %>
                                   <%  if(!etatCheckBox9.equals("Modulation")){%> <td>${list.ope_modulation}</td><%} %>
                                      <%  if(!etatCheckBox10.equals("Vitesse")){%>  <td>${list.ope_vitesse}</td><%} %>
                                    <%  if(!etatCheckBox11.equals("Msg reçu")){%> <td>${list.ope_msgsrx}</td><%} %>
                                   <%  if(!etatCheckBox12.equals("Msg émis")){%> <td>${list.ope_msgstx}</td><%} %>
                                   <%  if(!etatCheckBox13.equals("Octets reçu")){%> <td>${list.ope_octetsrx}</td><%} %>
                                    <%  if(!etatCheckBox14.equals("Octets émis")){%><td>${list.ope_octetstx}</td><%} %>
                                    <%  if(!etatCheckBox15.equals("Status 1")){%> <td>${list.ope_stat_date}</td><%} %>
                                   <%  if(!etatCheckBox16.equals("Status 2")){%>  <td>${list.ope_stat_heure}</td><%}%>


                                </tr>
                            </c:forEach>
                            </tbody>
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
</div>
<!-- END WRAPPER -->
<!-- Javascript -->
<script src="static/vendor/jquery/jquery.min.js"></script>
<script src="static/vendor/bootstrap/js/bootstrap.min.js"></script>
<script src="static/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<script src="static/vendor/jquery.easy-pie-chart/jquery.easypiechart.min.js"></script>
<script src="static/vendor/chartist/js/chartist.min.js"></script>
<script src="static/scripts/klorofil-common.js"></script>
<script type="text/javascript" src="static/jquery/jquery.tablescroll.js"></script>
<!-- you need to include the shieldui css and js assets in order for the components to work -->
<link rel="stylesheet" type="text/css" href="http://www.shieldui.com/shared/components/latest/css/light/all.min.css" />
<script type="text/javascript" src="http://www.shieldui.com/shared/components/latest/js/shieldui-all.min.js"></script>
<script type="text/javascript" src="http://www.shieldui.com/shared/components/latest/js/jszip.min.js"></script>

<script type="text/javascript">


    $(document).ready(function() {
        $("#btnExport").click(function(e) {
            e.preventDefault();

            //getting data from our table
            var data_type = 'data:application/vnd.ms-excel';
            var table_div = document.getElementById('table_wrapper');
            var table_html = table_div.outerHTML.replace(/ /g, '%20');

            var a = document.createElement('a');
            a.href = data_type + ', ' + table_html;
            a.download = 'exported_table_' + Math.floor((Math.random() * 9999999) + 1000000) + '.xls';
            a.click();
        });
    });
</script>

<script type="text/javascript">


    function download_csv(csv, filename) {
        var csvFile;
        var downloadLink;

        // CSV FILE
        csvFile = new Blob([csv], {type: "text/csv"});

        // Download link
        downloadLink = document.createElement("a");

        // File name
        downloadLink.download = filename;

        // We have to create a link to the file
        downloadLink.href = window.URL.createObjectURL(csvFile);

        // Make sure that the link is not displayed
        downloadLink.style.display = "none";

        // Add the link to your DOM
        document.body.appendChild(downloadLink);

        // Lanzamos
        downloadLink.click();
    }

    function export_table_to_csv(html, filename) {
        var csv = [];
        var rows = document.querySelectorAll("table tr");

        for (var i = 0; i < rows.length; i++) {
            var row = [], cols = rows[i].querySelectorAll("td, th");

            for (var j = 0; j < cols.length; j++)
                row.push(cols[j].innerText);

            csv.push(row.join(","));
        }

        // Download CSV
        download_csv(csv.join("\n"), filename);
    }

    document.getElementById("btnExport2").addEventListener("click", function () {
        var html = document.querySelector("table").outerHTML;
        export_table_to_csv(html, "table.csv");
    });

</script>
<script>
    /*<![CDATA[*/

    jQuery(document).ready(function($)
    {
        $('#thetable2').tableScroll({height:450});
    });

    /*]]>*/
</script>

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/buttons/1.5.1/js/dataTables.buttons.min.js"></script>
<script src="https://cdn.datatables.net/buttons/1.5.1/js/buttons.flash.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.32/pdfmake.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.32/vfs_fonts.js"></script>
<script src="https://cdn.datatables.net/buttons/1.5.1/js/buttons.html5.min.js"></script>
<script src="https://cdn.datatables.net/buttons/1.5.1/js/buttons.print.min.js"></script>

<script type="text/javascript">

$(document).ready(function() {
    $('#exemple').DataTable( {
        dom: 'Bfrtip',
        buttons: [
            'copy', 'csv', 'excel', 'pdf', 'print'
        ]
    } );
} );
</script>

</body>
</html>