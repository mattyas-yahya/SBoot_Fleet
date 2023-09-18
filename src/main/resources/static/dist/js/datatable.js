
var table_vehicles;
var table_contract;
var table_services;
var table_issue;
var pr;

$(document).ready( function ()
{
    $('#due_date').daterangepicker({
        singleDatePicker: true,
        showDropdowns: true,
        locale: {
        format: 'YYYY-MM-DD'
        }
        });
        
        table_issue = $('#table_issue').DataTable({
"columnDefs":[{ "orderable": false,"className": "select-checkbox","targets": [0],"checkboxes": {"selectRow": true}}],
"select": {"style": "multi"},
"order": [[0, "asc"]],
"responsive": true,
"sAjaxSource": "/issue/All",
"scrollX": "200px",
"sAjaxDataProp": "",
"aoColumns": [
{ "mData": "id_issue","defaultContent": ""},
{ "mData": "id_vehicles","defaultContent": "","visible":false},
{ "mData": "model" ,"defaultContent": ""},
{ "mData": "license_plat" ,"defaultContent": ""},
{ "mData": "driver" ,"defaultContent": ""},
{ "mData": "title" ,"defaultContent": ""},
{ "mData": "description" ,"defaultContent": ""},
{ "mData": "priority" ,"defaultContent": ""},
{ "mData": "due_date" ,"defaultContent": ""}
]
});
});


$(document).ready( function ()
{
    $('#service_date').daterangepicker({
        singleDatePicker: true,
        showDropdowns: true,
        locale: {
        format: 'YYYY-MM-DD'
        }
        });
        
        table_services = $('#table_services').DataTable({
"columnDefs":[{ "orderable": false,"className": "select-checkbox","targets": [0],"checkboxes": {"selectRow": true}}],
"select": {"style": "multi"},
"order": [[0, "asc"]],
"responsive": true,
"sAjaxSource": "/services/All",
"scrollX": "200px",
"sAjaxDataProp": "",
"aoColumns": [
{ "mData": "id_services","defaultContent": ""},
{ "mData": "id_vehicles","defaultContent": "","visible":false},
{ "mData": "description" ,"defaultContent": ""},
{ "mData": "vehicle" ,"defaultContent": ""},
{ "mData": "service_type" ,"defaultContent": ""},
{ "mData": "service_date" ,"defaultContent": ""},
{ "mData": "cost" ,"defaultContent": ""},
{ "mData": "vendor" ,"defaultContent": ""},
{ "mData": "driver" ,"defaultContent": ""},
{ "mData": "odometer_value","defaultContent": ""},
{ "mData": "notes" ,"defaultContent": ""}
]
});
});


$(document).ready( function ()
{
    $('#contract_expired_date').daterangepicker({
        singleDatePicker: true,
        showDropdowns: true,
        locale: {
        format: 'YYYY-MM-DD'
        }
        });
        
        $('#contract_start_date').daterangepicker({
        singleDatePicker: true,
        showDropdowns: true,
        locale: {
        format: 'YYYY-MM-DD'
        }
        });
    

        
        table_contract = $('#table_contract').DataTable({
"columnDefs":[{ "orderable": false,"className": "select-checkbox","targets": [0],"checkboxes": {"selectRow": true}}],
"select": {"style": "multi"},
"order": [[0, "asc"]],
"responsive": true,
"sAjaxSource": "/contract/All",
"scrollX": "200px",
"sAjaxDataProp": "",
"aoColumns": [
{ "mData": "id_contract","defaultContent": ""},
{ "mData": "id_vehicles","defaultContent": "","visible":false},
{ "mData": "reference" ,"defaultContent": ""},
{ "mData": "type" ,"defaultContent": ""},
{ "mData": "vendor" ,"defaultContent": ""},
{ "mData": "contract_start_date" ,"defaultContent": ""},
{ "mData": "contract_expired_date" ,"defaultContent": ""},
{ "mData": "responsible" ,"defaultContent": ""},
{ "mData": "vehicle" ,"defaultContent": ""},
{ "mData": "driver","defaultContent": ""},
{ "mData": "activation_cost" ,"defaultContent": ""},
{ "mData": "recurring_cost" ,"defaultContent": ""}
]
});
});

$(document).ready( function ()
{
    $('#assignment_date').daterangepicker({
        singleDatePicker: true,
        showDropdowns: true,
        locale: {
        format: 'YYYY-MM-DD'
        }
        });
        
        $('#order_date').daterangepicker({
        singleDatePicker: true,
        showDropdowns: true,
        locale: {
        format: 'YYYY-MM-DD'
        }
        });
    
        $('#first_contract_date').daterangepicker({
        singleDatePicker: true,
        showDropdowns: true,
        locale: {
        format: 'YYYY-MM-DD'
        }
        });

        
    table_vehicles = $('#table_vehicles').DataTable({
"columnDefs":[{ "orderable": false,"className": "select-checkbox","targets": [0],"checkboxes": {"selectRow": true}}],
"select": {"style": "multi"},
"order": [[0, "asc"]],
"responsive": true,
"sAjaxSource": "/vehicles/All",
"scrollX": "200px",
"sAjaxDataProp": "",
"aoColumns": [
{ "mData": "id_vehicles","defaultContent": ""},
{ "mData": "model" ,"defaultContent": ""},
{ "mData": "license_plat" },
{ "mData": "driver" ,"defaultContent": ""},
{ "mData": "assignment_date" ,"defaultContent": ""},
{ "mData": "category" ,"defaultContent": ""},
{ "mData": "order_date" ,"defaultContent": ""},
{ "mData": "chassis_number" ,"defaultContent": ""},
{ "mData": "fleet_manager","defaultContent": ""},
{ "mData": "location" ,"defaultContent": ""},
{ "mData": "first_contract_date" ,"defaultContent": ""},
{ "mData": "purchase_value" ,"defaultContent": ""},
{ "mData": "residual_value" ,"defaultContent": ""}
]
});
$("#selected").click(function (event)
{
    var form = this;
    var rows_selected = table_vehicles.column(0).checkboxes.selected();
    tt = $('#table_vehicles').DataTable().row('.selected').data();
    $('#id_vehicles').val(tt['id_vehicles']);
    $('#vehicle').val(tt['model']);
    $('#model').val(tt['model']);
    $('#license_plat').val(tt['license_plat']);
    $('#driver').val(tt['driver']);
});
$("#table_vehicles").click(function (event)
{      
// console.log(x.value());
var form = this;
var rows_selected = table_vehicles.column(0).checkboxes.selected();
var xt = $('#table_vehicles').DataTable().row('.selected').data();
$('#id_vehicles').val(xt['id_vehicles']);
$('#vehicle').val(xt['model']);
$('#model').val(xt['model']);
$('#license_plat').val(xt['license_plat']);
$('#driver').val(xt['driver']);

 var x= xt['license_plat'];

console.log("datanyaaaaa PR "+x);

table_issue.search('').columns().search('').draw();
table_issue.column(3).search(x).draw();
table_issue.search( this.value ).draw();
table_issue.search(pr).draw();

});
});


