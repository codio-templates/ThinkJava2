In mathematics, a regular polygon has all sides the same length and all angles equal in measure. Regular polygons are a special case of polygons, so we will use specialization to define a class for them.

We could extend the `Polygon` class, as we did in the previous section. But then we would not have the `Color` functionality we just added. So we will make `RegularPolygon` extend `DrawablePolygon`.

To construct a `RegularPolygon`, we specify the number of sides, the radius (distance from the center to a vertex), and the color. For example:

```code
RegularPolygon rp = new RegularPolygon(6, 50, Color.BLUE);
```

![Figure 17.1 Determining the $x$ and $y$ coordinates of vertex V1, given the radius $r$ and angle $\theta$. The center of the polygon is at the origin $(0, 0)$.](figs/hexagon.jpg)

**Figure 17.1 Determining the $x$ and $y$ coordinates of vertex V1, given the radius $r$ and angle $\theta$. The center of the polygon is at the origin $(0, 0)$.**

The constructor uses trigonometry to find the coordinates of each vertex. Figure 17.1 illustrates the process. The number of sides ($n=6$) and the radius ($r=50$) are given as parameters.



* Imagine a clock hand starting at V0 and rotating counterclockwise to V1, V2, and so forth. In Figure 17.1, the hand is currently at V1.
* The angle $\theta$ is $2 \pi / n$, since there are $2\pi$ radians in a circle. In other words, we are dividing the rotation of the clock hand into $n$ equal angles.
* By definition, $\cos(\theta) = x/r$ and $\sin(\theta) = y/r$. Therefore, $x = r \cos(\theta)$ and $y = r \sin(\theta)$.
* We can determine the other $(x, y)$ coordinates by multiplying $\theta$ by $i$, where $i$ is the vertex number.



Here is the constructor for `RegularPolygon`:

```code
public RegularPolygon(int nsides, int radius, Color color) {

    // initialize DrawablePolygon attributes
    this.npoints = nsides;
    this.xpoints = new int[nsides];
    this.ypoints = new int[nsides];
    this.color = color;

    // the amount to rotate for each vertex (in radians)
    double theta = 2.0 * Math.PI / nsides;

    // compute x and y coordinates, centered at the origin
    for (int i = 0; i < nsides; i++) {
        double x = radius * Math.cos(i * theta);
        double y = radius * Math.sin(i * theta);
        xpoints[i] = (int) Math.round(x);
        ypoints[i] = (int) Math.round(y);
    }
}
```

This constructor initializes all four `DrawablePolygon` attributes, so it doesn't have to invoke `super()`.

It initializes `xpoints` and `ypoints` by creating arrays of integer coordinates. Inside the `for` loop, it uses `Math.sin` and `Math.cos` (see Section 4.6) to compute the coordinates of the vertices as floating-point numbers. Then it rounds them off to integers and stores them in the arrays.

When we construct a `RegularPolygon`, the vertices are centered at the point $(0, 0)$. If we want the center of the polygon to be somewhere else, we can use `translate`, which we inherit from `Polygon`:

```code
RegularPolygon rp = new RegularPolygon(6, 50, Color.BLUE);
rp.translate(100, 100);
```

The result is a six-sided polygon with radius 50 centered at the point $(100, 100)$.