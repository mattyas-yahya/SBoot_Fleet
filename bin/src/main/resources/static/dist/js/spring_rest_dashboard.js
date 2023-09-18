$(document).ready(function()
      {
          $.ajax({
               url: 'https://localhost:1111//BarangLaris/max',//http://localhost:1111/BarangAll
               success: function(data)
                {
                 data.forEach(function(dt)
                {
                     $("#nx").append
                     (

                     "<h2>"+dt[0]+"</h2>"

                     );
                      $("#nc").append
                                          (

                                          "<h2>"+dt[1]+"</h2>"

                                          );
                                 });

                               }
                             });
                });

