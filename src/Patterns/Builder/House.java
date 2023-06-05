package Patterns.Builder;

class House {
    private String foundation;
    private String walls;
    private String roof;
    private String doors;
    private String windows;

    private House(Builder builder) {
        this.foundation = builder.foundation;
        this.walls = builder.walls;
        this.roof = builder.roof;
        this.doors = builder.doors;
        this.windows = builder.windows;
    }

    public static class Builder {
        private String foundation;
        private String walls;
        private String roof;
        private String doors;
        private String windows;

        public Builder foundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public Builder walls(String walls) {
            this.walls = walls;
            return this;
        }

        public Builder roof(String roof) {
            this.roof = roof;
            return this;
        }

        public Builder doors(String doors) {
            this.doors = doors;
            return this;
        }

        public Builder windows(String windows) {
            this.windows = windows;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    public void print() {
        System.out.println("House Parameters:");
        System.out.println("Foundation: " + foundation);
        System.out.println("Walls: " + walls);
        System.out.println("Roof: " + roof);
        System.out.println("Doors: " + doors);
        System.out.println("Windows: " + windows);
    }
}

class Main {
    public static void main(String[] args) {
        House house = new House.Builder()
                .foundation("Concrete")
                .walls("Brick")
                .roof("Tiles")
                .doors("Wooden")
                .windows("Glass")
                .build();

        house.print();
    }
}
