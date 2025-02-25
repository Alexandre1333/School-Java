public class Square extends Rectangle {
    private double width;
    private double height;
    private double widthAndHeight;

    public Square(String outlineColour, double height, double width) {
        super(outlineColour, height, width);
    }

        @Override
        public double getHeight () {
            return height;
        }

        @Override
        public void setHeight ( double height){
            this.height = height;
        }

        @Override
        public double getWidth() {
            return width;
        }

        @Override
        public void setWidth ( double width){
            this.width = width;
        }

        public double getWidthAndHeight() {
        return widthAndHeight;
        }

        public void setWidthAndHeight(double widthAndHeight){
        this.widthAndHeight = widthAndHeight;
        }
}

