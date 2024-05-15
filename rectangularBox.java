public class rectangularBox {
    double lenght;
    double height;
    double breadth;

    rectangularBox(double newlength, double newheight, double newbreadth){
        lenght = newlength;
        breadth = newbreadth;
        height = newheight;
    }

    double findVolume(){
        return lenght * breadth * height;
    }

    double findArea() {
        return lenght * breadth;
    }


}
