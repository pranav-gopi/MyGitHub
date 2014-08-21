(function(){
	var app = angular.module('store', []);

	app.controller('GalleryController', function(){
		console.log("adadas");
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