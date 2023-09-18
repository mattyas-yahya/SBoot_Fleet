var form_journal = $('#form_journal');
var form_stok = $('#form_stok');
var form_vendor = $('#form_vendor');
var form_items = $('#form_items');
var form_bom = $('#form_bom');
var form_warehouse = $('#form_warehouse');
var form_vehicles=$('#form_vehicles');
var form_contract=$('#form_contract');
var form_services=$('#form_services');
var form_issue=$('#form_issue');

$("#form_issue").on("click", "#iss1", function() {
    $.ajax
    ({
    type: "POST",
    url: "/issue/Save",
    data: form_issue.serialize(),
    cache: false,
    success: function(data)
    {
    var result = data;
    ("#info").html('Successfully updated record!');
    $("#info").addClass("alert alert-success");
    
    $("#info").fadeTo(2000, 500).slideUp(500, function()
    {
    $("#info").slideUp(1000);
    });
    }
    });
    return false;
    }); 

    $("#form_issue").on("click", "#iss2", function() {
    $.ajax
    ({
    type: "DELETE",
    url: "/issue/Delete",
    data: form_issue.serialize(),
    cache: false,
    success: function(data)
    {
    var result = data;
    ("#info").html('Successfully updated record!');
    $("#info").addClass("alert alert-success");
    
    $("#info").fadeTo(2000, 500).slideUp(500, function()
    {
    $("#info").slideUp(1000);
    });
    }
    });
    return false;
    }); 



$("#form_services").on("click", "#sr1", function() {
    $.ajax
    ({
    type: "POST",
    url: "/services/Save",
    data: form_services.serialize(),
    cache: false,
    success: function(data)
    {
    var result = data;
    ("#info").html('Successfully updated record!');
    $("#info").addClass("alert alert-success");
    
    $("#info").fadeTo(2000, 500).slideUp(500, function()
    {
    $("#info").slideUp(1000);
    });
    }
    });
    return false;
    }); 

    $("#form_services").on("click", "#sr2", function() {
    $.ajax
    ({
    type: "DELETE",
    url: "/services/Delete",
    data: form_services.serialize(),
    cache: false,
    success: function(data)
    {
    var result = data;
    ("#info").html('Successfully updated record!');
    $("#info").addClass("alert alert-success");
    
    $("#info").fadeTo(2000, 500).slideUp(500, function()
    {
    $("#info").slideUp(1000);
    });
    }
    });
    return false;
    }); 


$("#form_contract").on("click", "#cc1", function() {
    $.ajax
    ({
    type: "POST",
    url: "/contract/Save",
    data: form_contract.serialize(),
    cache: false,
    success: function(data)
    {
    var result = data;
    ("#info").html('Successfully updated record!');
    $("#info").addClass("alert alert-success");
    
    $("#info").fadeTo(2000, 500).slideUp(500, function()
    {
    $("#info").slideUp(1000);
    });
    }
    });
    return false;
    }); 

    $("#form_contract").on("click", "#cc2", function() {
    $.ajax
    ({
    type: "DELETE",
    url: "/contract/Delete",
    data: form_contract.serialize(),
    cache: false,
    success: function(data)
    {
    var result = data;
    ("#info").html('Successfully updated record!');
    $("#info").addClass("alert alert-success");
    
    $("#info").fadeTo(2000, 500).slideUp(500, function()
    {
    $("#info").slideUp(1000);
    });
    }
    });
    return false;
    }); 

$("#form_vehicles").on("click", "#ve1", function() {
    $.ajax
    ({
    type: "POST",
    url: "/vehicles/Save",
    data: form_vehicles.serialize(),
    cache: false,
    success: function(data)
    {
    var result = data;
    ("#info").html('Successfully updated record!');
    $("#info").addClass("alert alert-success");
    
    $("#info").fadeTo(2000, 500).slideUp(500, function()
    {
    $("#info").slideUp(1000);
    });
    }
    });
    return false;
    }); 

    $("#form_vehicles").on("click", "#ve2", function() {
    $.ajax
    ({
    type: "DELETE",
    url: "/vehicles/Delete",
    data: form_vehicles.serialize(),
    cache: false,
    success: function(data)
    {
    var result = data;
    ("#info").html('Successfully updated record!');
    $("#info").addClass("alert alert-success");
    
    $("#info").fadeTo(2000, 500).slideUp(500, function()
    {
    $("#info").slideUp(1000);
    });
    }
    });
    return false;
    }); 
    


