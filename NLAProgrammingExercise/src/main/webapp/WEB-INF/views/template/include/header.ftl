<title>${title}</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

<script>
$(document).ready(function(){
  $("#toggleMode").click(function(){
  	$('div#content div#books').toggle();
    $('div#content div#readers').toggle();
  });
});
</script>
<style>
	<#include "/style/Styles.css">
</style>

<style>
#content { padding 5px; margin: 5px; text-align: center}
fieldset { width: 300px; padding: 5px; margin-bottom: 0px; }
legend { font-weight: bold; }
</style>

	

	