class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    
    public Point2D() {
        this.x = 17.6f;
        this.y = 19.4f;
    }

    public Point2D(float x ,float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }
}