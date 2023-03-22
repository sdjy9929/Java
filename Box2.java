public class Box2 {
    int width, length, height;
    int volume;

    Box2(int w, int l, int h) {
        width = w;
        length = l;
        height = h;
        volume = w * l * h;
    }

    Box2 whosLargest(Box2 box1, Box2 box2) {
        if(box1.volume > box2.volume)
            return box1;
        else
            return box2;
    }
}
