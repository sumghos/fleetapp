/**
 * 
 */

$('document').ready(function(){
	
	$('table #editButton').on('click',function(event){
		event.preventDefault();
		var href = $(this).attr('href'); // /Country/findbyidCountry/?id=1
		$.get(href,function(Country, status){
			$('#idedit').val(Country.id);
			$('#descrptionedit').val(Country.description);
			$('#capitaledit').val(Country.capital);
			$('#codeedit').val(Country.code);
			$('#continentedit').val(Country.continent);
			$('#nationalityedit').val(Country.nationality);
		});
		$('#editmodal').modal();
	});
	
	$('table #deletebutton').on('click',function(event){
		
		event.preventDefault();
		
		$('#deletemodal').modal();
		
	});
		
});