$("#form_warehouse").on("click", "#PL1", function() {
    $.ajax
    ({
    type: "POST",
    url: "/warehouseSave",
    data: form_warehouse.serialize(),
    cache: false,
    success: function(data)
    {
    var result = data;
    ("#info").html('Successfully updated record!');
    $("#info").addClass("alert alert-success");
    
    $("#info").fadeTo(2000, 500).slideUp(500, function()
    {
    $("#info").slideUp(1000);
    });
    }
    });
    return false;
    }); 
    $("#form_warehouse").on("click", "#PL2", function() {
    $.ajax
    ({
    type: "DELETE",
    url: "/warehouseDelete",
    data: form_warehouse.serialize(),
    cache: false,
    success: function(data)
    {
    var result = data;
    ("#info").html('Successfully updated record!');
    $("#info").addClass("alert alert-success");
    
    $("#info").fadeTo(2000, 500).slideUp(500, function()
    {
    $("#info").slideUp(1000);
    });
    }
    });
    return false;
    }); 
    

$("#form_bom").on("click", "#bom1", function()
 {
    $.ajax
    ({
    type: "POST",
    url: "/BillOfMaterial/Save",
    data: form_bom.serialize(),
    cache: false,
    success: function(data)
    {
    var result = data;
    ("#info").html('Successfully updated record!');
    $("#info").addClass("alert alert-success");
    
    $("#info").fadeTo(2000, 500).slideUp(500, function()
    {
    $("#info").slideUp(1000);
    });
    }
    });
    return false;
    }); 

$("#form_items").on("click", "#it1", function()
 {
    $.ajax
    ({
    type: "POST",
    url: "/Items/Save",
    data: form_items.serialize(),
    cache: false,
    success: function(data)
    {
    var result = data;
    ("#info").html('Successfully updated record!');
    $("#info").addClass("alert alert-success");
    
    $("#info").fadeTo(2000, 500).slideUp(500, function()
    {
    $("#info").slideUp(1000);
    });
    }
    });
    return false;
    }); 
    $("#form_items").on("click", "#it2", function()
    {
       $.ajax
       ({
       type: "DELETE",
       url: "/Items/Delete",
       data: form_items.serialize(),
       cache: false,
       success: function(data)
       {
       var result = data;
       ("#info").html('Successfully delete record!');
       $("#info").addClass("alert alert-success");
       
       $("#info").fadeTo(2000, 500).slideUp(500, function()
       {
       $("#info").slideUp(1000);
       });
       }
       });
       return false;
       }); 




$("#form_vendor").on("click", "#SV1", function() {
    $.ajax
    ({
    type: "POST",
    url: "/VendorSave",
    data: form_vendor.serialize(),
    cache: false,
    success: function(data)
    {
    var result = data;
    ("#info").html('Successfully updated record!');
    $("#info").addClass("alert alert-success");
    
    $("#info").fadeTo(2000, 500).slideUp(500, function()
    {
    $("#info").slideUp(1000);
    });
    }
    });
    return false;
    }); 


$("#form_journal").on("click", "#JR1", function() {
    $.ajax
    ({
    type: "POST",
    url: "/Journal/Save",
    data: form_journal.serialize(),
    cache: false,
    success: function(data)
    {
    var result = data;
    ("#info").html('Successfully updated record!');
    $("#info").addClass("alert alert-success");
    
    $("#info").fadeTo(2000, 500).slideUp(500, function()
    {
    $("#info").slideUp(1000);
    });
    }
    });
    return false;
    }); 

    $("#form_stok").on("click", "#STK1", function() {
        $.ajax
        ({
        type: "POST",
        url: "/Stock/Save",
        data: form_stok.serialize(),
        cache: false,
        success: function(data)
        {
        var result = data;
        ("#info").html('Successfully updated record!');
        $("#info").addClass("alert alert-success");
        
        $("#info").fadeTo(2000, 500).slideUp(500, function()
        {
        $("#info").slideUp(1000);
        });
        }
        });
        return false;
        }); 