package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistance() {
    Point p1 = new Point(2,3);
    Point p2 = new Point(4,5);
    Assert.assertEquals(p1.distance(p2), 2.8284271247461903);
    Point p3 = new Point(15,27);
    Point p4 = new Point(36,84);
    Assert.assertEquals(p3.distance(p4), 60.74537019394976);
  }

}
