package ss7.thuc_hanh.trien_khai_interface_comparable_cho_cac_lop_hinh_hoc;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() == o.getRadius()){
            return 0;
        } else if (getRadius() > o.getRadius()){
            return 1;
        } else {
            return -1;
        }
    }
}
