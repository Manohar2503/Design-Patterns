package com.Loki.Java_Practice.CreationalPattern.BuilderPattern.Problem;

public class House {
    private String foundation;
    private String structure;
    private String roof;
    private boolean hasGarbage;
    private boolean hasSwimmingpoll;
    private boolean hasGarden;

    House(String foundation, String structure, String roof,boolean hasGarbage, boolean hasSwimmingpoll, boolean hasGarden){
        this.foundation = foundation;
        this.structure = structure;
        this.roof = roof;
        this.hasGarbage = hasGarbage;
        this.hasSwimmingpoll= hasSwimmingpoll;
        this.hasGarden = hasGarden;
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
}
