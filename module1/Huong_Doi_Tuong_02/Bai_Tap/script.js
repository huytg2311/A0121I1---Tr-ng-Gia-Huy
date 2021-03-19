function Hero(image, top, left, size) {
    this.image = image;
    this.top = top;
    this.left = left;
    this.size = size;

    this.getHeroElement = function () {
        return '<img width="' + this.size + '"' +
                'height= "' + this.size + '"' +
                'src="' + this.image + '"' +
                'style="top: ' + this.top+ 'px;position: absolute;" />';
    }

    this.moveRight = function () {
        this.left += 20
    }

}