<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Title</title>
    <link href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css" rel="stylesheet">
    <link href="https://cdn.datatables.net/buttons/1.4.2/css/buttons.dataTables.min.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/buttons/1.4.2/js/dataTables.buttons.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.32/pdfmake.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.32/vfs_fonts.js"></script>
    <script src="https://cdn.datatables.net/buttons/1.4.2/js/buttons.html5.min.js"></script>
</head>
<body>

<table id="example" class="display" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th>Date</th>
        <th>Origine</th>
        <th>Destination</th>
        <th>Centre acquéreur</th>
        <th>Contrat</th>

        <th>Version</th>
        <th>Opération</th>
        <th>Durée</th>
        <th>Modulation</th>
        <th>Vitesse</th>
        <th>Msg reçu</th>
        <th>Msg émis</th>
        <th>Octets reçu</th>
        <th>Octets émis</th>
        <th>Status 1</th>
        <th>Status 2</th>
    </tr>
    </thead>
    <tfoot>
    <tr>
        <th>Date</th>
        <th>Origine</th>
        <th>Destination</th>
        <th>Centre acquéreur</th>
        <th>Contrat</th>

        <th>Version</th>
        <th>Opération</th>
        <th>Durée</th>
        <th>Modulation</th>
        <th>Vitesse</th>
        <th>Msg reçu</th>
        <th>Msg émis</th>
        <th>Octets reçu</th>
        <th>Octets émis</th>
        <th>Status 1</th>
        <th>Status 2</th>

    </tr>
    </tfoot>
    <tbody>
    <c:forEach var = "list" items = "${lists}">
        <tr>
            <td>${list.opeDate}</td>
            <td>${list.opeServeur}&nbsp;</td>
            <td>${list.opeSda}&nbsp;</td>
            <td>${list.ope_adresse}</td>
            <td>${list.opeContrat}</td>
            <td>${list.ope_version}</td>
            <td>${list.opeOperation}</td>
            <td>${list.opeDuree}</td>
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
    </tbody>

</table>
<script type="text/javascript">


    $(document).ready(function() {
        $('#example').DataTable( {
            dom: 'Bfrtip',
            buttons: [
                'copyHtml5',
                'excelHtml5',
                'csvHtml5',
                'pdfHtml5'
            ]
        } );
    } );
</script>
</body>
</html>
