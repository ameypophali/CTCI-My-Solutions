package Chapter16Moderate;

public class Q3LineIntersetion {

    Point getIntersection(Point start1, Point end1, Point start2, Point end2){

        return null;
    }

    public class Point{
        double x;
        double y;
        public Point(double start, double end){
            this.x = start;
            this.y = end;
        }

        public void setPoint(double newStart, double newEnd){
            this.x = newStart;
            this.y = newEnd;
        }
    }

    public class Line{
        double  slope;
        double yIntercept;
        public Line(Point start, Point end){
            this.slope = (end.y - start.y) / (end.x - start.x);
            this.yIntercept = start.y - this.slope * start.x;
        }
    }
}
