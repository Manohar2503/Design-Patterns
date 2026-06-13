package com.Loki.Java_Practice.CreationalPattern.BuilderPattern.solution;

public class House {
    private String foundation;
    private String structure;
    private String roof;
    private boolean hasGarbage;
    private boolean hasSwimmingpoll;
    private boolean hasGarden;

    House(HouseBuilder builder){
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.hasGarbage = builder.hasGarbage;
        this.hasSwimmingpoll= builder.hasSwimmingpoll;
        this.hasGarden = builder.hasGarden;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", hasGarbage=" + hasGarbage +
                ", hasSwimmingpoll=" + hasSwimmingpoll +
                ", hasGarden=" + hasGarden +
                '}';
    }

    static class HouseBuilder{
        private String foundation;
        private String structure;
        private String roof;
        private boolean hasGarbage;
        private boolean hasSwimmingpoll;
        private boolean hasGarden;


        HouseBuilder(String foundation, String structure, String roof){
            this.foundation = foundation;
            this.structure = structure;
            this.roof = roof;
        }

        public HouseBuilder setHasGarbage(boolean hasGarbage){
            this.hasGarbage = hasGarbage;
            return this;
        }

        public HouseBuilder setHasSwimmingpoll(boolean hasSwimmingpoll){
            this.hasSwimmingpoll = hasSwimmingpoll;
            return this;
        }

        public HouseBuilder setHasGarden(boolean hasGarden){
            this.hasGarden = hasGarden;
            return this;
        }

        public House build(){
            return new House(this);
        }

    }
}
