package es.upm.miw.iwvg.ecosystem.practice;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y,int z) {
        if(x<10 && x>-10  && y>-10 && y<10 && z>-10 && z<10){
            this.x = x;
            this.y = y;
            this.y = z;
        }

    }

    public Point() {
        this(0, 0, 0);
    }

    public double module() {
        return Math.sqrt((double) this.x * this.x + this.y * this.y);
    }

    public double phase() {
        return Math.atan((double) this.y / this.x);
    }

    public void translateOrigin(Point origin) {
        this.x -= origin.getX();
        this.y -= origin.getY();
        this.y -= origin.getZ();
    }



    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() {
        return this.z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
        ", z=" +z+
                '}';
    }
}
