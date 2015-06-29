(function(){
	var app = angular.module('store', []);

	app.controller('GalleryController', function(){
		this.products = fruits;
	});

	var fruits = [
		{
			"name":"apple",
			"rate":"Rs.100.00",
			'description':'Apple a day keeps doctor away!!!',
			"image1":"/images/apple/img1.jpg",
			"image2":"/images/apple/img2.jpg",
			"image3":"/images/apple/img3.jpg"
		},
		{
			"name":"orange",
			"rate":"Rs.100.00",
			'description':'Orange a day keeps doctor away!!!',
			"image1":"/images/orange/img1.jpg",
			"image2":"/images/apple/img2.jpg",
			"image3":"/images/apple/img3.jpg"
		},
		{
			"name":"banana",
			"rate":"Rs.100.00",
			'description':'Banana a day keeps doctor away!!!',
			"image1":"/images/banana/img1.jpg",
			"image2":"/images/apple/img2.jpg",
			"image3":"/images/apple/img3.jpg"
		},
		{
			"name":"pineapple",
			"rate":"Rs.100.00",
			'description':'Pineapple a day keeps doctor away!!!',
			"image1":"/images/pineapple/img1.jpg",
			"image2":"/images/apple/img2.jpg",
			"image3":"/images/apple/img3.jpg"
		}
	]
})();

$(function(){
	$boti = $('#boti');
	console.log($boti);
	$boti.on('click', function(event){
		$that = $(this);
		loadImage('./images/superwalk.gif', $that);
	});

	var loadImage = function(img, pos){
		console.log('test');
		console.log(img);
		var img = $("<img />").attr('src', img).load(function() {
			console.log('dddd');
			        if (!this.complete || typeof this.naturalWidth == "undefined" || this.naturalWidth == 0) {
						console.log('broken image!');
			        } else {
						//var newPos = pos.siblings('.thumbnails');
						//newPos.empty();
						//newPos.append(img);
						pos.empty();
						pos.append(img);
			        }
		});
	};
	

	moveBoti = function(x,y){
		var xCordinate = x + '%';
		var yCordinate = y + '%';
		$boti.css('left',xCordinate).css('top',yCordinate);
	}

	
	var x=0,y=0;
	setInterval(function(){ 
					moveBoti(x,y);
					x=x+1;
					if(x>100){
						y = (y+20)%100;
						x = x % 100;
					}
				}, 150);

});
