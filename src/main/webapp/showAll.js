function showAll() {

    $.getJSON( "/employees", function( data ) {

        $.each( data, function( key, val ) {
            var jsonString = JSON.stringify(val);
            var obj = JSON.parse(jsonString);
            
            if($(`tr.${obj.id}`).length == 0) {
                var tr;
                    tr = $('<tr class=' + obj.id + '/>');
                    tr.append("<td>" + obj.id + "</td>");
                    tr.append("<td class='name'>" + obj.name + "</td>");
                    tr.append("<td class='salary'>" + obj.salary + "</td>");
                    tr.append("<td class='designation'>" + obj.designation + "</td>");
                    $('table').append(tr);
            } else {
                $(`tr.${obj.id} .name`).text(obj.name);
                $(`tr.${obj.id} .salary`).text(obj.salary);
                $(`tr.${obj.id} .designation`).text(obj.designation);
            }

            
        });

    });

}

