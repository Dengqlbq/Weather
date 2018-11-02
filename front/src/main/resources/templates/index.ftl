<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!doctype html>
<html>
<head>
<title>Slide Weather Widget Responsive Widget Template :: w3layouts</title>
<!-- for-mobile-apps -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<meta name="keywords" content="Slide Weather Widget Responsive, Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<!-- //for-mobile-apps -->
<link href="//fonts.googleapis.com/css?family=Josefin+Sans:100,100i,300,300i,400,400i,600,600i,700,700i" rel="stylesheet">
<link href='//fonts.googleapis.com/css?family=Roboto+Condensed:400,700italic,700,400italic,300italic,300' rel='stylesheet' type='text/css'>
<!-- font-awesome icons -->
<link href="/css/font-awesome.css" rel="stylesheet">
<!-- //font-awesome icons -->
<link href="/css/style.css" rel="stylesheet" type="text/css" media="all" />
<script src="/js/jquery-2.1.4.min.js"></script>
    <script type="text/javascript">
        $(function () {

		$('.hub-slider-slides ul').hubSlider({
			selector: $('li'),
			button: {
				next: $('.hub-slider-arrow_next'),
				prev: $('.hub-slider-arrow_prev')
			},
			transition: '0.7s',
			startOffset: 30,
			auto: true,
			time: 2 // secondly
		});

        })
    </script>
	<!--skycons-icons-->
<script src="/js/skycons.js"></script>
<!--//skycons-icons-->

</head>
<body>
<div class="content" id="Main-Content">
	<h1>Slide Weather Widget</h1>
	<div class="w3ls-slider">
		<div class="hub-slider">
			<div class="hub-slider-slides">
				<ul>
					<#list weather.dailyForecastList as forecast>
                        <li>
                            <#if forecast_index == 0>
                                <div class="w3layouts-info w3layouts-info2">
                            <#elseif forecast_index == 1>
                                <div class="w3layouts-info w3layouts-info3">
                            <#else >
                                <div class="w3layouts-info w3layouts-info1">
                            </#if>
                                <div class="w3layouts-info-top">
                                     <#if forecast_index == 0>
                                        <h5>今</h5>
                                     <#elseif forecast_index == 1>
                                        <h5>明</h5>
                                     <#else >
                                        <h5>后</h5>
                                     </#if>
                                    <h3>${forecast.condTxtD}</h3>
                                    <h4>${forecast.tmpMin}°c - ${forecast.tmpMax}°c</h4>
                                    <p>湿度: ${forecast.hum}</p>
                                <!--    <p>紫外线指数: ${forecast.uvIndex}</p> -->
                                </div>
                            <#if forecast_index == 0>
                                <canvas id="rain" width="40" height="40"></canvas>
                            <#elseif forecast_index == 1>
                                <canvas id="snow" width="40" height="40"></canvas>
                            <#else >
                                <canvas id="partly-cloudy-day" width="40" height="40"></canvas>
                            </#if>
                                <div class="w3layouts-info-bottom">
                                    <h5>风力: ${forecast.windSc}</h5>
                                    <p>风向: ${forecast.windDir}</p>
                                </div>
                            </div>
                        </li>
					</#list>
				</ul>
			</div>
			<div class="hub-slider-controls">
				<button class="hub-slider-arrow hub-slider-arrow_next">↑</button>
				<button class="hub-slider-arrow hub-slider-arrow_prev">↓</button>
			</div>
		</div>
	</div>
	<!-- copyright -->
	<div class="copyright">
		<p> © 2017 Slide Weather Widget . All rights reserved | Design by <a href="http://w3layouts.com/" target="_blank">W3layouts</a></p>
	</div>
	<!-- //copyright -->
	<script>
				 var icons = new Skycons({"color": "#FFD700"}),
					  list  = [
						"clear-day"
					  ],
					  i;

				  for(i = list.length; i--; )
					icons.set(list[i], list[i]);

				  icons.play();
		</script>
		<script>
				 var icons = new Skycons({"color": "#f5f5f5"}),
					  list  = [
						"clear-night", "partly-cloudy-day",
						"partly-cloudy-night", "cloudy", "rain", "sleet", "snow", "wind",
						"fog"
					  ],
					  i;

				  for(i = list.length; i--; )
					icons.set(list[i], list[i]);

				  icons.play();
		</script>
	<script type="text/javascript" src="/js/hubslider.js"></script>
</div>
</body>
</html>
