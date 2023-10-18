package shapes;

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width); // Side effect: also sets height!
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height); // Side effect: also sets width!
        super.setHeight(height);
    }
}
