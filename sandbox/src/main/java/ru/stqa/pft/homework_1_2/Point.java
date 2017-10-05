package ru.stqa.pft.homework_1_2;

public class Point {
  private double x,y;

  Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  double distanceTo(Point p){

    return Math.sqrt((p.x-x)*(p.x-x) + (p.y - y)*(p.y - y));
  }
}
